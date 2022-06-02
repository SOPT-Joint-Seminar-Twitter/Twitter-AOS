package com.join_seminar.twitter.ui

import android.app.Application
import com.join_seminar.twitter.ui.write.WriteRepository

class App : Application() {
    val repository by lazy { WriteRepository() }
}