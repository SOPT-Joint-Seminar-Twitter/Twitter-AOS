package com.join_seminar.twitter.ui.util

import android.widget.Button
import androidx.databinding.BindingAdapter

object BindingAdapter {
    @BindingAdapter("isText")
    @JvmStatic
    fun Button.bindIsText(isText: Boolean) {
        isSelected = isText
    }
}