package com.soloretreat.service

import android.content.BroadcastReceiver
import android.content.Context
import android.content.Intent
import com.soloretreat.data.model.Phase
import com.soloretreat.data.repository.RetreatRepository
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.SupervisorJob
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class BootCompletedReceiver : BroadcastReceiver() {

    @Inject lateinit var retreatRepository: RetreatRepository
    @Inject lateinit var scheduler: RetreatAlarmScheduler

    private val scope = CoroutineScope(SupervisorJob() + Dispatchers.IO)

    override fun onReceive(context: Context, intent: Intent) {
        if (intent.action != Intent.ACTION_BOOT_COMPLETED) return
        val pending = goAsync()
        scope.launch {
            try {
                val config = retreatRepository.getConfig().firstOrNull()
                if (config?.phase == Phase.IN_PROGRESS) {
                    scheduler.scheduleForRetreat(config)
                }
            } finally {
                pending.finish()
            }
        }
    }
}
