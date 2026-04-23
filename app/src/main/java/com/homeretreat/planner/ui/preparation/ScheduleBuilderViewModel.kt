package com.homeretreat.planner.ui.preparation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.homeretreat.planner.data.local.entity.ScheduleBlock
import com.homeretreat.planner.data.model.ActivityType
import com.homeretreat.planner.data.repository.RetreatRepository
import com.homeretreat.planner.data.repository.ScheduleRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import java.time.LocalTime
import javax.inject.Inject

@HiltViewModel
class ScheduleBuilderViewModel @Inject constructor(
    private val scheduleRepository: ScheduleRepository,
    retreatRepository: RetreatRepository
) : ViewModel() {

    var totalDays: Int = 3
        private set

    val blocks: StateFlow<List<ScheduleBlock>> = scheduleRepository.getAllBlocks()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    private val _validationResult = MutableStateFlow<ScheduleRepository.ScheduleValidationResult?>(null)
    val validationResult: StateFlow<ScheduleRepository.ScheduleValidationResult?> = _validationResult

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error

    init {
        viewModelScope.launch {
            val config = retreatRepository.getConfigSync()
            config?.startDate?.let { start ->
                config.endDate?.let { end ->
                    totalDays = java.time.Duration.between(
                        start.atStartOfDay(),
                        end.plusDays(1).atStartOfDay()
                    ).toDays().toInt()
                }
            }
        }
        validateSchedule()
    }

    fun addBlock(dayOffset: Int, activityType: ActivityType, startTime: LocalTime, endTime: LocalTime, notes: String?) {
        viewModelScope.launch {
            val block = ScheduleBlock(
                dayOffset = dayOffset,
                startTime = startTime,
                endTime = endTime,
                activityType = activityType,
                notes = notes
            )
            val success = scheduleRepository.addBlock(block)
            if (success) {
                _error.value = null
                validateSchedule()
            } else {
                _error.value = "Cannot add block: Overlap with existing block or invalid time range."
            }
        }
    }

    fun clearError() {
        _error.value = null
    }

    fun removeBlock(block: ScheduleBlock) {
        viewModelScope.launch {
            scheduleRepository.deleteBlock(block)
            validateSchedule()
        }
    }

    private fun validateSchedule() {
        viewModelScope.launch {
            _validationResult.value = scheduleRepository.validateSchedule()
        }
    }
}