package com.join_seminar.twitter.ui.main.adapter

import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.activity.viewModels
import androidx.fragment.app.viewModels
import androidx.recyclerview.widget.RecyclerView
import com.join_seminar.twitter.data.TwitData
import com.join_seminar.twitter.data.api.ApiService
import com.join_seminar.twitter.data.response.ResponseTwitList
import com.join_seminar.twitter.databinding.ItemTwitListBinding
import com.join_seminar.twitter.ui.main.viewmodel.HomeViewModel

class TwitAdapter : RecyclerView.Adapter<TwitAdapter.TwitViewHolder>() {
    var twitList = mutableListOf<ResponseTwitList.Data>()


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): TwitViewHolder {
        val binding = ItemTwitListBinding.inflate(LayoutInflater.from(parent.context),parent,false)
        return TwitViewHolder(binding)
    }

    override fun onBindViewHolder(holder: TwitViewHolder, position: Int) {
        holder.onBind(twitList[position])
        holder.binding.ivHomeHeart.setOnClickListener {

        }
    }

    override fun getItemCount(): Int = twitList.size



    class TwitViewHolder(val binding : ItemTwitListBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(data: ResponseTwitList.Data) {
            binding.apply {
                twit = data
                executePendingBindings()
            }
        }
    }

    fun setQuestionPost(data: MutableList<ResponseTwitList.Data>) {
        this.twitList = data
        notifyDataSetChanged()

    }

    interface ItemClickListener {
        fun onClick(view: View, position: Int)
    }

    private lateinit var itemClickListener: ItemClickListener

    fun setItemClickListener(itemClickListener: Any) {
        //this.itemClickListener = itemClickListener
    }
}
