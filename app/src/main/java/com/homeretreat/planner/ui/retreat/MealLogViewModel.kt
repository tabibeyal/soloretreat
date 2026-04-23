package com.homeretreat.planner.ui.retreat

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.homeretreat.planner.data.local.entity.MealLog
import com.homeretreat.planner.data.repository.MealLogRepository
import com.homeretreat.planner.util.TimeUtils
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.launch
import java.time.LocalDate
import java.time.LocalTime
import javax.inject.Inject

@HiltViewModel
class MealLogViewModel @Inject constructor(
    private val mealLogRepository: MealLogRepository
) : ViewModel() {

    data class MealLogState(
        val log: MealLog? = null,
        val mealLogged: Boolean = false,
        val cutoffApproaching: Boolean = false
    )

    private val _state = MutableStateFlow(MealLogState())
    val state: StateFlow<MealLogState> = _state.asStateFlow()

    private val today = LocalDate.now()

    init {
        viewModelScope.launch {
            mealLogRepository.getLogForDateFlow(today).collect { log ->
                _state.value = _state.value.copy(
                    log = log,
                    mealLogged = log?.lastMealTime != null,
                    cutoffApproaching = TimeUtils.isMealCutoffApproaching()
                )
            }
        }
    }

    fun logMeal() {
        val now = LocalTime.now()
        val beforeNoon = now.isBefore(LocalTime.of(12, 0))

        viewModelScope.launch {
            val existing = mealLogRepository.getLogForDate(today)
            val log = MealLog(
                date = today,
                lastMealTime = now,
                beforeNoon = beforeNoon,
                cutoffReminderShown = existing?.cutoffReminderShown ?: false
            )
            mealLogRepository.insert(log)
        }
    }
}