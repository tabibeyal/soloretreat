package com.soloretreat.service

import android.app.AlarmManager
import android.app.PendingIntent
import android.content.Context
import android.content.Intent
import android.os.Build
import androidx.work.ExistingPeriodicWorkPolicy
import androidx.work.PeriodicWorkRequestBuilder
import androidx.work.WorkManager
import com.soloretreat.data.local.entity.RetreatConfig
import com.soloretreat.data.repository.ScheduleRepository
import com.soloretreat.util.Constants
import com.soloretreat.util.TimeUtils
import dagger.hilt.android.qualifiers.ApplicationContext
import java.time.LocalDate
import java.time.LocalDateTime
import java.time.LocalTime
import java.time.ZoneId
import java.util.concurrent.TimeUnit
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetreatAlarmScheduler @Inject constructor(
    @ApplicationContext private val context: Context,
    private val scheduleRepository: ScheduleRepository
) {
    private val alarmManager = context.getSystemService(Context.ALARM_SERVICE) as AlarmManager

    suspend fun scheduleForRetreat(config: RetreatConfig) {
        cancelAll()
        val startDate = config.startDate ?: return
        val endDate = config.endDate ?: return
        val today = LocalDate.now()
        if (today.isAfter(endDate)) return

        scheduleNextBlockAlarm(startDate, endDate)
        scheduleMealCutoffAlarms()
        scheduleDailyRollover()
        enqueueNotificationWorker()
    }

    suspend fun rescheduleNextBlock(startDate: LocalDate, endDate: LocalDate) {
        scheduleNextBlockAlarm(startDate, endDate)
    }

    fun cancelAll() {
        listOf(
            Constants.ALARM_REQUEST_BLOCK,
            Constants.ALARM_REQUEST_MEAL_WARN,
            Constants.ALARM_REQUEST_MEAL_POST_NOON,
            Constants.ALARM_REQUEST_DAILY_ROLLOVER
        ).forEach { requestCode ->
            val intent = Intent(context, RetreatAlarmReceiver::class.java)
            val pi = PendingIntent.getBroadcast(
                context, requestCode, intent,
                PendingIntent.FLAG_NO_CREATE or PendingIntent.FLAG_IMMUTABLE
            )
            if (pi != null) {
                alarmManager.cancel(pi)
                pi.cancel()
            }
        }
        WorkManager.getInstance(context).cancelUniqueWork(Constants.WORK_NAME_NOTIFICATION_REFRESH)
    }

    private suspend fun scheduleNextBlockAlarm(startDate: LocalDate, endDate: LocalDate) {
        val now = LocalDateTime.now()
        val today = now.toLocalDate()
        if (today.isAfter(endDate)) return

        val dayOffset = TimeUtils.dayOfRetreat(startDate) - 1
        val todayBlocks = scheduleRepository.getBlocksForDay(dayOffset)
        val nowTime = now.toLocalTime()

        val nextToday = todayBlocks
            .filter { it.startTime.isAfter(nowTime) }
            .minByOrNull { it.startTime }

        val triggerDateTime = if (nextToday != null) {
            LocalDateTime.of(today, nextToday.startTime)
        } else {
            val tomorrow = today.plusDays(1)
            if (tomorrow.isAfter(endDate)) return
            val tomorrowDayOffset = dayOffset + 1
            val tomorrowBlocks = scheduleRepository.getBlocksForDay(tomorrowDayOffset)
            val firstTomorrow = tomorrowBlocks.minByOrNull { it.startTime } ?: return
            LocalDateTime.of(tomorrow, firstTomorrow.startTime)
        }

        scheduleAlarm(
            requestCode = Constants.ALARM_REQUEST_BLOCK,
            action = Constants.ACTION_BLOCK_ALARM,
            triggerAtMillis = triggerDateTime.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()
        )
    }

    private fun scheduleMealCutoffAlarms() {
        val now = LocalDateTime.now()
        val today = now.toLocalDate()

        val warnTime = LocalDateTime.of(today, LocalTime.of(11, 30))
        val warnTarget = if (warnTime.isAfter(now)) warnTime else warnTime.plusDays(1)
        scheduleAlarm(
            requestCode = Constants.ALARM_REQUEST_MEAL_WARN,
            action = Constants.ACTION_MEAL_CUTOFF_WARN,
            triggerAtMillis = warnTarget.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()
        )

        val postNoon = LocalDateTime.of(today, LocalTime.of(12, 15))
        val postNoonTarget = if (postNoon.isAfter(now)) postNoon else postNoon.plusDays(1)
        scheduleAlarm(
            requestCode = Constants.ALARM_REQUEST_MEAL_POST_NOON,
            action = Constants.ACTION_MEAL_CUTOFF_POST_NOON,
            triggerAtMillis = postNoonTarget.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()
        )
    }

    private fun scheduleDailyRollover() {
        val now = LocalDateTime.now()
        val tomorrowStart = now.toLocalDate().plusDays(1).atStartOfDay().plusMinutes(1)
        scheduleAlarm(
            requestCode = Constants.ALARM_REQUEST_DAILY_ROLLOVER,
            action = Constants.ACTION_DAILY_ROLLOVER,
            triggerAtMillis = tomorrowStart.atZone(ZoneId.systemDefault()).toInstant().toEpochMilli()
        )
    }

    private fun scheduleAlarm(requestCode: Int, action: String, triggerAtMillis: Long) {
        val intent = Intent(context, RetreatAlarmReceiver::class.java).apply {
            this.action = action
        }
        val pi = PendingIntent.getBroadcast(
            context, requestCode, intent,
            PendingIntent.FLAG_UPDATE_CURRENT or PendingIntent.FLAG_IMMUTABLE
        )
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            alarmManager.setAndAllowWhileIdle(AlarmManager.RTC_WAKEUP, triggerAtMillis, pi)
        } else {
            alarmManager.set(AlarmManager.RTC_WAKEUP, triggerAtMillis, pi)
        }
    }

    private fun enqueueNotificationWorker() {
        val request = PeriodicWorkRequestBuilder<RetreatNotificationWorker>(
            15, TimeUnit.MINUTES
        ).build()
        WorkManager.getInstance(context).enqueueUniquePeriodicWork(
            Constants.WORK_NAME_NOTIFICATION_REFRESH,
            ExistingPeriodicWorkPolicy.KEEP,
            request
        )
    }
}
