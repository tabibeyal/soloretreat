package com.homeretreat.planner.ui.retreat

import androidx.lifecycle.SavedStateHandle
import androidx.lifecycle.ViewModel
import com.homeretreat.planner.data.model.ActivityType
import com.homeretreat.planner.service.TimerEngine
import com.homeretreat.planner.util.TimerFormatter
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.StateFlow
import javax.inject.Inject

@HiltViewModel
class TimerViewModel @Inject constructor(
    private val engine: TimerEngine,
    savedStateHandle: SavedStateHandle
) : ViewModel() {

    private val initialActivityType: String? = savedStateHandle["activityType"]

    val state: StateFlow<TimerEngine.TimerState> = engine.state

    init {
        val cur = engine.state.value
        if (cur.isComplete) engine.abandon()
        engine.setActivityLabel(getActivityLabel(initialActivityType))
    }

    fun selectDuration(minutes: Int) = engine.selectDuration(minutes)
    fun startTimer() = engine.start()
    fun togglePause() = engine.togglePause()
    fun abandonSession() = engine.abandon()

    private fun getActivityLabel(type: String?): String {
        return try {
            if (type == null) "Sitting Meditation"
            else when (val activity = ActivityType.valueOf(type)) {
                ActivityType.SITTING, ActivityType.WALKING -> activity.displayName
                else -> "Sitting Meditation"
            }
        } catch (_: Exception) {
            "Sitting Meditation"
        }
    }

    companion object {
        fun formatSeconds(totalSeconds: Long): String = TimerFormatter.formatSeconds(totalSeconds)
    }
}
