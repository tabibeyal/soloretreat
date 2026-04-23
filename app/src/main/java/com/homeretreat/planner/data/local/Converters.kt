package com.homeretreat.planner.data.local

import androidx.room.TypeConverter
import com.homeretreat.planner.data.model.ActivityType
import com.homeretreat.planner.data.model.DownloadStatus
import com.homeretreat.planner.data.model.Phase
import java.time.Instant
import java.time.LocalDate
import java.time.LocalTime

class Converters {
    // LocalDate
    @TypeConverter
    fun fromLocalDate(date: LocalDate?): Long? = date?.toEpochDay()

    @TypeConverter
    fun toLocalDate(epochDay: Long?): LocalDate? = epochDay?.let { LocalDate.ofEpochDay(it) }

    // LocalTime
    @TypeConverter
    fun fromLocalTime(time: LocalTime?): Int? = time?.toSecondOfDay()

    @TypeConverter
    fun toLocalTime(seconds: Int?): LocalTime? = seconds?.let { LocalTime.ofSecondOfDay(it.toLong()) }

    // Instant
    @TypeConverter
    fun fromInstant(instant: Instant?): Long? = instant?.toEpochMilli()

    @TypeConverter
    fun toInstant(millis: Long?): Instant? = millis?.let { Instant.ofEpochMilli(it) }

    // Phase enum
    @TypeConverter
    fun fromPhase(phase: Phase): String = phase.name

    @TypeConverter
    fun toPhase(name: String): Phase = Phase.valueOf(name)

    // ActivityType enum
    @TypeConverter
    fun fromActivityType(type: ActivityType): String = type.name

    @TypeConverter
    fun toActivityType(name: String): ActivityType = ActivityType.valueOf(name)

    // DownloadStatus enum
    @TypeConverter
    fun fromDownloadStatus(status: DownloadStatus): String = status.name

    @TypeConverter
    fun toDownloadStatus(name: String): DownloadStatus = DownloadStatus.valueOf(name)
}