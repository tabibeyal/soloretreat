package com.homeretreat.planner.service

import android.app.NotificationManager
import android.content.Context
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.homeretreat.planner.data.model.Phase
import com.homeretreat.planner.data.repository.RetreatRepository
import com.homeretreat.planner.data.repository.ScheduleRepository
import com.homeretreat.planner.util.Constants
import com.homeretreat.planner.util.NotificationHelper
import com.homeretreat.planner.util.TimeUtils
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.flow.firstOrNull
import java.time.LocalTime

@HiltWorker
class RetreatNotificationWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters,
    private val retreatRepository: RetreatRepository,
    private val scheduleRepository: ScheduleRepository,
    private val notificationHelper: NotificationHelper
) : CoroutineWorker(context, params) {

    override suspend fun doWork(): Result {
        val config = retreatRepository.getConfig().firstOrNull() ?: return Result.success()
        if (config.phase != Phase.IN_PROGRESS) return Result.success()
        val startDate = config.startDate ?: return Result.success()
        val endDate = config.endDate ?: return Result.success()

        val dayOfRetreat = TimeUtils.dayOfRetreat(startDate)
        val totalDays = TimeUtils.daysBetween(startDate, endDate)
        val now = LocalTime.now()
        val dayOffset = dayOfRetreat - 1
        val nextBlock = scheduleRepository.getNextBlock(dayOffset, now)

        val notification = notificationHelper.buildOngoingRetreatNotification(
            dayOfRetreat.coerceAtLeast(1),
            totalDays.coerceAtLeast(1),
            nextBlock?.activityType?.displayName,
            nextBlock?.startTime?.let { TimeUtils.formatTime(it) }
        )
        val manager = applicationContext.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
        manager.notify(Constants.NOTIFICATION_ID_SERVICE, notification)
        return Result.success()
    }
}
