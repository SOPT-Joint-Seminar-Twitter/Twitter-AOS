package com.join_seminar.twitter.ui.data.write

import com.join_seminar.twitter.ui.data.RetrofitBuilder.customRetrofit
import com.join_seminar.twitter.ui.data.WrapperClass

class WriteRepository {
    suspend fun twit(content: String): Result<WrapperClass<Any>> =
        runCatching { customRetrofit.twit(WriteRequest(content)) }
}