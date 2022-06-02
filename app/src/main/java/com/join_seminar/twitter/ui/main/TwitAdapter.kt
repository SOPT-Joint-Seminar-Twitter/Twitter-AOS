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

    interface onItemClickListener{
        fun onItemClick(likeNum: Int,isLike : Boolean)
    }

    fun setOnItemClickListener(listener: onItemClickListener){
        mlistener = listener
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

        val like = binding.ivItemHeart


        init{
            like.setOnClickListener{

                val likeNum =binding.twit.likeCount
                val isLike=binding.twit.isRetwit

                listener.onItemClick(likeNum,isLike )
            }
        }

    }
}



