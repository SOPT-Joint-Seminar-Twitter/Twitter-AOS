package com.join_seminar.twitter.ui.write

import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import android.util.Log
import androidx.activity.viewModels
import com.join_seminar.twitter.R
import com.join_seminar.twitter.data.WriteData
import com.join_seminar.twitter.data.request.RequestWriteTwit
import com.join_seminar.twitter.databinding.ActivityWriteBinding
import com.join_seminar.twitter.ui.write.adapter.WriteAdapter
import com.join_seminar.twitter.ui.write.viewmodel.TwitViewModel
import com.sopt.anroid_hyebin.util.BaseActivity

class WriteActivity : BaseActivity<ActivityWriteBinding>(R.layout.activity_write) {

    private lateinit var writeAdapter: WriteAdapter
    private val twitViewModel: TwitViewModel by viewModels()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        initAdapter()

        initWrite()
        tweetBtnClick()
        cancelBtnClick()
    }

    private fun initAdapter() {
        writeAdapter = WriteAdapter()
        binding.rvWriteImgList.adapter = writeAdapter

        writeAdapter.writeList.addAll(
            listOf(
                WriteData(R.drawable.android_media_bar_ic_camera),
                WriteData(R.drawable.andriod_media_1),
                WriteData(R.drawable.andriod_media_2),
                WriteData(R.drawable.andriod_media_3),
                WriteData(R.drawable.andriod_media_2),
                WriteData(R.drawable.andriod_media_1)

            )
        )

        writeAdapter.notifyDataSetChanged()
    }

    private fun initWrite() = with(binding) {

        etWriteInput.addTextChangedListener(object : TextWatcher {
            override fun beforeTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}
            override fun onTextChanged(p0: CharSequence?, p1: Int, p2: Int, p3: Int) {}

            override fun afterTextChanged(p0: Editable?) {
                //닉네임 textfield 빈칸인지 체크
                btnWrite.isSelected = etWriteInput.text.toString() != ""
            }

        })
    }

    private fun tweetBtnClick() {
        binding.btnWrite.setOnClickListener {
            twitViewModel.requestTwit.content = binding.etWriteInput.text.toString()
            twitViewModel.postTwit(RequestWriteTwit(twitViewModel.requestTwit.content,twitViewModel.requestTwit.writer))
            finish()
        }
    }

    private fun cancelBtnClick() {
        binding.ivWriteDelete.setOnClickListener {
            finish()
        }
    }
}