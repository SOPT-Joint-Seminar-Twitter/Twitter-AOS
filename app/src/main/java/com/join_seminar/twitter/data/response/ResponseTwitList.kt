package com.join_seminar.twitter.data.response

data class ResponseTwitList(
    val data: List<Data>,
    val message: String,
    val status: Int,
    val success: Boolean
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
            val __v: Int,
            val _id: String,
            val createdAt: String,
            val introduce: String,
            val updatedAt: String,
            val userId: String,
            val userName: String
        )
    }
}