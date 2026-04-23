package com.homeretreat.planner.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.homeretreat.planner.data.local.entity.PreceptLog
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate

@Dao
interface PreceptLogDao {
    @Query("SELECT * FROM precept_logs WHERE date = :date")
    suspend fun getLogForDate(date: LocalDate): PreceptLog?

    @Query("SELECT * FROM precept_logs WHERE date = :date")
    fun getLogForDateFlow(date: LocalDate): Flow<PreceptLog?>

    @Query("SELECT * FROM precept_logs WHERE date BETWEEN :start AND :end ORDER BY date")
    suspend fun getLogsForRange(start: LocalDate, end: LocalDate): List<PreceptLog>

    @Query("SELECT * FROM precept_logs WHERE date BETWEEN :start AND :end ORDER BY date")
    fun getLogsForRangeFlow(start: LocalDate, end: LocalDate): Flow<List<PreceptLog>>

    @Query("""
        SELECT AVG(
            (COALESCE(p1,0) + COALESCE(p2,0) + COALESCE(p3,0) + COALESCE(p4,0) +
             COALESCE(p5,0) + COALESCE(p6,0) + COALESCE(p7,0) + COALESCE(p8,0)) / 8.0
        ) FROM precept_logs
        WHERE date BETWEEN :start AND :end
        AND (p1 IS NOT NULL OR p2 IS NOT NULL OR p3 IS NOT NULL OR p4 IS NOT NULL
             OR p5 IS NOT NULL OR p6 IS NOT NULL OR p7 IS NOT NULL OR p8 IS NOT NULL)
    """)
    suspend fun getObservanceRate(start: LocalDate, end: LocalDate): Float?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(log: PreceptLog)

    @Update
    suspend fun update(log: PreceptLog)

    @Query("""
        UPDATE precept_logs 
        SET p1 = CASE WHEN :preceptNum = 1 THEN :observed ELSE p1 END,
            p2 = CASE WHEN :preceptNum = 2 THEN :observed ELSE p2 END,
            p3 = CASE WHEN :preceptNum = 3 THEN :observed ELSE p3 END,
            p4 = CASE WHEN :preceptNum = 4 THEN :observed ELSE p4 END,
            p5 = CASE WHEN :preceptNum = 5 THEN :observed ELSE p5 END,
            p6 = CASE WHEN :preceptNum = 6 THEN :observed ELSE p6 END,
            p7 = CASE WHEN :preceptNum = 7 THEN :observed ELSE p7 END,
            p8 = CASE WHEN :preceptNum = 8 THEN :observed ELSE p8 END
        WHERE date = :date
    """)
    suspend fun updatePrecept(date: LocalDate, preceptNum: Int, observed: Boolean)

    @Query("DELETE FROM precept_logs WHERE date BETWEEN :start AND :end")
    suspend fun deleteForRange(start: LocalDate, end: LocalDate)

    @Query("DELETE FROM precept_logs")
    suspend fun deleteAll()
}