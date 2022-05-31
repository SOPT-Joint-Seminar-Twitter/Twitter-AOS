package com.join_seminar.twitter.data.api

import com.join_seminar.twitter.data.request.RequestWriteTwit
import com.join_seminar.twitter.data.response.ResponseLike
import com.join_seminar.twitter.data.response.ResponseTwitList
import com.join_seminar.twitter.data.response.ResponseUserInfoData
import com.join_seminar.twitter.data.response.ResponseWriteTwit
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path


interface ApiService {
    //유저 조회 서버 통신
    @GET("/user")
    suspend fun getUserInfo(): ResponseUserInfoData

    //트윗 작성
    @POST("/twit")
    suspend fun postWriteTwit(
        @Body requestWriteTwit: RequestWriteTwit
    ) : ResponseWriteTwit

    //트윗 리스트
    @GET("/twit")
    suspend fun getTwitList() : ResponseTwitList

    //좋아요
    @POST("/like/{postId}")
    suspend fun postLike(
        @Path("postId") postId : Int
    ) : ResponseLike

}
