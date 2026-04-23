package com.homeretreat.planner.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import java.time.LocalDate
import java.time.LocalTime

@Entity(tableName = "meal_logs")
data class MealLog(
    @PrimaryKey val date: LocalDate,
    val lastMealTime: LocalTime? = null,
    val beforeNoon: Boolean? = null,
    val cutoffReminderShown: Boolean = false
)