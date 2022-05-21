package com.join_seminar.twitter.ui.write

import androidx.lifecycle.ViewModel
import kotlinx.coroutines.flow.MutableStateFlow

class WriteViewModel : ViewModel() {
    private val _writeText: MutableStateFlow<String> = MutableStateFlow("")
    val writeText get() = _writeText
}