package com.join_seminar.twitter.ui.data

import com.join_seminar.twitter.ui.data.write.WriteRequest
import retrofit2.http.Body
import retrofit2.http.POST

interface ApiService {
    @POST("/twit")
    suspend fun twit(
        @Body writeRequest: WriteRequest
    ): WrapperClass<Any>
}