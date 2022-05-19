package com.join_seminar.twitter.data

data class TwitData(
    val image: Int,
    val name: String,
    val nickname : String,
    val time : String,
    val content: String,
    val comment : String,
    val retwit : String,
    val heart : String,
    val isRetwit : Boolean
)
