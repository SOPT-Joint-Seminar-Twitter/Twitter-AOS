package com.join_seminar.twitter.ui.write

import android.util.Log
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.viewModelScope
import com.join_seminar.twitter.ui.data.write.WriteRepository
import kotlinx.coroutines.flow.MutableSharedFlow
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asSharedFlow
import kotlinx.coroutines.launch

class WriteViewModel constructor(
    private val writeRepository: WriteRepository
) : ViewModel() {
    private val _eventFlow = MutableSharedFlow<Event>()
    val writeText: MutableStateFlow<String> = MutableStateFlow("")
    val eventFlow = _eventFlow.asSharedFlow()

    fun twit(content: String) {
        viewModelScope.launch {
            writeRepository.twit(content)
                .onSuccess {
                    Log.d("WriteViewModel", "success ${it.message}")
                    exit()
                }
                .onFailure {
                    Log.d("WriteViewModel", "fail ${it.message}")
                    _eventFlow.emit(Event.ShowToast)
                }
        }
    }

    fun exit() {
        viewModelScope.launch { _eventFlow.emit(Event.IsFinish) }
    }
}

sealed class Event {
    object ShowToast : Event()
    object IsFinish : Event()
}

class WriteViewModelFactory(private val repository: WriteRepository) :
    ViewModelProvider.Factory {
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        if (modelClass.isAssignableFrom(WriteViewModel::class.java)) {
            @Suppress("UNCHECKED_CAST")
            return WriteViewModel(repository) as T
        }
        throw IllegalArgumentException("Unknown ViewModel class")
    }
}