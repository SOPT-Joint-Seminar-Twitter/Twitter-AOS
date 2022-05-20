package com.join_seminar.twitter.ui.main

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.DividerItemDecoration
import com.join_seminar.twitter.R
import com.join_seminar.twitter.databinding.FragmentTwitBinding

class TwitFragment : Fragment() {

    private lateinit var twitAdapter: TwitAdapter
    private var _binding : FragmentTwitBinding? = null
    private val binding get() = _binding!!

    override fun onCreateView(inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        _binding = FragmentTwitBinding.inflate(layoutInflater,container,false)

        binding.rvTwit.addItemDecoration(DividerItemDecoration(context,1)) // 구분선 설정
        initAdapter()
        return binding.root
    }

    private fun initAdapter() {
        twitAdapter = TwitAdapter()
        _binding?.rvTwit?.adapter = twitAdapter

        twitAdapter.twitList.addAll(
            listOf(
                TwitData(R.drawable.android_profile_small_1, "마먁", "@hoho_0518",
                    "0초", "트위터로 글 작성하기~! 안드!","","",""),
                TwitData(R.drawable.android_profile_small_2, "청주여자교도소", "@lesjail",
                    "1일", "누가 날 깎아내랴도 아 내가 조각이구나 하고 사는 마음가짐 ","3","21.9K","15.5K"),
                TwitData(R.drawable.android_profile_small_3, "강리", "@kim_kangri",
                    "2일", "최근 들은 음악을 영수증 형태의 이미지로\n" +
                            "만들어주는 웹사이트 Receiptify를\n" +
                            "발견했는데 제법 귀엽다. ","","","")
            )
        )

        twitAdapter.notifyDataSetChanged()
    }

    override fun onDestroyView() {
        super.onDestroyView()
        _binding = null
    }

}