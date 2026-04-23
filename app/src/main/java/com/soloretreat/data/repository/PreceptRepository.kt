package com.soloretreat.data.repository

import com.soloretreat.data.local.dao.PreceptLogDao
import com.soloretreat.data.local.entity.PreceptLog
import com.soloretreat.data.model.allPrecepts
import kotlinx.coroutines.flow.Flow
import java.time.LocalDate
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class PreceptRepository @Inject constructor(
    private val preceptLogDao: PreceptLogDao
) {
    val precepts = allPrecepts

    fun getLogForDate(date: LocalDate): Flow<PreceptLog?> =
        preceptLogDao.getLogForDateFlow(date)

    suspend fun getOrCreateLog(date: LocalDate): PreceptLog {
        return preceptLogDao.getLogForDate(date)
            ?: PreceptLog(date = date).also { preceptLogDao.insert(it) }
    }

    suspend fun updatePreceptObservance(date: LocalDate, preceptNumber: Int, observed: Boolean) {
        val log = getOrCreateLog(date)
        val updated = when (preceptNumber) {
            1 -> log.copy(p1 = observed)
            2 -> log.copy(p2 = observed)
            3 -> log.copy(p3 = observed)
            4 -> log.copy(p4 = observed)
            5 -> log.copy(p5 = observed)
            6 -> log.copy(p6 = observed)
            7 -> log.copy(p7 = observed)
            8 -> log.copy(p8 = observed)
            else -> log
        }
        preceptLogDao.insert(updated)
    }

    suspend fun updateEveningReflection(date: LocalDate, reflection: String) {
        val log = getOrCreateLog(date)
        preceptLogDao.insert(log.copy(eveningReflection = reflection))
    }

    suspend fun getObservanceRate(start: LocalDate, end: LocalDate): Float {
        return preceptLogDao.getObservanceRate(start, end) ?: 0f
    }

    suspend fun getLogsForRange(start: LocalDate, end: LocalDate): List<PreceptLog> {
        return preceptLogDao.getLogsForRange(start, end)
    }
}