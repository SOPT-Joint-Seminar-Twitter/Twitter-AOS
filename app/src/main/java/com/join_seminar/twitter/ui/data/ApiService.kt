package com.join_seminar.twitter.ui.data


import com.join_seminar.twitter.ui.data.request.RequestHeart
import com.join_seminar.twitter.ui.data.response.ResponseHeart
import com.join_seminar.twitter.ui.data.response.ResponseTwitList
import com.join_seminar.twitter.ui.data.response.ResponseUserInfoData
import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST
import retrofit2.http.Path

interface ApiService {
    @GET ("/user")
    fun getUserInfo(): Call<ResponseUserInfoData>

    @GET("/twit")
    fun getTwitList(): Call<ResponseTwitList>

    @POST("/like/{postId}")
    fun postHeart(@Path("postId") postId:String): Call<ResponseHeart>
  
    @POST("/twit")
    suspend fun twit(
        @Body writeRequest: WriteRequest
    ): WrapperClass<Any>
    @GET ("/user")
    fun getUserInfo(): Call<ResponseUserInfoData>
  
}



