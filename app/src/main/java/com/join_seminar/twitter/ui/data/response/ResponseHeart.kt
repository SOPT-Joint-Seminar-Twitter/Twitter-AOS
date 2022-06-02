package com.join_seminar.twitter.ui.data.response

data class ResponseHeart(
    val status: Int,
    val message: String,
    val success: Boolean,
    val data: Data
){
    data class Data(
        val likeCount : Int,
        val isLike :Boolean
    )
}
