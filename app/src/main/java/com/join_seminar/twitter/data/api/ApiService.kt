package com.join_seminar.twitter.data.api

import com.join_seminar.twitter.data.request.RequestWriteTwit
import com.join_seminar.twitter.data.response.ResponseUserInfoData
import com.join_seminar.twitter.data.response.ResponseWriteTwit
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST


interface ApiService {
    //유저 조회 서버 통신
    @GET("/user")
    suspend fun getUserInfo(): ResponseUserInfoData

    //트윗 작성
    @POST("/twit")
    suspend fun postWriteTwit(
        @Body requestWriteTwit: RequestWriteTwit
    ) : ResponseWriteTwit
}
