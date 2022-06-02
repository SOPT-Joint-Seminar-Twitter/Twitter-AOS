package com.join_seminar.twitter.ui.write

data class WriteRequest(
    val content: String,
    val writer: Int = 1
)
