package com.join_seminar.twitter.ui.write.adapter

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.join_seminar.twitter.data.WriteData
import com.join_seminar.twitter.databinding.ItemWriteImgListBinding

class WriteAdapter : RecyclerView.Adapter<WriteAdapter.WriteViewHolder>() {
    val writeList = mutableListOf<WriteData>()

    class WriteViewHolder(val binding : ItemWriteImgListBinding) : RecyclerView.ViewHolder(binding.root){
        fun onBind(data: WriteData) {
           binding.apply {
               write = data
               executePendingBindings()
           }
        }

    }

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WriteViewHolder {
        val binding = ItemWriteImgListBinding.inflate(LayoutInflater.from(parent.context),parent,false)

        return WriteViewHolder(binding)
    }

    override fun onBindViewHolder(holder: WriteViewHolder, position: Int) {
        holder.onBind(writeList[position])
    }

    override fun getItemCount(): Int = writeList.size


}