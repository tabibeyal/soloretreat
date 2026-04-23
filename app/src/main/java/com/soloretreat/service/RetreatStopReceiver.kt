package com.soloretreat.service

import android.app.NotificationManager
import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.soloretreat.data.model.Phase
import com.soloretreat.data.repository.RetreatRepository
import com.soloretreat.util.Constants
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class RetreatStopReceiver : BroadcastReceiver() {

    @Inject lateinit var retreatRepository: RetreatRepository
    @Inject lateinit var scheduler: RetreatAlarmScheduler

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != Constants.ACTION_STOP_RETREAT) return
        val pending = goAsync()
        scope.launch {
            try {
                retreatRepository.updatePhase(Phase.COMPLETED)
                scheduler.cancelAll()
                val manager = context.getSystemService(Context.NOTIFICATION_SERVICE) as NotificationManager
                manager.cancel(Constants.NOTIFICATION_ID_SERVICE)
            } finally {
                pending.finish()
            }
        }
    }
}
