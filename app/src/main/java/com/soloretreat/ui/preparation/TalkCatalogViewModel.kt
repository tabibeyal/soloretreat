package com.soloretreat.ui.preparation

import android.content.Context
import androidx.core.net.toUri
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import androidx.media3.common.MediaItem
import androidx.media3.common.Player
import androidx.media3.exoplayer.ExoPlayer
import androidx.work.Constraints
import androidx.work.Data
import androidx.work.NetworkType
import androidx.work.OneTimeWorkRequestBuilder
import androidx.work.WorkManager
import com.soloretreat.data.local.entity.DhammaTalk
import com.soloretreat.data.model.DownloadStatus
import com.soloretreat.data.repository.TalkRepository
import com.soloretreat.service.TalkDownloadWorker
import dagger.hilt.android.lifecycle.HiltViewModel
import dagger.hilt.android.qualifiers.ApplicationContext
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.SharingStarted
import kotlinx.coroutines.flow.StateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.stateIn
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class TalkCatalogViewModel @Inject constructor(
    private val talkRepository: TalkRepository,
    @param:ApplicationContext private val context: Context
) : ViewModel() {

    val talks: StateFlow<List<DhammaTalk>> = talkRepository.getAllTalks()
        .stateIn(viewModelScope, SharingStarted.WhileSubscribed(5000), emptyList())

    private val _isPlaying = MutableStateFlow(false)
    val isPlaying: StateFlow<Boolean> = _isPlaying.asStateFlow()

    private val _currentlyPlayingId = MutableStateFlow<String?>(null)
    val currentlyPlayingId: StateFlow<String?> = _currentlyPlayingId.asStateFlow()

    private val _isRefreshing = MutableStateFlow(false)
    val isRefreshing: StateFlow<Boolean> = _isRefreshing.asStateFlow()

    private val _error = MutableStateFlow<String?>(null)
    val error: StateFlow<String?> = _error.asStateFlow()

    private var exoPlayer: ExoPlayer? = null

    private val playerListener = object : Player.Listener {
        override fun onIsPlayingChanged(isPlaying: Boolean) {
            _isPlaying.value = isPlaying
        }

        override fun onPlaybackStateChanged(playbackState: Int) {
            if (playbackState == Player.STATE_ENDED) {
                _currentlyPlayingId.value = null
            }
        }
    }

    fun refreshCatalog() {
        viewModelScope.launch {
            _isRefreshing.value = true
            _error.value = null
            try {
                talkRepository.refreshCatalog()
            } catch (e: Exception) {
                _error.value = "Failed to refresh: ${e.message}"
            } finally {
                _isRefreshing.value = false
            }
        }
    }

    fun downloadTalk(talk: DhammaTalk) {
        if (talk.downloadStatus == DownloadStatus.COMPLETE) {
            togglePlayPause(talk)
            return
        }
        val inputData = Data.Builder()
            .putString(TalkDownloadWorker.KEY_TALK_ID, talk.id)
            .putString(TalkDownloadWorker.KEY_TALK_URL, talk.remoteUrl)
            .putString(TalkDownloadWorker.KEY_TALK_TITLE, talk.title)
            .build()

        val constraints = Constraints.Builder()
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .build()

        val workRequest = OneTimeWorkRequestBuilder<TalkDownloadWorker>()
            .setInputData(inputData)
            .setConstraints(constraints)
            .build()

        WorkManager.getInstance(context).enqueue(workRequest)
    }

    private fun togglePlayPause(talk: DhammaTalk) {
        if (_currentlyPlayingId.value == talk.id) {
            if (_isPlaying.value) {
                exoPlayer?.pause()
            } else {
                exoPlayer?.play()
            }
        } else {
            playTalk(talk)
        }
    }

    private fun playTalk(talk: DhammaTalk) {
        val path = talk.localPath ?: return
        val uri = path.toUri()

        if (exoPlayer == null) {
            exoPlayer = ExoPlayer.Builder(context).build().apply {
                addListener(playerListener)
            }
        }

        exoPlayer?.apply {
            _currentlyPlayingId.value = talk.id
            setMediaItem(MediaItem.fromUri(uri))
            prepare()
            play()
        }
    }

    override fun onCleared() {
        super.onCleared()
        exoPlayer?.removeListener(playerListener)
        exoPlayer?.release()
        exoPlayer = null
    }
}