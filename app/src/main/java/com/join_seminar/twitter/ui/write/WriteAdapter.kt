package com.join_seminar.twitter.ui.write

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.DiffUtil
import androidx.recyclerview.widget.ListAdapter
import androidx.recyclerview.widget.RecyclerView
import coil.load
import com.join_seminar.twitter.databinding.WriteRecyclerviewItemBinding

class WriteAdapter : ListAdapter<Pair<Int, Int>, WriteAdapter.WriteViewHolder>(WRITE_COMPARATOR) {
    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): WriteViewHolder {
        val view =
            WriteRecyclerviewItemBinding.inflate(LayoutInflater.from(parent.context), parent, false)
        return WriteViewHolder(view)
    }

    override fun onBindViewHolder(holder: WriteViewHolder, position: Int) {
        val current = getItem(position)
        holder.bind(current)
    }

    class WriteViewHolder(private val binding: WriteRecyclerviewItemBinding) :
        RecyclerView.ViewHolder(binding.root) {

        fun bind(pair: Pair<Int, Int>) {
            binding.ivWriteRvItem.load(pair.second)
        }
    }

    companion object {
        private val WRITE_COMPARATOR = object : DiffUtil.ItemCallback<Pair<Int, Int>>() {
            override fun areItemsTheSame(
                oldItem: Pair<Int, Int>,
                newItem: Pair<Int, Int>
            ): Boolean {
                return oldItem === newItem
            }

            override fun areContentsTheSame(
                oldItem: Pair<Int, Int>,
                newItem: Pair<Int, Int>
            ): Boolean {
                return oldItem.first == newItem.first
            }
        }
    }
}
