package com.soloretreat.ui.integration

import android.content.Intent
import android.net.Uri
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
import androidx.compose.material3.Button
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.OutlinedTextField
import androidx.compose.material3.RadioButton
import androidx.compose.material3.Scaffold
import androidx.compose.material3.Text
import androidx.compose.runtime.Composable
import androidx.compose.runtime.getValue
import androidx.compose.runtime.mutableStateOf
import androidx.compose.runtime.remember
import androidx.compose.runtime.setValue
import androidx.compose.ui.Alignment
import androidx.compose.ui.Modifier
import androidx.compose.ui.platform.LocalContext
import androidx.compose.ui.unit.dp
import com.soloretreat.ui.components.RetreatAppBar

@Composable
fun FeedbackScreen(
    onNavigateBack: () -> Unit
) {
    var isAnonymous by remember { mutableStateOf(false) }
    var name by remember { mutableStateOf("") }
    var email by remember { mutableStateOf("") }
    var feedback by remember { mutableStateOf("") }
    
    val context = LocalContext.current

    Scaffold(
        topBar = {
            RetreatAppBar(
                title = "Send Feedback",
                onNavigateBack = onNavigateBack
            )
        }
    ) { padding ->
        Column(
            modifier = Modifier
                .fillMaxSize()
                .padding(padding)
                .padding(16.dp)
                .verticalScroll(rememberScrollState()),
            verticalArrangement = Arrangement.spacedBy(16.dp)
        ) {
            Text(
                text = "Your feedback helps improve SoloRetreat for everyone.",
                style = MaterialTheme.typography.bodyMedium,
                color = MaterialTheme.colorScheme.onSurfaceVariant
            )

            // Identity selection
            Column(verticalArrangement = Arrangement.spacedBy(8.dp)) {
                Text(text = "Identity", style = MaterialTheme.typography.titleSmall)
                Row(verticalAlignment = Alignment.CenterVertically) {
                    RadioButton(
                        selected = !isAnonymous,
                        onClick = { isAnonymous = false }
                    )
                    Text(text = "Identify myself", style = MaterialTheme.typography.bodyMedium)
                    Spacer(modifier = Modifier.width(16.dp))
                    RadioButton(
                        selected = isAnonymous,
                        onClick = { isAnonymous = true }
                    )
                    Text(text = "Anonymous", style = MaterialTheme.typography.bodyMedium)
                }
            }

            if (!isAnonymous) {
                OutlinedTextField(
                    value = name,
                    onValueChange = { name = it },
                    label = { Text("Name") },
                    modifier = Modifier.fillMaxWidth(),
                    singleLine = true
                )
            }

            OutlinedTextField(
                value = email,
                onValueChange = { email = it },
                label = { Text("Email (Optional)") },
                modifier = Modifier.fillMaxWidth(),
                singleLine = true
            )

            OutlinedTextField(
                value = feedback,
                onValueChange = { feedback = it },
                label = { Text("Feedback") },
                modifier = Modifier
                    .fillMaxWidth()
                    .height(200.dp),
                placeholder = { Text("How can we make your retreat better?") }
            )

            Spacer(modifier = Modifier.height(16.dp))

            Button(
                onClick = {
                    val displayName = if (isAnonymous) "Anonymous" else name.ifBlank { "Anonymous" }
                    val subject = "SoloRetreat Feedback from $displayName"
                    val body = buildString {
                        appendLine("Feedback from SoloRetreat App")
                        appendLine("---------------------------")
                        appendLine("Name: $displayName")
                        if (email.isNotBlank()) {
                            appendLine("Email: $email")
                        }
                        appendLine()
                        appendLine("Feedback:")
                        appendLine(feedback)
                    }

                    val intent = Intent(Intent.ACTION_SENDTO).apply {
                        data = Uri.parse("mailto:")
                        putExtra(Intent.EXTRA_EMAIL, arrayOf("tabibeyal101@gmail.com"))
                        putExtra(Intent.EXTRA_SUBJECT, subject)
                        putExtra(Intent.EXTRA_TEXT, body)
                    }
                    context.startActivity(Intent.createChooser(intent, "Send Feedback via..."))
                },
                modifier = Modifier.fillMaxWidth(),
                enabled = feedback.isNotBlank()
            ) {
                Text("Send Feedback")
            }
        }
    }
}
