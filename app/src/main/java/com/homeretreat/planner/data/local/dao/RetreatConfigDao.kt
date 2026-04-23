package com.homeretreat.planner.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.homeretreat.planner.data.local.entity.RetreatConfig
import com.homeretreat.planner.data.model.Phase
import kotlinx.coroutines.flow.Flow

@Dao
interface RetreatConfigDao {
    @Query("SELECT * FROM retreat_config WHERE id = 1")
    fun getConfig(): Flow<RetreatConfig?>

    @Query("SELECT * FROM retreat_config WHERE id = 1")
    suspend fun getConfigSync(): RetreatConfig?

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insert(config: RetreatConfig)

    @Update
    suspend fun update(config: RetreatConfig)

    @Query("UPDATE retreat_config SET phase = :phase WHERE id = 1")
    suspend fun updatePhase(phase: Phase)

    @Query("UPDATE retreat_config SET allTalksDownloaded = :downloaded WHERE id = 1")
    suspend fun updateTalksDownloaded(downloaded: Boolean)

    @Query("DELETE FROM retreat_config WHERE id = 1")
    suspend fun delete()
}