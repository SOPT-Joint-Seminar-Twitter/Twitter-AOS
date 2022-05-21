package com.join_seminar.twitter.ui.main.adapter

import androidx.fragment.app.Fragment
import androidx.viewpager2.adapter.FragmentStateAdapter
import com.join_seminar.twitter.ui.main.HomeActivity

class HomeTabAdapter(activity: HomeActivity) : FragmentStateAdapter(activity){
    val fragments = mutableListOf<Fragment>()

    override fun getItemCount(): Int = fragments.size

    override fun createFragment(position: Int): Fragment = fragments[position]

}