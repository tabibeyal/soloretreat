package com.homeretreat.planner.service

import android.content.Context
import android.media.MediaPlayer
import com.homeretreat.planner.R
import dagger.hilt.android.qualifiers.ApplicationContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class BellManager @Inject constructor(
    @param:ApplicationContext private val context: Context
) {
    private var player: MediaPlayer? = null

    fun playStartBell() {
        playBell(R.raw.bell_start)
    }

    fun playEndBell() {
        playBell(R.raw.bell_end)
    }

    private fun playBell(resourceId: Int) {
        try {
            release()
            player = MediaPlayer.create(context, resourceId)
            player?.setOnCompletionListener { release() }
            player?.start()
        } catch (e: Exception) {
            e.printStackTrace()
        }
    }

    fun release() {
        try {
            player?.stop()
            player?.release()
        } catch (e: Exception) {
            e.printStackTrace()
        }
        player = null
    }

}