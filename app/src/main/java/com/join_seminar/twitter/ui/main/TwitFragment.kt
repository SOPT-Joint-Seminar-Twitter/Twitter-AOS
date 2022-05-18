package com.join_seminar.twitter.ui.main

import android.os.Bundle
import android.view.View
import com.join_seminar.twitter.R
import com.join_seminar.twitter.data.TwitData
import com.join_seminar.twitter.databinding.FragmentTwitBinding
import com.sopt.anroid_hyebin.util.BaseFragment

class TwitFragment : BaseFragment<FragmentTwitBinding>(R.layout.fragment_twit) {
    private lateinit var twitAdapter: TwitAdapter
    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
    }

    private fun initAdapter() {
        twitAdapter = TwitAdapter()
        binding.rvFollower.adapter = twitAdapter

        twitAdapter.twitList.addAll(
            listOf(
                TwitData(R.drawable.property_1_android_read_profile_main, "마먁", "@hoho_0518",
                "0초", "트위터로 글 작성하기~! 안드!💛","","","",true)
            )
        )
        twitAdapter.notifyDataSetChanged()
    }
}
