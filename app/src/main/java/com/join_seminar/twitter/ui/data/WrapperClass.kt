package com.join_seminar.twitter.ui.data

data class WrapperClass<T>(
    val status: Int,
    val message: String,
    val success: Boolean,
    val data: T
)