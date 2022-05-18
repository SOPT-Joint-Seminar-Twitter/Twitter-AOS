package com.join_seminar.twitter.ui.write

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.join_seminar.twitter.R
import com.join_seminar.twitter.databinding.ActivityWriteBinding

class WriteActivity : AppCompatActivity() {
    private lateinit var binding: ActivityWriteBinding
    private lateinit var writeAdapter: WriteAdapter
    private val viewModel: WriteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView<ActivityWriteBinding?>(this, R.layout.activity_write)
                .apply {
                    vm = viewModel
                    lifecycleOwner = this@WriteActivity
                }
        initAdapter()
    }

    private fun initAdapter() {
        writeAdapter = WriteAdapter()
        binding.rvWriteImgList.adapter = writeAdapter
        writeAdapter.submitList(photoList)
    }

    companion object {
        val photoList = listOf(
            Pair(0, R.drawable.android_media_bar_ic_camera),
            Pair(1, R.drawable.android_profile_main),
            Pair(2, R.drawable.android_profile_small_1),
            Pair(3, R.drawable.android_profile_small_2),
            Pair(4, R.drawable.android_profile_small_3),
            Pair(5, R.drawable.andriod_media_1),
            Pair(6, R.drawable.andriod_media_2),
            Pair(7, R.drawable.andriod_media_3),
        )
    }
}