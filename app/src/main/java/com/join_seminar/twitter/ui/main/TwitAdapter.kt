package com.join_seminar.twitter.ui.main

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.join_seminar.twitter.data.TwitData
import com.join_seminar.twitter.databinding.ItemTwitListBinding

class TwitAdapter : RecyclerView.Adapter<TwitAdapter.TwitViewHolder>() {
    val twitList = mutableListOf<TwitData>()

    class TwitViewHolder(val binding : ItemTwitListBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(data: TwitData) {
           binding.apply {
               twit = data
               executePendingBindings()
           }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitViewHolder {
        val binding = ItemTwitListBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return TwitViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TwitViewHolder, position: Int) {
        holder.onBind(twitList[position])
    }

    override fun getItemCount(): Int = twitList.size


}