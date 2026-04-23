package com.homeretreat.planner

import android.app.Application
import android.app.NotificationChannel
import android.app.NotificationManager
import android.os.Build
import androidx.hilt.work.HiltWorkerFactory
import com.homeretreat.planner.util.Constants
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject

@HiltAndroidApp
class HomeRetreatApplication : Application(), androidx.work.Configuration.Provider {

    @Inject lateinit var workerFactory: HiltWorkerFactory

    override val workManagerConfiguration: androidx.work.Configuration
        get() = androidx.work.Configuration.Builder()
            .setWorkerFactory(workerFactory)
            .build()

    override fun onCreate() {
        super.onCreate()
        
        // Ensure WorkManager is initialized.
        // If it was already initialized via Configuration.Provider (auto-detection), 
        // initialize() will be a no-op if we check first or just let it be.
        // Note: WorkManager.initialize throws if called twice.
        try {
            androidx.work.WorkManager.initialize(this, workManagerConfiguration)
        } catch (e: IllegalStateException) {
            // Already initialized, which is fine.
        }

        createNotificationChannels()
    }

    private fun createNotificationChannels() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.O) {
            val channels = listOf(
                NotificationChannel(
                    Constants.CHANNEL_RETREAT_SERVICE,
                    "Retreat Session",
                    NotificationManager.IMPORTANCE_LOW
                ).apply {
                    description = "Ongoing retreat session notifications"
                    setShowBadge(false)
                },
                NotificationChannel(
                    Constants.CHANNEL_BLOCK_REMINDER,
                    "Schedule Reminders",
                    NotificationManager.IMPORTANCE_HIGH
                ).apply {
                    description = "Reminders for upcoming meditation blocks"
                },
                NotificationChannel(
                    Constants.CHANNEL_MEAL_CUTOFF,
                    "Meal Cutoff",
                    NotificationManager.IMPORTANCE_HIGH
                ).apply {
                    description = "Noon meal cutoff reminders"
                },
                NotificationChannel(
                    Constants.CHANNEL_PRECEPT_REMINDER,
                    "Precept Reminders",
                    NotificationManager.IMPORTANCE_DEFAULT
                ).apply {
                    description = "Morning and midday precept reminders"
                },
                NotificationChannel(
                    Constants.CHANNEL_TIMER_SERVICE,
                    "Meditation Timer",
                    NotificationManager.IMPORTANCE_LOW
                ).apply {
                    description = "Ongoing meditation timer session"
                    setShowBadge(false)
                    setSound(null, null)
                }
            )

            val manager = getSystemService(NotificationManager::class.java)
            manager.createNotificationChannels(channels)
        }
    }
}