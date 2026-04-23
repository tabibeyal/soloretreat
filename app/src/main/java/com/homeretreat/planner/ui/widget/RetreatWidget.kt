package com.homeretreat.planner.ui.widget

import android.content.Context
import androidx.compose.runtime.Composable
import androidx.compose.ui.unit.dp
import androidx.compose.ui.unit.sp
import androidx.glance.GlanceId
import androidx.glance.GlanceModifier
import androidx.glance.appwidget.GlanceAppWidget
import androidx.glance.appwidget.GlanceAppWidgetReceiver
import androidx.glance.appwidget.provideContent
import androidx.glance.background
import androidx.glance.layout.Alignment
import androidx.glance.layout.Column
import androidx.glance.layout.Spacer
import androidx.glance.layout.fillMaxSize
import androidx.glance.layout.height
import androidx.glance.layout.padding
import androidx.glance.text.FontWeight
import androidx.glance.text.Text
import androidx.glance.text.TextStyle
import androidx.glance.unit.ColorProvider
import com.homeretreat.planner.data.local.entity.RetreatConfig
import com.homeretreat.planner.data.local.entity.ScheduleBlock
import com.homeretreat.planner.data.model.Phase
import com.homeretreat.planner.data.repository.RetreatRepository
import com.homeretreat.planner.data.repository.ScheduleRepository
import com.homeretreat.planner.ui.theme.Cream
import com.homeretreat.planner.ui.theme.DeepMaroon
import com.homeretreat.planner.ui.theme.WarmOchre
import com.homeretreat.planner.util.TimeUtils
import dagger.hilt.EntryPoint
import dagger.hilt.EntryPoints
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import java.time.Duration
import java.time.LocalTime

class RetreatWidget : GlanceAppWidget() {

    @EntryPoint
    @InstallIn(SingletonComponent::class)
    interface RetreatWidgetEntryPoint {
        fun retreatRepository(): RetreatRepository
        fun scheduleRepository(): ScheduleRepository
    }

    override suspend fun provideGlance(context: Context, id: GlanceId) {
        val entryPoint = EntryPoints.get(
            context.applicationContext,
            RetreatWidgetEntryPoint::class.java
        )
        val retreatRepository = entryPoint.retreatRepository()
        val scheduleRepository = entryPoint.scheduleRepository()

        val config = retreatRepository.getConfigSync()
        
        val widgetData = if (config != null && config.phase == Phase.IN_PROGRESS) {
            val startDate = config.startDate
            val endDate = config.endDate
            if (startDate != null && endDate != null) {
                val dayOfRetreat = TimeUtils.dayOfRetreat(startDate)
                val totalDays = TimeUtils.daysBetween(startDate, endDate)
                val now = LocalTime.now()
                val dayOffset = dayOfRetreat - 1
                
                val current = scheduleRepository.getCurrentBlock(dayOffset, now)
                val next = scheduleRepository.getNextBlock(dayOffset, now)
                
                WidgetData.Active(
                    day = dayOfRetreat,
                    totalDays = totalDays,
                    currentBlock = current,
                    nextBlock = next,
                    mealCutoffApproaching = TimeUtils.isMealCutoffApproaching()
                )
            } else WidgetData.NoRetreat
        } else {
            WidgetData.NoRetreat
        }

        provideContent {
            WidgetContent(widgetData)
        }
    }

    sealed class WidgetData {
        data object NoRetreat : WidgetData()
        data class Active(
            val day: Int,
            val totalDays: Int,
            val currentBlock: ScheduleBlock?,
            val nextBlock: ScheduleBlock?,
            val mealCutoffApproaching: Boolean
        ) : WidgetData()
    }

    @Composable
    private fun WidgetContent(data: WidgetData) {
        Column(
            modifier = GlanceModifier
                .fillMaxSize()
                .background(ColorProvider(color = DeepMaroon))
                .padding(12.dp),
            verticalAlignment = Alignment.CenterVertically,
            horizontalAlignment = Alignment.CenterHorizontally
        ) {
            when (data) {
                is WidgetData.NoRetreat -> {
                    Text(
                        text = "No retreat active",
                        style = TextStyle(
                            color = ColorProvider(color = Cream),
                            fontSize = 16.sp,
                            fontWeight = FontWeight.Medium
                        )
                    )
                }
                is WidgetData.Active -> {
                    Text(
                        text = "Day ${data.day} of ${data.totalDays}",
                        style = TextStyle(
                            color = ColorProvider(color = Cream),
                            fontSize = 18.sp,
                            fontWeight = FontWeight.Bold
                        )
                    )
                    Spacer(modifier = GlanceModifier.height(4.dp))
                    
                    val displayBlock = data.currentBlock ?: data.nextBlock
                    val prefix = if (data.currentBlock != null) "Now: " else "Next: "
                    
                    if (displayBlock != null) {
                        Text(
                            text = "$prefix${displayBlock.activityType.displayName}",
                            style = TextStyle(
                                color = ColorProvider(color = Cream),
                                fontSize = 14.sp
                            )
                        )
                        
                        val timeText = if (data.currentBlock != null) {
                            "Until ${TimeUtils.formatTime(displayBlock.endTime)}"
                        } else {
                            val duration = Duration.between(LocalTime.now(), displayBlock.startTime)
                            val minutes = duration.toMinutes()
                            if (minutes < 60) "in ${minutes}m" else "at ${TimeUtils.formatTime(displayBlock.startTime)}"
                        }
                        
                        Text(
                            text = timeText,
                            style = TextStyle(
                                color = ColorProvider(color = Cream.copy(alpha = 0.8f)),
                                fontSize = 13.sp
                            )
                        )
                    }

                    if (data.mealCutoffApproaching) {
                        Spacer(modifier = GlanceModifier.height(4.dp))
                        Text(
                            text = "Meal cutoff: 12:00 PM",
                            style = TextStyle(
                                color = ColorProvider(color = WarmOchre),
                                fontSize = 11.sp,
                                fontWeight = FontWeight.Medium
                            )
                        )
                    }
                }
            }
        }
    }
}

class RetreatWidgetReceiver : GlanceAppWidgetReceiver() {
    override val glanceAppWidget: GlanceAppWidget = RetreatWidget()
}