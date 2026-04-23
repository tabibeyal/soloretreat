package com.homeretreat.planner.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.homeretreat.planner.data.local.entity.MealLog
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

@Dao
interface MealLogDao {
    @Query("SELECT * FROM meal_logs WHERE date = :date")
    suspend fun getLogForDate(date: LocalDate): MealLog?

    @Query("SELECT * FROM meal_logs WHERE date = :date")
    fun getLogForDateFlow(date: LocalDate): Flow<MealLog?>

    @Query("SELECT * FROM meal_logs WHERE date BETWEEN :start AND :end ORDER BY date")
    suspend fun getLogsForRange(start: LocalDate, end: LocalDate): List<MealLog>

    @Query("SELECT * FROM meal_logs WHERE date BETWEEN :start AND :end ORDER BY date")
    fun getLogsForRangeFlow(start: LocalDate, end: LocalDate): Flow<List<MealLog>>

    @Query("SELECT COUNT(*) FROM meal_logs WHERE date BETWEEN :start AND :end AND beforeNoon = 1")
    suspend fun countOnTimeMeals(start: LocalDate, end: LocalDate): Int

    @Query("SELECT COUNT(*) FROM meal_logs WHERE date BETWEEN :start AND :end AND beforeNoon = 0")
    suspend fun countLateMeals(start: LocalDate, end: LocalDate): Int

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(log: MealLog)

    @Update
    suspend fun update(log: MealLog)

    @Query("UPDATE meal_logs SET cutoffReminderShown = 1 WHERE date = :date")
    suspend fun markReminderShown(date: LocalDate)

    @Query("DELETE FROM meal_logs WHERE date BETWEEN :start AND :end")
    suspend fun deleteForRange(start: LocalDate, end: LocalDate)

    @Query("DELETE FROM meal_logs")
    suspend fun deleteAll()
}