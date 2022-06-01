package com.join_seminar.twitter.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.join_seminar.twitter.databinding.ItemTwitListBinding
import com.join_seminar.twitter.ui.data.response.ResponseTwitList
import okhttp3.internal.notifyAll

class TwitAdapter : RecyclerView.Adapter<TwitAdapter.TwitViewHolder>() {
    var twitList = mutableListOf<ResponseTwitList.Data>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitViewHolder {
        val binding = ItemTwitListBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return TwitViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TwitViewHolder, position: Int) {
        holder.onBind(twitList[position])
    }

    override fun getItemCount(): Int = twitList.size

    class TwitViewHolder(
        private val binding: ItemTwitListBinding
        ) : RecyclerView.ViewHolder(binding.root) {
            fun onBind(data: ResponseTwitList.Data) {
                binding.apply {
                    twit = data
                    executePendingBindings()
                }
        }
    }
}



