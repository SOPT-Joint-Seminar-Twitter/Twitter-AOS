package com.join_seminar.twitter.ui.main

import android.os.Bundle
import android.util.Log
import android.view.View
import com.join_seminar.twitter.R
import com.join_seminar.twitter.databinding.FragmentTwitBinding
import com.join_seminar.twitter.ui.base.BaseFragment
import com.join_seminar.twitter.ui.data.RetrofitBuilder
import com.join_seminar.twitter.ui.data.enqueueUtil
import com.join_seminar.twitter.ui.data.request.RequestHeart
import com.join_seminar.twitter.ui.data.response.ResponseHeart
import com.join_seminar.twitter.ui.data.response.ResponseTwitList
import retrofit2.Call


class TwitFragment : BaseFragment<FragmentTwitBinding>(R.layout.fragment_twit) {
    private lateinit var twitAdapter: TwitAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)

        twitAdapter = TwitAdapter()
        binding.rvTwit.adapter = twitAdapter

        heartNetwork()
        twitListNetWork()
    }

    private fun twitListNetWork() {

        val call: Call<ResponseTwitList> = RetrofitBuilder.customRetrofit.getTwitList()

        call.enqueueUtil(
            onSuccess = {
                val data = it.data
                if (data != null) {
                    twitAdapter.twitList = data.toMutableList()
                }
                twitAdapter.notifyDataSetChanged()

                Log.d("twitLisNetWork", "서버 통신 성공")
            },
            onError = {
                Log.d("twitLisNetWork", "서버 통신 실패")
            }
        )

//        twitAdapter.twitList.addAll(
//            listOf(
//                TwitData(R.drawable.property_1_android_read_profile_main, "마먁", "@hoho_0518",
//                    "0초", "트위터로 글 작성하기~! 안드!","","","",false),
//                TwitData(R.drawable.android_profile_small_2, "청주여자교도소", "@lesjail",
//                    "1일", "누가 날 깎아내랴도 아 내가 조각이구나 하고 사는 마음가짐 ","3","21.9K","15.5K",true),
//                TwitData(R.drawable.android_profile_small_3, "강리", "@kim_kangri",
//                    "2일", "최근 들은 음악을 영수증 형태의 이미지로\n" +
//                            "만들어주는 웹사이트 Receiptify를\n" +
//                            "발견했는데 제법 귀엽다. ","3","3","3",true)
//            )
//        )
    }

    private fun heartNetwork(){

        twitAdapter.setOnItemClickListener(object : TwitAdapter.onItemClickListener {
            override fun onItemClick(user: String,position:Int) {
                val call: Call<ResponseHeart> = RetrofitBuilder.customRetrofit.postHeart(user)
                call.enqueueUtil(
                    onSuccess = {
                        Log.d("heartNetwork", "${it.data} 좋아요 통신 성공")
                        twitAdapter.plus(it.data.likeCount,it.data.isLike,position)
                    },
                    onError = {
                        Log.d("heartNetwork", "좋아요 통신 실패")

                    }
                )
            }
        })

    }
}