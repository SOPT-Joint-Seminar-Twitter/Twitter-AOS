package com.join_seminar.twitter.ui.write.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.join_seminar.twitter.data.api.ServiceCreator
import com.join_seminar.twitter.data.request.RequestWriteTwit
import com.join_seminar.twitter.data.response.ResponseUserInfoData
import com.join_seminar.twitter.data.response.ResponseWriteTwit
import kotlinx.coroutines.launch

class TwitViewModel() : ViewModel() {

    val requestTwit = RequestWriteTwit("",1)

    private val _postTwit = MutableLiveData<ResponseWriteTwit>()
    val postTwit: LiveData<ResponseWriteTwit>
        get() = _postTwit


    //트윗 작성 서버통신
    fun postTwit(requestWriteTwit: RequestWriteTwit) {
        viewModelScope.launch {
            kotlin.runCatching { ServiceCreator.apiService.postWriteTwit(requestWriteTwit) }
                .onSuccess {
                    _postTwit.value = it
                    Log.d("WriteTwit", "서버 통신 성공")
                }
                .onFailure {
                    it.printStackTrace()
                    Log.d("WriteTwit", "서버 통신 실패")
                }
        }
    }
}