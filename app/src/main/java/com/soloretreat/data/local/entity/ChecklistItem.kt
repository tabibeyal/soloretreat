package com.soloretreat.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.soloretreat.data.model.Phase
import java.util.UUID

@Entity(tableName = "checklist_items")
data class ChecklistItem(
    @PrimaryKey val id: String = UUID.randomUUID().toString(),
    val phase: Phase = Phase.PREPARING,
    val sortOrder: Int,
    val text: String,
    val completed: Boolean = false,
    val required: Boolean = true
)