package com.join_seminar.twitter.ui.data

import okhttp3.Interceptor
import okhttp3.OkHttpClient
import okhttp3.Response
import retrofit2.Retrofit
import retrofit2.converter.gson.GsonConverterFactory

object RetrofitBuilder {
    private const val BASE_URL = "http://52.79.233.160:8000/"

    //userId 고정값 1
    val userId = 1

    val customRetrofit: ApiService = Retrofit.Builder()
        .baseUrl(BASE_URL)
        .client(provideOkHttpClient(AppInterceptor()))
        .addConverterFactory(GsonConverterFactory.create())
        .build()
        .create(ApiService::class.java)



    private fun provideOkHttpClient(interceptor: AppInterceptor): OkHttpClient
            = OkHttpClient.Builder().run {
        addInterceptor(interceptor)
        build()
    }



    //okhttp3 interceptor를 통한 헤더 추가
    class AppInterceptor : Interceptor {
        override fun intercept(chain: Interceptor.Chain) : Response = with(chain) {
            val newRequest = request().newBuilder()
                .addHeader("userId", userId.toString())
                .addHeader("Content-Type", "application/json")
                .build()
            proceed(newRequest)
        }
    }
}