package com.soloretreat.ui

import android.os.Bundle
import androidx.activity.ComponentActivity
import androidx.activity.compose.setContent
import androidx.activity.enableEdgeToEdge
import androidx.compose.foundation.layout.fillMaxSize
import androidx.compose.material3.MaterialTheme
import androidx.compose.material3.Surface
import androidx.compose.runtime.collectAsState
import androidx.compose.runtime.getValue
import androidx.compose.ui.Modifier
import androidx.lifecycle.lifecycleScope
import androidx.navigation.compose.rememberNavController
import com.soloretreat.data.model.Phase
import com.soloretreat.data.repository.RetreatRepository
import com.soloretreat.ui.navigation.HomeRetreatNavHost
import com.soloretreat.ui.navigation.Screen
import com.soloretreat.ui.theme.HomeRetreatTheme
import androidx.glance.appwidget.updateAll
import com.soloretreat.ui.widget.RetreatWidget
import dagger.hilt.android.AndroidEntryPoint
import kotlinx.coroutines.launch
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : ComponentActivity() {

    @Inject lateinit var retreatRepository: RetreatRepository

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        enableEdgeToEdge()

        lifecycleScope.launch {
            retreatRepository.advancePhaseIfReady()
        }

        setContent {
            HomeRetreatTheme {
                Surface(
                    modifier = Modifier.fillMaxSize(),
                    color = MaterialTheme.colorScheme.background
                ) {
                    val navController = rememberNavController()
                    val config by retreatRepository.getConfig()
                        .collectAsState(initial = null)

                    val startDestination = when (config?.phase) {
                        Phase.IN_PROGRESS -> Screen.RetreatDashboard.route
                        Phase.COMPLETED -> Screen.RetreatSummary.route
                        else -> Screen.PreparationDashboard.route
                    }

                    HomeRetreatNavHost(
                        navController = navController,
                        startDestination = startDestination
                    )
                }
            }
        }
    }

    override fun onPause() {
        super.onPause()
        lifecycleScope.launch {
            try {
                RetreatWidget().updateAll(applicationContext)
            } catch (e: Exception) {
                android.util.Log.e("MainActivity", "Widget update failed", e)
            }
        }
    }
}