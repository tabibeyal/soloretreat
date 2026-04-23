package com.soloretreat.data.local.entity

import androidx.room.Entity
import androidx.room.PrimaryKey
import com.soloretreat.data.model.Phase
import java.time.LocalDate

@Entity(tableName = "retreat_config")
data class RetreatConfig(
    @PrimaryKey val id: Int = 1,
    val startDate: LocalDate? = null,
    val endDate: LocalDate? = null,
    val phase: Phase = Phase.NOT_STARTED,
    val preceptsCommitted: Boolean = false,
    val allTalksDownloaded: Boolean = false
)