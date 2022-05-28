package com.join_seminar.twitter.data.response

data class ResponseUserInfoData(
    val data: Data,
    val message: String,
    val status: Int,
    val success: Boolean
) {
    data class Data(
        val _id: String,
        val createdAt: String,
        val introduce: String,
        val updatedAt: String,
        val userId: String,
        val userName: String
    )
}