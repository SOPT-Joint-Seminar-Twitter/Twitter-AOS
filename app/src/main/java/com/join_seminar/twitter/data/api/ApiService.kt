package com.join_seminar.twitter.data.api

import com.join_seminar.twitter.data.response.ResponseUserInfoData
import retrofit2.http.GET
import retrofit2.http.Header
import retrofit2.http.Headers


interface ApiService {
    @GET("/user")
    suspend fun getUserInfo(
    ): ResponseUserInfoData
}
