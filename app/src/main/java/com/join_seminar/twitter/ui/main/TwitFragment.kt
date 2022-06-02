package com.join_seminar.twitter.ui.main

import android.os.Bundle
import android.view.View
import androidx.fragment.app.viewModels
import com.join_seminar.twitter.R
import com.join_seminar.twitter.data.response.ResponseTwitList
import com.join_seminar.twitter.databinding.FragmentTwitBinding
import com.join_seminar.twitter.ui.main.adapter.TwitAdapter
import com.join_seminar.twitter.ui.main.viewmodel.HomeViewModel
import com.sopt.anroid_hyebin.util.BaseFragment

class TwitFragment : BaseFragment<FragmentTwitBinding>(R.layout.fragment_twit) {
    private lateinit var twitAdapter: TwitAdapter
    private val homeViewModel: HomeViewModel by viewModels()

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
        super.onViewCreated(view, savedInstanceState)
        initAdapter()
        //setClickListener()
    }

    private fun initAdapter() {
        twitAdapter = TwitAdapter()
        binding.rvFollower.adapter = twitAdapter

        homeViewModel.getTwitList()
        homeViewModel.twitList.observe(viewLifecycleOwner) {
            twitAdapter.setQuestionPost((it.data) as MutableList<ResponseTwitList.Data>)
        }

    }

    private fun setClickListener() {
        twitAdapter = TwitAdapter()
        twitAdapter.setItemClickListener(
            object : TwitAdapter.ItemClickListener {
                val twitData = homeViewModel.twitData.value

                override fun onClick(view: View, position: Int) {
                    val postId = twitData?.get(position)?._id
                    if (postId != null) {
                        homeViewModel.postLike(postId)
                        homeViewModel.twitLike.observe(viewLifecycleOwner) {

                        }
                    }
                }
            })
    }
}
