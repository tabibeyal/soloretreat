package com.soloretreat.ui.preparation

import androidx.compose.foundation.layout.fillMaxWidth
import androidx.compose.foundation.shape.RoundedCornerShape
import androidx.compose.material3.Button
import androidx.compose.material3.DatePicker
import androidx.compose.material3.DatePickerDialog
import androidx.compose.material3.ExperimentalMaterial3Api
import androidx.compose.material3.OutlinedButton
import androidx.compose.material3.Text
import androidx.compose.material3.rememberDatePickerState
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Modifier
import androidx.compose.ui.unit.dp
import java.time.Instant
import java.time.LocalDate
import java.time.ZoneId

@OptIn(ExperimentalMaterial3Api::class)
@Composable
@Suppress("AssignedValueIsNeverRead")
fun CreateRetreatDialog(
    onCreate: (LocalDate, LocalDate) -> Unit
) {
    var showDialog by remember { mutableStateOf(false) }
    var startDate by remember { mutableStateOf<LocalDate?>(null) }

    Button(
        onClick = { showDialog = true },
        modifier = Modifier.fillMaxWidth(0.7f)
    ) {
        Text("Create Retreat Plan")
    }

    if (showDialog) {
        val currentStart = startDate
        if (currentStart == null) {
            val datePickerState = rememberDatePickerState(
                initialSelectedDateMillis = System.currentTimeMillis()
            )
            DatePickerDialog(
                onDismissRequest = { showDialog = false },
                confirmButton = {
                    Button(onClick = {
                        datePickerState.selectedDateMillis?.let { millis ->
                            startDate = Instant.ofEpochMilli(millis)
                                .atZone(ZoneId.systemDefault())
                                .toLocalDate()
                        }
                    }) {
                        Text("Next")
                    }
                },
                dismissButton = {
                    OutlinedButton(onClick = { showDialog = false }) {
                        Text("Cancel")
                    }
                },
                shape = RoundedCornerShape(4.dp)
            ) {
                DatePicker(state = datePickerState, title = { Text("Select Start Date") })
            }
        } else {
            val datePickerState = rememberDatePickerState(
                initialSelectedDateMillis = currentStart.plusDays(1)
                    .atStartOfDay(ZoneId.systemDefault())
                    .toInstant()
                    .toEpochMilli()
            )
            DatePickerDialog(
                onDismissRequest = { showDialog = false },
                confirmButton = {
                    Button(onClick = {
                        datePickerState.selectedDateMillis?.let { millis ->
                            val end = Instant.ofEpochMilli(millis)
                                .atZone(ZoneId.systemDefault())
                                .toLocalDate()
                            onCreate(currentStart, end)
                            showDialog = false
                            startDate = null
                        }
                    }) {
                        Text("Create Retreat")
                    }
                },
                dismissButton = {
                    OutlinedButton(onClick = { startDate = null }) {
                        Text("Back")
                    }
                },
                shape = RoundedCornerShape(4.dp)
            ) {
                DatePicker(state = datePickerState, title = { Text("Select End Date") })
            }
        }
    }
}