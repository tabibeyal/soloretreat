package com.homeretreat.planner.ui.integration

import android.content.Intent
import androidx.core.net.toUri
import androidx.compose.foundation.layout.Arrangement
import androidx.compose.foundation.layout.Column
import androidx.compose.foundation.layout.Row
import androidx.compose.foundation.layout.Spacer
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.layout.height
import androidx.compose.foundation.layout.padding
import androidx.compose.foundation.layout.width
import androidx.compose.foundation.rememberScrollState
import androidx.compose.foundation.verticalScroll
import androidx.compose.material.icons.Icons
import androidx.compose.material.icons.filled.Coffee
import androidx.compose.material.icons.filled.Share
import androidx.compose.material3.ButtonDefaults
import androidx.compose.material3.Card
import androidx.compose.material3.CardDefaults
import androidx.compose.material3.Icon
import androidx.compose.material3.IconButton
import androidx.compose.material3.LinearProgressIndicator
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.material3.TextButton
import androidx.compose.runtime.Composable
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.homeretreat.planner.ui.components.RetreatAppBar
import com.homeretreat.planner.util.TimeUtils

@Composable
fun RetreatSummaryScreen(
    onNavigateBack: () -> Unit,
    onDone: () -> Unit,
    viewModel: RetreatSummaryViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val context = LocalContext.current

    Scaffold(
        topBar = {
            RetreatAppBar(
                title = "Retreat Summary",
                onNavigateBack = onNavigateBack,
                actions = {
                    IconButton(onClick = {
                        val intent = Intent(Intent.ACTION_SEND).apply {
                            type = "text/plain"
                            putExtra(Intent.EXTRA_SUBJECT, "My Solo Retreat Summary")
                            putExtra(Intent.EXTRA_TEXT, viewModel.generateExportText())
                        }
                        context.startActivity(Intent.createChooser(intent, "Share Retreat Summary"))
                    }) {
                        Icon(Icons.Default.Share, contentDescription = "Share")
                    }
                }
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(horizontal = 16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(12.dp)
        ) {
            Spacer(modifier = Modifier.height(8.dp))

            // Header
            state.config?.let { config ->
                Card(
                    modifier = Modifier.fillMaxWidth(),
                    colors = CardDefaults.cardColors(
                        containerColor = MaterialTheme.colorScheme.primaryContainer
                    )
                ) {
                    Column(
                        modifier = Modifier
                            .fillMaxWidth()
                        .padding(16.dp),
                        horizontalAlignment = Alignment.CenterHorizontally
                    ) {
                        Text(
                            text = "Retreat Complete",
                            style = MaterialTheme.typography.headlineSmall
                        )
                        config.startDate?.let { start ->
                            config.endDate?.let { end ->
                                val days = TimeUtils.daysBetween(start, end)
                                Text(
                                    text = "$days days \u2022 ${TimeUtils.formatFullDate(start)} to ${TimeUtils.formatFullDate(end)}",
                                    style = MaterialTheme.typography.bodyLarge,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer
                                )
                            }
                        }
                    }
                }
            }

            // Meditation stats
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Meditation Practice",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    StatRow(label = "Total Sitting Time", value = state.formattedMeditationTime)
                    StatRow(label = "Completed Sessions", value = "${state.completedSessions}")
                    StatRow(label = "Interrupted Sessions", value = "${state.interruptedSessions}")
                }
            }

            // Precept observance
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Precept Observance",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    LinearProgressIndicator(
                        progress = { state.preceptRate },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = "${(state.preceptRate * 100).toInt()}% average observance",
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }

            // Meal compliance
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = "Meal Compliance",
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    StatRow(label = "Meals before noon", value = "${state.onTimeMeals}")
                    StatRow(label = "Meals after noon", value = "${state.lateMeals}")
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Done button
            OutlinedButton(
                onClick = onDone,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text("Return Home")
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Donation button
            TextButton(
                onClick = {
                    val intent = Intent(Intent.ACTION_VIEW, "https://www.paypal.com/donate?business=eyaltabib82@gmail.com&currency_code=USD".toUri())
                    context.startActivity(intent)
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.textButtonColors(
                    contentColor = MaterialTheme.colorScheme.secondary
                )
            ) {
                Icon(Icons.Default.Coffee, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text("Buy the developer coffee")
            }

            Spacer(modifier = Modifier.height(16.dp))
        }
    }
}

@Composable
private fun StatRow(label: String, value: String) {
    Row(
        modifier = Modifier
            .fillMaxWidth()
            .padding(vertical = 2.dp),
        horizontalArrangement = Arrangement.SpaceBetween
    ) {
        Text(
            text = label,
            style = MaterialTheme.typography.bodyMedium,
            color = MaterialTheme.colorScheme.onSurfaceVariant
        )
        Text(
            text = value,
            style = MaterialTheme.typography.bodyLarge
        )
    }
}