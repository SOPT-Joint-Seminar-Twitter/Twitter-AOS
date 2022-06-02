package com.join_seminar.twitter.ui.data

import com.join_seminar.twitter.ui.data.response.ResponseUserInfoData
import retrofit2.Call
import retrofit2.http.GET

interface ApiService {
    @GET ("/user")
    fun getUserInfo(): Call<ResponseUserInfoData>


}

