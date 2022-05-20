package com.join_seminar.twitter.ui.write

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.text.Editable
import android.text.TextWatcher
import com.join_seminar.twitter.R
import com.join_seminar.twitter.data.TwitData
import com.join_seminar.twitter.data.WriteData
import com.join_seminar.twitter.databinding.ActivityWriteBinding
import com.join_seminar.twitter.ui.main.adapter.TwitAdapter
import com.join_seminar.twitter.ui.write.adapter.WriteAdapter
import com.sopt.anroid_hyebin.util.BaseActivity

class WriteActivity : BaseActivity<ActivityWriteBinding>(R.layout.activity_write) {

    private lateinit var writeAdapter: WriteAdapter

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
                WriteData(R.drawable.property_1_android_read_profile_main),
                WriteData(R.drawable.andriod_media_3)
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
        if(binding.btnWrite.isSelected) {
            binding.btnWrite.setOnClickListener {
                finish()
            }
        }
    }

    private fun cancelBtnClick() {
        binding.ivWriteDelete.setOnClickListener {
            finish()
        }
    }

}