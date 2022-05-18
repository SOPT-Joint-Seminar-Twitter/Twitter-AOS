package com.join_seminar.twitter.ui.main

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.google.android.material.tabs.TabLayoutMediator
import com.join_seminar.twitter.R
import com.join_seminar.twitter.databinding.ActivityHomeBinding
import com.sopt.anroid_hyebin.util.BaseActivity

class HomeActivity : BaseActivity<ActivityHomeBinding>(R.layout.activity_home) {

    private lateinit var homeTabAdapter: HomeTabAdapter

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initAdapter()
        initTab()

    }


    private fun initAdapter() {
        val fragmentList = listOf(InfoFragment(), TwitFragment(),ReplyFragment(),MediaFragment(), MindFragment())
        homeTabAdapter = HomeTabAdapter(this)
        homeTabAdapter.fragments.addAll(fragmentList)


        binding.vpHome.adapter = homeTabAdapter

    }

    private fun initTab(){
        val tabLabel = listOf("정보", "트윗", "트윗과답글", "미디어", "마음에 들어요")
        TabLayoutMediator(binding.tabHome, binding.vpHome) {tab, position ->
            tab.text = tabLabel[position]
        }.attach()
    }


}