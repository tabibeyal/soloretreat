package com.homeretreat.planner.ui.components

import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.height
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.LaunchedEffect
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import com.homeretreat.planner.ui.theme.TimerDisplayStyle
import kotlinx.coroutines.delay
import java.time.LocalTime
import java.time.Duration

@Composable
fun CountdownDisplay(
    targetTime: LocalTime,
    label: String = "Remaining",
    modifier: Modifier = Modifier
) {
    var timeLeft by remember { mutableStateOf(calculateTimeLeft(targetTime)) }

    LaunchedEffect(targetTime) {
        while (true) {
            timeLeft = calculateTimeLeft(targetTime)
            delay(1000)
        }
    }

    Column(
        modifier = modifier,
        horizontalAlignment = Alignment.CenterHorizontally
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Spacer(modifier = Modifier.height(4.dp))
        Text(
            text = timeLeft,
            style = TimerDisplayStyle.copy(
                color = MaterialTheme.colorScheme.onBackground
            )
        )
    }
}

private fun calculateTimeLeft(targetTime: LocalTime): String {
    val now = LocalTime.now()
    return if (now.isAfter(targetTime)) {
        "00:00:00"
    } else {
        val diff = Duration.between(now, targetTime)
        val hours = diff.toHours()
        val minutes = diff.toMinutes() % 60
        val seconds = diff.seconds % 60
        String.format("%02d:%02d:%02d", hours, minutes, seconds)
    }
}