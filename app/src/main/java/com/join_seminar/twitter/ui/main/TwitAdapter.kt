package com.join_seminar.twitter.ui.main

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.join_seminar.twitter.databinding.ItemTwitListBinding
import com.join_seminar.twitter.ui.data.response.ResponseTwitList
import okhttp3.internal.notifyAll

class TwitAdapter : RecyclerView.Adapter<TwitAdapter.TwitViewHolder>() {

    var twitList = mutableListOf<ResponseTwitList.Data>()

    private lateinit var mlistener : onItemClickListener

    interface onItemClickListener {
        fun onItemClick(user: String, position: Int)
    }

    fun setOnItemClickListener(listener: onItemClickListener) {
        mlistener = listener
    }

    fun plus(count: Int, like: Boolean, position: Int) {
        twitList[position].isRetwit = like
        twitList[position].likeCount = count
        notifyDataSetChanged()
    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitViewHolder {
        val binding = ItemTwitListBinding.inflate(
            LayoutInflater.from(parent.context), parent, false)

        return TwitViewHolder(binding,mlistener)
    }

    override fun onBindViewHolder(holder: TwitViewHolder, position: Int) {
        holder.onBind(twitList[position])
    }

    override fun getItemCount(): Int = twitList.size

    class TwitViewHolder(private val binding: ItemTwitListBinding , listener: onItemClickListener
        ) : RecyclerView.ViewHolder(binding.root) {
            fun onBind(data: ResponseTwitList.Data) {
                binding.apply {
                    twit = data
                    executePendingBindings()
                }
        }

        val retwit = binding.ivItemRetwit

        init {
            retwit.setOnClickListener {
                listener.onItemClick(binding.twit!!._id,adapterPosition)
            }
        }

    }
}



