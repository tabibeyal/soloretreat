package com.soloretreat.ui.integration

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
import androidx.compose.runtime.rememberCoroutineScope
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.res.stringResource
import androidx.compose.ui.unit.dp
import androidx.hilt.navigation.compose.hiltViewModel
import com.soloretreat.R
import com.soloretreat.ui.components.RetreatAppBar
import com.soloretreat.util.TimeUtils
import kotlinx.coroutines.launch

@Composable
fun RetreatSummaryScreen(
    onFeedback: () -> Unit,
    onDone: () -> Unit,
    viewModel: RetreatSummaryViewModel = hiltViewModel()
) {
    val state by viewModel.state.collectAsState()
    val context = LocalContext.current
    val scope = rememberCoroutineScope()

    Scaffold(
        topBar = {
            RetreatAppBar(
                title = stringResource(R.string.retreat_summary_title),
                actions = {
                    IconButton(onClick = {
                        scope.launch {
                            val exportText = viewModel.generateExportText()
                            val intent = Intent(Intent.ACTION_SEND).apply {
                                type = "text/plain"
                                putExtra(Intent.EXTRA_SUBJECT, context.getString(R.string.share_subject))
                                putExtra(Intent.EXTRA_TEXT, exportText)
                            }
                            context.startActivity(Intent.createChooser(intent, context.getString(R.string.share_chooser_title)))
                        }
                    }) {
                        Icon(
                            imageVector = Icons.Default.Share,
                            contentDescription = stringResource(R.string.share_content_description)
                        )
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
                            text = stringResource(R.string.retreat_complete),
                            style = MaterialTheme.typography.headlineSmall
                        )
                        config.startDate?.let { start ->
                            config.endDate?.let { end ->
                                val days = TimeUtils.daysBetween(start, end)
                                val dayText = if (days == 1) {
                                    "1 day"
                                } else {
                                    "$days days"
                                }
                                Text(
                                    text = "$dayText \u2022 ${TimeUtils.formatFullDate(start)} to ${TimeUtils.formatFullDate(end)}",
                                    style = MaterialTheme.typography.bodyLarge,
                                    color = MaterialTheme.colorScheme.onPrimaryContainer
                                )
                            }
                        }
                    }
                }
            }

            // Sitting meditation stats
            if (state.sittingCompleted + state.sittingInterrupted > 0) {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = stringResource(R.string.sitting_meditation),
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        StatRow(
                            label = stringResource(R.string.total_time),
                            value = state.formattedSittingTime
                        )
                        StatRow(
                            label = stringResource(R.string.completed_sessions),
                            value = "${state.sittingCompleted}"
                        )
                        StatRow(
                            label = stringResource(R.string.interrupted_sessions),
                            value = "${state.sittingInterrupted}"
                        )
                    }
                }
            }

            // Walking meditation stats
            if (state.walkingCompleted + state.walkingInterrupted > 0) {
                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = stringResource(R.string.walking_meditation),
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        StatRow(
                            label = stringResource(R.string.total_time),
                            value = state.formattedWalkingTime
                        )
                        StatRow(
                            label = stringResource(R.string.completed_sessions),
                            value = "${state.walkingCompleted}"
                        )
                        StatRow(
                            label = stringResource(R.string.interrupted_sessions),
                            value = "${state.walkingInterrupted}"
                        )
                    }
                }
            }

            // Other timed activities (chants, talks, etc.)
            state.otherActivities.forEach { stat ->
                Card(modifier = Modifier.fillMaxWidth()) {
                    Column(modifier = Modifier.padding(16.dp)) {
                        Text(
                            text = stat.displayName,
                            style = MaterialTheme.typography.titleMedium
                        )
                        Spacer(modifier = Modifier.height(8.dp))
                        StatRow(
                            label = stringResource(R.string.total_time),
                            value = stat.formattedTime
                        )
                        StatRow(
                            label = stringResource(R.string.completed_sessions),
                            value = "${stat.completed}"
                        )
                        StatRow(
                            label = stringResource(R.string.interrupted_sessions),
                            value = "${stat.interrupted}"
                        )
                    }
                }
            }

            // Precept observance
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = stringResource(R.string.precept_observance),
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    LinearProgressIndicator(
                        progress = { state.preceptRate },
                        modifier = Modifier.fillMaxWidth()
                    )
                    Spacer(modifier = Modifier.height(4.dp))
                    Text(
                        text = stringResource(
                            R.string.precept_observance_rate,
                            (state.preceptRate * 100).toInt()
                        ),
                        style = MaterialTheme.typography.bodyMedium
                    )
                }
            }

            // Meal compliance
            Card(modifier = Modifier.fillMaxWidth()) {
                Column(modifier = Modifier.padding(16.dp)) {
                    Text(
                        text = stringResource(R.string.meal_compliance),
                        style = MaterialTheme.typography.titleMedium
                    )
                    Spacer(modifier = Modifier.height(8.dp))
                    StatRow(
                        label = stringResource(R.string.meals_before_noon),
                        value = "${state.onTimeMeals}"
                    )
                    StatRow(
                        label = stringResource(R.string.meals_after_noon),
                        value = "${state.lateMeals}"
                    )
                }
            }

            Spacer(modifier = Modifier.height(16.dp))

            // Done button
            OutlinedButton(
                onClick = onDone,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.return_home))
            }

            // Feedback button
            TextButton(
                onClick = onFeedback,
                modifier = Modifier.fillMaxWidth()
            ) {
                Text(stringResource(R.string.send_feedback))
            }

            Spacer(modifier = Modifier.height(24.dp))

            // Donation button
            val donationUrl = stringResource(R.string.paypal_donation_url)
            TextButton(
                onClick = {
                    val intent = Intent(Intent.ACTION_VIEW, donationUrl.toUri())
                    context.startActivity(intent)
                },
                modifier = Modifier.align(Alignment.CenterHorizontally),
                colors = ButtonDefaults.textButtonColors(
                    contentColor = MaterialTheme.colorScheme.secondary
                )
            ) {
                Icon(Icons.Default.Coffee, contentDescription = null)
                Spacer(modifier = Modifier.width(8.dp))
                Text(stringResource(R.string.buy_coffee))
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