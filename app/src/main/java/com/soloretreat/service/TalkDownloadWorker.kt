package com.soloretreat.service

import android.app.DownloadManager
import android.content.Context
import android.net.Uri
import android.util.Log
import androidx.hilt.work.HiltWorker
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.soloretreat.data.model.DownloadStatus
import com.soloretreat.data.repository.TalkRepository
import dagger.assisted.Assisted
import dagger.assisted.AssistedInject
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.delay
import kotlinx.coroutines.withContext
import java.io.File

@HiltWorker
class TalkDownloadWorker @AssistedInject constructor(
    @Assisted context: Context,
    @Assisted params: WorkerParameters,
    private val talkRepository: TalkRepository
) : CoroutineWorker(context, params) {

    companion object {
        const val KEY_TALK_ID = "talk_id"
        const val KEY_TALK_URL = "talk_url"
        const val KEY_TALK_TITLE = "talk_title"
    }

    override suspend fun doWork(): Result {
        val talkId = inputData.getString(KEY_TALK_ID) ?: return Result.failure()
        val talkUrl = inputData.getString(KEY_TALK_URL) ?: return Result.failure()
        val talkTitle = inputData.getString(KEY_TALK_TITLE) ?: "unknown"

        return try {
            Log.d("TalkDownloadWorker", "Starting download for talk: $talkTitle ($talkUrl)")
            talkRepository.updateDownloadStatus(talkId, DownloadStatus.IN_PROGRESS, null)
            val localPath = downloadFile(talkUrl, talkTitle)
            if (localPath != null) {
                Log.d("TalkDownloadWorker", "Download successful: $localPath")
                talkRepository.updateDownloadStatus(talkId, DownloadStatus.COMPLETE, localPath)
                Result.success()
            } else {
                Log.e("TalkDownloadWorker", "Download failed for $talkTitle")
                talkRepository.updateDownloadStatus(talkId, DownloadStatus.FAILED, null)
                Result.failure()
            }
        } catch (e: Exception) {
            Log.e("TalkDownloadWorker", "Error in doWork", e)
            talkRepository.updateDownloadStatus(talkId, DownloadStatus.FAILED, null)
            Result.failure()
        }
    }

    private suspend fun downloadFile(url: String, title: String): String? = withContext(Dispatchers.IO) {
        try {
            val fileName = Uri.parse(url).lastPathSegment ?: "${title.replace(" ", "_")}.mp3"
            
            val request = DownloadManager.Request(Uri.parse(url))
                .setTitle(title)
                .setDescription("Downloading Dhamma talk...")
                .setNotificationVisibility(DownloadManager.Request.VISIBILITY_VISIBLE)
                .setDestinationInExternalFilesDir(applicationContext, android.os.Environment.DIRECTORY_MUSIC, "talks/$fileName")
                .setAllowedOverMetered(true)
                .setAllowedOverRoaming(true)

            val downloadManager = applicationContext.getSystemService(Context.DOWNLOAD_SERVICE) as DownloadManager
            val downloadId = downloadManager.enqueue(request)
            Log.d("TalkDownloadWorker", "Enqueued download ID: $downloadId")

            var finished = false
            var success = false
            var lastStatus = -1
            
            while (!finished) {
                val query = DownloadManager.Query().setFilterById(downloadId)
                val cursor = downloadManager.query(query)
                if (cursor.moveToFirst()) {
                    val status = cursor.getInt(cursor.getColumnIndexOrThrow(DownloadManager.COLUMN_STATUS))
                    if (status != lastStatus) {
                        Log.d("TalkDownloadWorker", "Download status changed: $status")
                        lastStatus = status
                    }
                    
                    when (status) {
                        DownloadManager.STATUS_SUCCESSFUL -> {
                            finished = true
                            success = true
                        }
                        DownloadManager.STATUS_FAILED -> {
                            val reason = cursor.getInt(cursor.getColumnIndexOrThrow(DownloadManager.COLUMN_REASON))
                            Log.e("TalkDownloadWorker", "Download failed with reason: $reason")
                            finished = true
                            success = false
                        }
                    }
                } else {
                    Log.e("TalkDownloadWorker", "Cursor is empty for download ID: $downloadId")
                    finished = true
                }
                cursor.close()
                if (!finished) delay(2000)
            }

            if (success) {
                val file = File(applicationContext.getExternalFilesDir(android.os.Environment.DIRECTORY_MUSIC), "talks/$fileName")
                if (file.exists()) file.absolutePath else null
            } else null
        } catch (e: Exception) {
            Log.e("TalkDownloadWorker", "Exception in downloadFile", e)
            null
        }
    }
}
