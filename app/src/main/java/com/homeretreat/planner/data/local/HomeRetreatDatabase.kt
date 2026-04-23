package com.homeretreat.planner.data.local

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.homeretreat.planner.data.local.dao.ChecklistItemDao
import com.homeretreat.planner.data.local.dao.DhammaTalkDao
import com.homeretreat.planner.data.local.dao.JournalEntryDao
import com.homeretreat.planner.data.local.dao.MealLogDao
import com.homeretreat.planner.data.local.dao.MeditationSessionDao
import com.homeretreat.planner.data.local.dao.PreceptLogDao
import com.homeretreat.planner.data.local.dao.RetreatConfigDao
import com.homeretreat.planner.data.local.dao.ScheduleBlockDao
import com.homeretreat.planner.data.local.entity.ChecklistItem
import com.homeretreat.planner.data.local.entity.DhammaTalk
import com.homeretreat.planner.data.local.entity.JournalEntry
import com.homeretreat.planner.data.local.entity.MealLog
import com.homeretreat.planner.data.local.entity.MeditationSession
import com.homeretreat.planner.data.local.entity.PreceptLog
import com.homeretreat.planner.data.local.entity.RetreatConfig
import com.homeretreat.planner.data.local.entity.ScheduleBlock

@Database(
    entities = [
        RetreatConfig::class,
        ScheduleBlock::class,
        DhammaTalk::class,
        PreceptLog::class,
        MeditationSession::class,
        MealLog::class,
        JournalEntry::class,
        ChecklistItem::class
    ],
    version = 1,
    exportSchema = true
)
@TypeConverters(Converters::class)
abstract class HomeRetreatDatabase : RoomDatabase() {
    abstract fun retreatConfigDao(): RetreatConfigDao
    abstract fun scheduleBlockDao(): ScheduleBlockDao
    abstract fun dhammaTalkDao(): DhammaTalkDao
    abstract fun preceptLogDao(): PreceptLogDao
    abstract fun meditationSessionDao(): MeditationSessionDao
    abstract fun mealLogDao(): MealLogDao
    abstract fun journalEntryDao(): JournalEntryDao
    abstract fun checklistItemDao(): ChecklistItemDao
}