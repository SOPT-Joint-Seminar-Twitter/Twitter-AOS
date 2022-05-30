package com.join_seminar.twitter.data.response

data class ResponseWriteTwit(
    val data: Data,
    val message: String,
    val status: Int,
    val success: Boolean
) {
    data class Data(
        val _id: String
    )
}