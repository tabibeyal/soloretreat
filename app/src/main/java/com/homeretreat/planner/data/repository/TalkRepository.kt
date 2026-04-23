package com.homeretreat.planner.data.repository

import android.content.Context
import android.os.Environment
import com.homeretreat.planner.data.local.dao.DhammaTalkDao
import com.homeretreat.planner.data.local.entity.DhammaTalk
import com.homeretreat.planner.data.model.DownloadStatus
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import kotlinx.coroutines.withContext
import kotlinx.serialization.json.Json
import java.io.File
import java.net.URL
import javax.inject.Inject
import javax.inject.Singleton

private val catalogJson = Json { 
    ignoreUnknownKeys = true 
    coerceInputValues = true
    encodeDefaults = true
}

@Singleton
class TalkRepository @Inject constructor(
    private val talkDao: DhammaTalkDao,
    @ApplicationContext private val context: Context
) {
    fun getAllTalks(): Flow<List<DhammaTalk>> = talkDao.getAllTalks()

    suspend fun getDownloadedTalks(): List<DhammaTalk> = talkDao.getDownloadedTalks()

    suspend fun getTalkById(id: String): DhammaTalk? = talkDao.getTalkById(id)

    suspend fun areAllTalksDownloaded(): Boolean {
        return talkDao.countPendingDownloads() == 0
    }

    suspend fun refreshCatalog() = withContext(kotlinx.coroutines.Dispatchers.IO) {
        android.util.Log.d("TalkRepository", "Refreshing catalog...")
        importCatalogFromAssets()
        // Artificial delay to show the refresh animation
        kotlinx.coroutines.delay(1000)
    }

    suspend fun importCatalogFromAssets() {
        android.util.Log.d("TalkRepository", "Importing from assets...")
        try {
            val jsonString = context.assets.open("talks_catalog.json")
                .bufferedReader()
                .use { it.readText() }

            val catalog = catalogJson.decodeFromString<List<DhammaTalk>>(jsonString)
            android.util.Log.d("TalkRepository", "Decoded ${catalog.size} talks from assets")
            
            talkDao.upsertPreservingStatus(catalog)
            android.util.Log.d("TalkRepository", "Catalog updated successfully")
        } catch (e: Exception) {
            android.util.Log.e("TalkRepository", "Asset import failed, using defaults", e)
            insertDefaultCatalog()
        }
    }

    suspend fun updateDownloadStatus(id: String, status: DownloadStatus, localPath: String?) {
        talkDao.updateDownloadStatus(id, status, localPath)
    }

    fun getTalksDirectory(): File {
        val dir = File(context.getExternalFilesDir(Environment.DIRECTORY_MUSIC), "talks")
        if (!dir.exists()) dir.mkdirs()
        return dir
    }

    private suspend fun insertDefaultCatalog() {
        android.util.Log.d("TalkRepository", "Inserting default catalog...")
        val defaults = listOf(
            DhammaTalk(
                id = "thanissaro_basics_01",
                title = "Strength from the Basics",
                teacher = "Thanissaro Bhikkhu",
                remoteUrl = "https://www.dhammatalks.org/Archive/basics_collection/01%20Strength%20from%20the%20Basics.mp3",
                durationMinutes = 15,
                category = "Basics",
                description = "First talk in the Basics collection, remastered for clarity."
            ),
            DhammaTalk(
                id = "thanissaro_basics_02",
                title = "Basics",
                teacher = "Thanissaro Bhikkhu",
                remoteUrl = "https://www.dhammatalks.org/Archive/basics_collection/02%20Basics.mp3",
                durationMinutes = 12,
                category = "Basics",
                description = "Foundational instructions for meditation practice."
            )
        )
        talkDao.upsertPreservingStatus(defaults)
    }
}
