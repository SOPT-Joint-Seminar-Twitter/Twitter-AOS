package com.join_seminar.twitter.ui.data.response

data class ResponseUserInfoData(
    val status: Int,
    val message: String,
    val success: Boolean,
    val data: Data
    ){
    data class Data(
        val _id: String,
        val createdAt: String,
        val introduce: String,
        val updatedAt: String,
        val userId: String,
        val userName: String
        )
    }

