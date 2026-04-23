package com.homeretreat.planner.data.model

import kotlinx.serialization.Serializable

@Serializable
enum class DownloadStatus {
    NOT_STARTED,
    IN_PROGRESS,
    COMPLETE,
    FAILED
}
