package com.join_seminar.twitter.ui.data

import com.join_seminar.twitter.ui.data.response.ResponseTwitList
import com.join_seminar.twitter.ui.data.response.ResponseUserInfoData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET ("/user")
    fun getUserInfo(): Call<ResponseUserInfoData>

    @GET("/twit")
    fun getTwitList(): Call<ResponseTwitList>
}

