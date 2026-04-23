package com.homeretreat.planner.data.repository

import com.homeretreat.planner.data.local.dao.ChecklistItemDao
import com.homeretreat.planner.data.local.dao.DhammaTalkDao
import com.homeretreat.planner.data.local.dao.JournalEntryDao
import com.homeretreat.planner.data.local.dao.MealLogDao
import com.homeretreat.planner.data.local.dao.MeditationSessionDao
import com.homeretreat.planner.data.local.dao.PreceptLogDao
import com.homeretreat.planner.data.local.dao.RetreatConfigDao
import com.homeretreat.planner.data.local.dao.ScheduleBlockDao
import com.homeretreat.planner.data.local.entity.ChecklistItem
import com.homeretreat.planner.data.local.entity.RetreatConfig
import com.homeretreat.planner.data.model.Phase
import kotlinx.coroutines.flow.Flow
import kotlinx.coroutines.flow.firstOrNull
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class RetreatRepository @Inject constructor(
    private val configDao: RetreatConfigDao,
    private val checklistDao: ChecklistItemDao,
    private val scheduleBlockDao: ScheduleBlockDao,
    private val meditationSessionDao: MeditationSessionDao,
    private val journalEntryDao: JournalEntryDao,
    private val mealLogDao: MealLogDao,
    private val preceptLogDao: PreceptLogDao,
    private val dhammaTalkDao: DhammaTalkDao
) {
    fun getConfig(): Flow<RetreatConfig?> = configDao.getConfig()

    suspend fun getConfigSync(): RetreatConfig? = configDao.getConfigSync()

    suspend fun createRetreat(startDate: java.time.LocalDate, endDate: java.time.LocalDate) {
        val config = RetreatConfig(
            startDate = startDate,
            endDate = endDate,
            phase = Phase.PREPARING
        )
        configDao.insert(config)
        populateDefaultChecklist()
    }

    suspend fun updatePhase(phase: Phase) {
        configDao.updatePhase(phase)
    }

    suspend fun updateConfig(config: RetreatConfig) {
        configDao.update(config)
    }

    suspend fun resetRetreat() {
        configDao.delete()
        checklistDao.deleteAll()
        scheduleBlockDao.deleteAll()
        meditationSessionDao.deleteAll()
        journalEntryDao.deleteAll()
        mealLogDao.deleteAll()
        preceptLogDao.deleteAll()
        dhammaTalkDao.deleteAll()
    }

    fun getChecklistForPhase(phase: Phase): Flow<List<ChecklistItem>> =
        checklistDao.getItemsForPhase(phase)

    suspend fun toggleChecklistItem(id: String, completed: Boolean) {
        checklistDao.updateCompleted(id, !completed)
    }

    suspend fun areAllRequiredItemsComplete(phase: Phase): Boolean {
        return checklistDao.countIncompleteRequired(phase) == 0
    }

    suspend fun advancePhaseIfReady(): Boolean {
        val config = configDao.getConfigSync() ?: return false

        return when (config.phase) {
            Phase.PREPARING -> {
                val checklistComplete = areAllRequiredItemsComplete(Phase.PREPARING)
                val talksReady = config.allTalksDownloaded
                if (checklistComplete && talksReady) {
                    configDao.updatePhase(Phase.READY)
                    true
                } else false
            }
            Phase.READY -> {
                val now = java.time.LocalDate.now()
                if (config.startDate != null && !now.isBefore(config.startDate)) {
                    configDao.updatePhase(Phase.IN_PROGRESS)
                    true
                } else false
            }
            Phase.IN_PROGRESS -> {
                val now = java.time.LocalDate.now()
                if (config.endDate != null && now.isAfter(config.endDate)) {
                    configDao.updatePhase(Phase.COMPLETED)
                    true
                } else false
            }
            else -> false
        }
    }

    private suspend fun populateDefaultChecklist() {
        val items = listOf(
            ChecklistItem(sortOrder = 1, text = "Inform family/housemates of retreat dates and Noble Silence"),
            ChecklistItem(sortOrder = 2, text = "Stock simple food requiring no cooking after 12 PM"),
            ChecklistItem(sortOrder = 3, text = "Prepare meditation space (cushion, blanket)"),
            ChecklistItem(sortOrder = 4, text = "Set up sleeping area with thin mattress or mat on floor"),
            ChecklistItem(sortOrder = 5, text = "Download Dhamma talks for offline use", required = true),
            ChecklistItem(sortOrder = 6, text = "Enable Do Not Disturb / Airplane Mode schedule"),
            ChecklistItem(sortOrder = 7, text = "Review 8 precepts"),
            ChecklistItem(sortOrder = 8, text = "Prepare emergency contact method", required = false)
        )
        checklistDao.insertAll(items)
    }
}