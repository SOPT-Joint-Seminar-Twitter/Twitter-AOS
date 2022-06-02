package com.join_seminar.twitter.ui.data.write

data class WriteRequest(
    val content: String,
    val writer: Int = 1
)
