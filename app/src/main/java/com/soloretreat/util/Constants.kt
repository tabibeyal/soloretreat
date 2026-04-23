package com.soloretreat.util

@Suppress("SpellCheckingInspection")
object Constants {
    const val CHANNEL_RETREAT_SERVICE = "retreat_session_service"
    const val CHANNEL_BLOCK_REMINDER = "block_reminder"
    const val CHANNEL_MEAL_CUTOFF = "meal_cutoff"
    const val CHANNEL_PRECEPT_REMINDER = "precept_reminder"
    const val CHANNEL_TIMER_SERVICE = "timer_session_service"

    const val NOTIFICATION_ID_SERVICE = 1001
    const val NOTIFICATION_ID_BLOCK_REMINDER = 1002
    const val NOTIFICATION_ID_MEAL_CUTOFF = 1003
    const val NOTIFICATION_ID_TIMER = 1004

    const val ACTION_STOP_RETREAT = "com.soloretreat.STOP_RETREAT"
    const val ACTION_STOP_TIMER = "com.soloretreat.STOP_TIMER"
    const val ACTION_BLOCK_TRANSITION = "com.soloretreat.BLOCK_TRANSITION"
    const val ACTION_BLOCK_ALARM = "com.soloretreat.BLOCK_ALARM"
    const val ACTION_MEAL_CUTOFF_WARN = "com.soloretreat.MEAL_CUTOFF_WARN"
    const val ACTION_MEAL_CUTOFF_POST_NOON = "com.soloretreat.MEAL_CUTOFF_POST_NOON"
    const val ACTION_DAILY_ROLLOVER = "com.soloretreat.DAILY_ROLLOVER"

    const val ALARM_REQUEST_BLOCK = 100
    const val ALARM_REQUEST_MEAL_WARN = 101
    const val ALARM_REQUEST_MEAL_POST_NOON = 102
    const val ALARM_REQUEST_DAILY_ROLLOVER = 103
    const val ALARM_REQUEST_STOP = 104
    const val ALARM_REQUEST_TIMER_STOP = 105

    const val WORK_NAME_NOTIFICATION_REFRESH = "retreat_notification_refresh"
}
