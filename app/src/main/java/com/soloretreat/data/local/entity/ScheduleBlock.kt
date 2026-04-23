package com.soloretreat.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.soloretreat.data.model.ActivityType
import java.time.LocalTime
import java.util.UUID

@Entity(tableName = "schedule_blocks")
data class ScheduleBlock(
    @PrimaryKey val id: String = UUID.randomUUID().toString(),
    val retreatId: Int = 1,
    val dayOffset: Int,
    val startTime: LocalTime,
    val endTime: LocalTime,
    val activityType: ActivityType,
    val dhammaTalkId: String? = null,
    val notes: String? = null
)