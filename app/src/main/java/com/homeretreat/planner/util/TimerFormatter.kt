package com.homeretreat.planner.util

import java.util.Locale

object TimerFormatter {
    fun formatSeconds(totalSeconds: Long): String {
        val mins = totalSeconds / 60
        val secs = totalSeconds % 60
        return String.format(Locale.US, "%02d:%02d", mins, secs)
    }
}
