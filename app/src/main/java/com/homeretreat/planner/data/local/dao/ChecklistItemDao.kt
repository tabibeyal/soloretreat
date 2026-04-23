package com.homeretreat.planner.data.local.dao

import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import androidx.room.Update
import com.homeretreat.planner.data.local.entity.ChecklistItem
import com.homeretreat.planner.data.model.Phase
import kotlinx.coroutines.flow.Flow

@Dao
interface ChecklistItemDao {
    @Query("SELECT * FROM checklist_items WHERE phase = :phase ORDER BY sortOrder")
    fun getItemsForPhase(phase: Phase): Flow<List<ChecklistItem>>

    @Query("SELECT * FROM checklist_items WHERE phase = :phase ORDER BY sortOrder")
    suspend fun getItemsForPhaseSync(phase: Phase): List<ChecklistItem>

    @Query("SELECT COUNT(*) FROM checklist_items WHERE phase = :phase AND required = 1 AND completed = 0")
    suspend fun countIncompleteRequired(phase: Phase): Int

    @Query("UPDATE checklist_items SET completed = :completed WHERE id = :id")
    suspend fun updateCompleted(id: String, completed: Boolean)

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    suspend fun insertAll(items: List<ChecklistItem>)

    @Update
    suspend fun update(item: ChecklistItem)

    @Query("DELETE FROM checklist_items")
    suspend fun deleteAll()
}