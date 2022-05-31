package com.join_seminar.twitter.ui.main

import android.os.Bundle
import android.view.View
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.lifecycle.ViewModel
import com.join_seminar.twitter.R
import com.join_seminar.twitter.data.TwitData
import com.join_seminar.twitter.data.response.ResponseTwitList
import com.join_seminar.twitter.databinding.FragmentTwitBinding
import com.join_seminar.twitter.ui.main.adapter.TwitAdapter
import com.join_seminar.twitter.ui.main.viewmodel.HomeViewModel
import com.sopt.anroid_hyebin.util.BaseFragment

class TwitFragment : BaseFragment<FragmentTwitBinding>(R.layout.fragment_twit) {
    private lateinit var twitAdapter: TwitAdapter
    private val homeViewModel : HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        twitAdapter = TwitAdapter()
        binding.rvFollower.adapter = twitAdapter

        homeViewModel.getTwitList()
        homeViewModel.twitList.observe(viewLifecycleOwner) {
            twitAdapter.setQuestionPost((it.data) as MutableList<ResponseTwitList.Data>)
        }




        /*
        twitAdapter.twitList.addAll(
            listOf(
                TwitData(R.drawable.property_1_android_read_profile_main, "마먁", "@hoho_0518",
                "0초", "트위터로 글 작성하기~! 안드!💛","","","",false),
                TwitData(R.drawable.android_profile_small_2, "청주여자교도소", "@lesjail",
                    "1일", "누가 날 깎아내랴도 아 내가 조각이구나 하고 사는 마음가짐 ","3","21.9K","15.5K",true),
                TwitData(R.drawable.android_profile_small_3, "강리", "@kim_kangri",
                    "2일", "최근 들은 음악을 영수증 형태의 이미지로\n" +
                            "만들어주는 웹사이트 Receiptify를\n" +
                            "발견했는데 제법 귀엽다. ","3","3","3",true)
            )
        )

         */

    }
}
