package com.soloretreat.ui.retreat

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.soloretreat.data.model.Precept
import com.soloretreat.data.model.allPrecepts
import com.soloretreat.data.repository.PreceptRepository
import com.soloretreat.data.repository.RetreatRepository
import com.soloretreat.util.TimeUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import java.time.LocalDate
import javax.inject.Inject

@HiltViewModel
class PreceptTrackerViewModel @Inject constructor(
    private val preceptRepository: PreceptRepository,
    private val retreatRepository: RetreatRepository
) : ViewModel() {

    data class PreceptTrackerState(
        val precepts: List<Precept> = allPrecepts,
        val observances: List<Boolean?> = List(8) { null },
        val eveningReflection: String = "",
        val observanceRate: Float = 0f,
        val dayNumber: Int = 1,
        val currentDate: LocalDate = LocalDate.now()
    )

    private val _state = MutableStateFlow(PreceptTrackerState())
    val state: StateFlow<PreceptTrackerState> = _state.asStateFlow()

    init {
        viewModelScope.launch {
            val config = retreatRepository.getConfig().firstOrNull()
            val startDate = config?.startDate
            val dayNum = if (startDate != null) TimeUtils.dayOfRetreat(startDate) else 1

            _state.value = _state.value.copy(dayNumber = dayNum)

            val today = LocalDate.now()
            preceptRepository.getLogForDate(today).collect { log ->
                val observances = log?.observanceList() ?: List(8) { null }
                val rate = log?.observanceRate() ?: 0f
                _state.value = _state.value.copy(
                    observances = observances,
                    observanceRate = rate,
                    eveningReflection = log?.eveningReflection ?: "",
                    currentDate = today
                )
            }
        }
    }

    fun updatePrecept(preceptNumber: Int, observed: Boolean) {
        viewModelScope.launch {
            preceptRepository.updatePreceptObservance(
                _state.value.currentDate,
                preceptNumber,
                observed
            )
        }
    }

    fun updateReflection(text: String) {
        _state.value = _state.value.copy(eveningReflection = text)
        viewModelScope.launch {
            preceptRepository.updateEveningReflection(_state.value.currentDate, text)
        }
    }
}