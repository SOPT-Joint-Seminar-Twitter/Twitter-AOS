package com.join_seminar.twitter.ui.main

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.google.android.material.tabs.TabLayoutMediator
import com.join_seminar.twitter.R
import com.join_seminar.twitter.databinding.ActivityHomeBinding
import com.join_seminar.twitter.ui.write.WriteActivity

class HomeActivity : AppCompatActivity() {

    private lateinit var binding: ActivityHomeBinding
    private lateinit var tabViewPagerAdapter: TabViewPagerAdapter

    // 통신할 때 이거 사용하면 됌
    //private val retrofitBuilder = customRetrofit

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(binding.root)

        initAdapter()
        initTabLayout()
        writeTwit()
    }

    private fun initAdapter() {
        val fragmentList = listOf(
            InfoFragment(),
            TwitFragment(),
            ReplyFragment(),
            MediaFragment(),
            FancyFragment()
        )

        tabViewPagerAdapter = TabViewPagerAdapter(this)
        tabViewPagerAdapter.fragments.addAll(fragmentList)
        binding.vpHomeTab.adapter = tabViewPagerAdapter
    }

    private fun initTabLayout() {
        val tabLabel = resources.getStringArray(R.array.tap_list)

        TabLayoutMediator(binding.tlHomeTab, binding.vpHomeTab) { tab, position ->
            tab.text = tabLabel[position]
        }.attach()
    }

    private fun writeTwit() {
        binding.btnHomeWriteTwit.setOnClickListener {
            val intent = Intent(this, WriteActivity::class.java)
            startActivity(intent)
        }
    }
}