package com.soloretreat.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.soloretreat.data.local.entity.JournalEntry
import kotlinx.coroutines.flow.Flow
import java.time.Instant

@Dao
interface JournalEntryDao {
    @Query("SELECT * FROM journal_entries ORDER BY createdAt DESC")
    fun getAllEntries(): Flow<List<JournalEntry>>

    @Query("SELECT * FROM journal_entries WHERE createdAt BETWEEN :start AND :end ORDER BY createdAt DESC")
    suspend fun getEntriesForRange(start: Instant, end: Instant): List<JournalEntry>

    @Query("SELECT * FROM journal_entries WHERE createdAt BETWEEN :start AND :end ORDER BY createdAt DESC")
    fun getEntriesForRangeFlow(start: Instant, end: Instant): Flow<List<JournalEntry>>

    @Query("SELECT * FROM journal_entries WHERE id = :id")
    suspend fun getEntryById(id: String): JournalEntry?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(entry: JournalEntry)

    @Update
    suspend fun update(entry: JournalEntry)

    @Delete
    suspend fun delete(entry: JournalEntry)

    @Query("DELETE FROM journal_entries WHERE id = :id")
    suspend fun deleteById(id: String)

    @Query("DELETE FROM journal_entries")
    suspend fun deleteAll()
}