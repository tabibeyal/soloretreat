package com.soloretreat.data.local.dao

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.soloretreat.data.local.entity.ScheduleBlock
import kotlinx.coroutines.flow.Flow

@Dao
interface ScheduleBlockDao {
    @Query("SELECT * FROM schedule_blocks WHERE retreatId = 1 ORDER BY dayOffset, startTime")
    fun getAllBlocks(): Flow<List<ScheduleBlock>>

    @Query("SELECT * FROM schedule_blocks WHERE retreatId = 1 AND dayOffset = :dayOffset ORDER BY startTime")
    suspend fun getBlocksForDay(dayOffset: Int): List<ScheduleBlock>

    @Query("SELECT * FROM schedule_blocks WHERE retreatId = 1 AND dayOffset = :dayOffset ORDER BY startTime")
    fun getBlocksForDayFlow(dayOffset: Int): Flow<List<ScheduleBlock>>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(block: ScheduleBlock)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(blocks: List<ScheduleBlock>)

    @Update
    suspend fun update(block: ScheduleBlock)

    @Delete
    suspend fun delete(block: ScheduleBlock)

    @Query("DELETE FROM schedule_blocks WHERE retreatId = 1")
    suspend fun deleteAll()

    @Query("SELECT COUNT(*) FROM schedule_blocks WHERE retreatId = 1")
    suspend fun count(): Int
}