package com.join_seminar.twitter.ui.data.response

data class ResponseTwitList(
    val status: Int,
    val message: String,
    val success: Boolean,
    val data: List<Data>
) {
    data class Data(
        val _id: String,
        val content: String,
        val isLike: Boolean,
        val isRetwit: Boolean,
        val likeCount: Int,
        val writer: Writer
    ) {
        data class Writer(
            val _id: String,
            val userName: String,
            val userId : String,
            val userIntroduce :String
        )
    }
}
