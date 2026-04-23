package com.homeretreat.planner.data.repository

import com.homeretreat.planner.data.local.dao.JournalEntryDao
import com.homeretreat.planner.data.local.entity.JournalEntry
import kotlinx.coroutines.flow.Flow
import java.time.Instant
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class JournalRepository @Inject constructor(
    private val journalEntryDao: JournalEntryDao
) {
    fun getAllEntries(): Flow<List<JournalEntry>> = journalEntryDao.getAllEntries()

    suspend fun getEntryById(id: String): JournalEntry? = journalEntryDao.getEntryById(id)

    suspend fun createEntry(text: String, tags: String = ""): JournalEntry {
        val entry = JournalEntry(
            createdAt = Instant.now(),
            entryText = text,
            tags = tags
        )
        journalEntryDao.insert(entry)
        return entry
    }

    suspend fun updateEntry(entry: JournalEntry) {
        journalEntryDao.update(entry)
    }

    suspend fun deleteEntry(entry: JournalEntry) {
        journalEntryDao.delete(entry)
    }

    fun getEntriesForRangeFlow(start: Instant, end: Instant): Flow<List<JournalEntry>> =
        journalEntryDao.getEntriesForRangeFlow(start, end)

    suspend fun getEntriesForRange(start: Instant, end: Instant): List<JournalEntry> =
        journalEntryDao.getEntriesForRange(start, end)
}