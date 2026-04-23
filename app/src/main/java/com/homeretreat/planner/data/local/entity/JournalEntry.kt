package com.homeretreat.planner.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.Instant
import java.util.UUID

@Entity(tableName = "journal_entries")
data class JournalEntry(
    @PrimaryKey val id: String = UUID.randomUUID().toString(),
    val createdAt: Instant,
    val entryText: String,
    val tags: String = ""
) {
    fun tagList(): List<String> = tags.split(",").map { it.trim() }.filter { it.isNotEmpty() }
}