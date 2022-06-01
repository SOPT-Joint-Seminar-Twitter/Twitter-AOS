package com.join_seminar.twitter.ui.data

import com.join_seminar.twitter.ui.data.response.ResponseTwitList
import com.join_seminar.twitter.ui.data.response.ResponseUserInfoData
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Path

interface ApiService {
    @GET ("/users/{userName}")
    fun getUserInfo(@Path("userName")userName:String): Call<ResponseUserInfoData>

    @GET("/twit/{userName}")
    fun getTwitList(): Call<List<ResponseTwitList>>
}

