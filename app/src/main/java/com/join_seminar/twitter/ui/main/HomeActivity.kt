package com.join_seminar.twitter.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import com.google.android.material.tabs.TabLayoutMediator
import com.join_seminar.twitter.R
import com.join_seminar.twitter.data.api.ApiService
import com.join_seminar.twitter.data.api.ServiceCreator
import com.join_seminar.twitter.databinding.ActivityHomeBinding
import com.join_seminar.twitter.ui.main.adapter.HomeTabAdapter
import com.join_seminar.twitter.ui.main.viewmodel.HomeViewModel
import com.join_seminar.twitter.ui.write.WriteActivity
import com.sopt.anroid_hyebin.util.BaseActivity

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {

    private lateinit var homeTabAdapter: HomeTabAdapter
    private val homeViewModel : HomeViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initAdapter()
        initTab()
        initBtnEvent()
        initNetwork()

    }


    private fun initAdapter() {
        val fragmentList = listOf(InfoFragment(), TwitFragment(),ReplyFragment(),MediaFragment(), MindFragment())
        homeTabAdapter = HomeTabAdapter(this)
        homeTabAdapter.fragments.addAll(fragmentList)


        binding.vpHome.adapter = homeTabAdapter

    }

    private fun initNetwork() {
        homeViewModel.getUserInfo()
        homeViewModel.userInfo.observe(this){
            binding.user = it.data
        }
    }

    private fun initTab(){
        val tabLabel = listOf("정보", "트윗", "트윗과답글", "미디어", "마음에 들어요")
        TabLayoutMediator(binding.tabHome, binding.vpHome) {tab, position ->
            tab.text = tabLabel[position]
        }.attach()
    }

    private fun initBtnEvent() {
        binding.ivHomeBtn.setOnClickListener {
            val intent = Intent(this, WriteActivity::class.java)
            startActivity(intent)
        }
    }

}