package com.soloretreat.ui.preparation

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.soloretreat.data.model.Phase
import com.soloretreat.data.repository.RetreatRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class ChecklistViewModel @Inject constructor(
    private val retreatRepository: RetreatRepository
) : ViewModel() {

    val items = retreatRepository.getChecklistForPhase(Phase.PREPARING)
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    fun toggleItem(id: String, completed: Boolean) {
        viewModelScope.launch {
            retreatRepository.toggleChecklistItem(id, completed)
        }
    }
}