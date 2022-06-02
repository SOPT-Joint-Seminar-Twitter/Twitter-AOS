package com.join_seminar.twitter.data.response

data class ResponseLike(
    val data: Data,
    val message: String,
    val status: Int,
    val success: Boolean
) {
    data class Data(
        val isLike: Boolean,
        val likeCount: Int
    )
}