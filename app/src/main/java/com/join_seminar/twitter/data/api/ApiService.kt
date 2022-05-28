package com.join_seminar.twitter.data.api

import com.join_seminar.twitter.data.response.ResponseUserInfoData
import retrofit2.http.GET


interface ApiService {
    //유저 조회 서버 통신
    @GET("/user")
    suspend fun getUserInfo(): ResponseUserInfoData
}
