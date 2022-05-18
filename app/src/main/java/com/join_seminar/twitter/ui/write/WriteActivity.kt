package com.join_seminar.twitter.ui.write

import android.os.Bundle
import androidx.activity.viewModels
import androidx.appcompat.app.AppCompatActivity
import androidx.databinding.DataBindingUtil
import com.join_seminar.twitter.R
import com.join_seminar.twitter.databinding.ActivityWriteBinding

class WriteActivity : AppCompatActivity() {
    lateinit var binding: ActivityWriteBinding
    private val viewModel: WriteViewModel by viewModels()
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        binding =
            DataBindingUtil.setContentView<ActivityWriteBinding?>(this, R.layout.activity_write)
                .apply {
                    vm = viewModel
                    lifecycleOwner = this@WriteActivity
                }
    }
}