package com.homeretreat.planner.ui.integration

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.homeretreat.planner.data.local.entity.JournalEntry
import com.homeretreat.planner.data.repository.JournalRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class JournalViewModel @Inject constructor(
    private val journalRepository: JournalRepository
) : ViewModel() {

    val entries: StateFlow<List<JournalEntry>> = journalRepository.getAllEntries()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun saveEntry(text: String, tags: String) {
        viewModelScope.launch {
            journalRepository.createEntry(text, tags)
        }
    }

    fun deleteEntry(entry: JournalEntry) {
        viewModelScope.launch {
            journalRepository.deleteEntry(entry)
        }
    }
}