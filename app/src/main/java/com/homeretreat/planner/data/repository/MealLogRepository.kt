package com.homeretreat.planner.data.repository

import com.homeretreat.planner.data.local.dao.MealLogDao
import com.homeretreat.planner.data.local.entity.MealLog
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MealLogRepository @Inject constructor(
    private val mealLogDao: MealLogDao
) {
    suspend fun getLogForDate(date: LocalDate): MealLog? = mealLogDao.getLogForDate(date)
    fun getLogForDateFlow(date: LocalDate): Flow<MealLog?> = mealLogDao.getLogForDateFlow(date)
    suspend fun getLogsForRange(start: LocalDate, end: LocalDate): List<MealLog> = mealLogDao.getLogsForRange(start, end)
    fun getLogsForRangeFlow(start: LocalDate, end: LocalDate): Flow<List<MealLog>> = mealLogDao.getLogsForRangeFlow(start, end)
    suspend fun countOnTimeMeals(start: LocalDate, end: LocalDate): Int = mealLogDao.countOnTimeMeals(start, end)
    suspend fun countLateMeals(start: LocalDate, end: LocalDate): Int = mealLogDao.countLateMeals(start, end)
    suspend fun insert(log: MealLog) = mealLogDao.insert(log)
    suspend fun update(log: MealLog) = mealLogDao.update(log)
    suspend fun markReminderShown(date: LocalDate) = mealLogDao.markReminderShown(date)
    suspend fun deleteForRange(start: LocalDate, end: LocalDate) = mealLogDao.deleteForRange(start, end)
}