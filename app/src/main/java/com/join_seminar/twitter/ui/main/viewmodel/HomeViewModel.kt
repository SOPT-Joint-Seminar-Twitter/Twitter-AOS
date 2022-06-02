package com.join_seminar.twitter.ui.main.viewmodel

import android.util.Log
import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.join_seminar.twitter.data.api.ServiceCreator
import com.join_seminar.twitter.data.request.RequestWriteTwit
import com.join_seminar.twitter.data.response.ResponseLike
import com.join_seminar.twitter.data.response.ResponseTwitList
import com.join_seminar.twitter.data.response.ResponseUserInfoData
import com.join_seminar.twitter.data.response.ResponseWriteTwit
import kotlinx.coroutines.launch

class HomeViewModel() : ViewModel() {

    private val _userInfo = MutableLiveData<ResponseUserInfoData>()
    val userInfo: LiveData<ResponseUserInfoData>
        get() = _userInfo


    private val _twitList = MutableLiveData<ResponseTwitList>()
    val twitList: LiveData<ResponseTwitList>
        get() = _twitList

    private val _twitlike = MutableLiveData<ResponseLike>()
    val twitLike: LiveData<ResponseLike>
        get() = _twitlike

    private val _twitData = MutableLiveData<List<ResponseTwitList.Data>>()
    val twitData : LiveData<List<ResponseTwitList.Data>>
    get() = _twitData

    //user info 서버 통신
    fun getUserInfo() {
        viewModelScope.launch {
            kotlin.runCatching { ServiceCreator.apiService.getUserInfo() }
                .onSuccess {
                    _userInfo.value = it
                    Log.d("UserInfo", "서버 통신 성공")
                }
                .onFailure {
                    it.printStackTrace()
                    Log.d("UserInfo", "서버 통신 실패")
                }
        }
    }

    //twit list 서버통신
    fun getTwitList() {
        viewModelScope.launch {
            kotlin.runCatching { ServiceCreator.apiService.getTwitList() }
                .onSuccess {
                    _twitList.value = it
                    Log.d("TwitList", "서버 통신 성공")
                }
                .onFailure {
                    it.printStackTrace()
                    Log.d("TwitList", "서버 통신 실패")
                }
        }
    }

    //좋아요 서버통신
    fun postLike(type: String) {
        viewModelScope.launch {
            kotlin.runCatching { ServiceCreator.apiService.postLike(type) }
                .onSuccess {
                    _twitlike.value = it
                    Log.d("like", "서버 통신 성공")
                }
                .onFailure {
                    it.printStackTrace()
                    Log.d("like", "서버 통신 실패")
                }
        }
    }

}