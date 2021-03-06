package com.join_seminar.twitter.ui.util

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import androidx.databinding.BindingAdapter
import com.bumptech.glide.Glide

object BindingAdapter {
    @BindingAdapter("isText")
    @JvmStatic
    fun Button.bindIsText(isText: Boolean) {
        isSelected = isText
        isClickable = !isText
    }

    @JvmStatic
    @BindingAdapter("imageBind")
    fun setImage(imageView: ImageView, imageUrl: Int) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .circleCrop()
            .into(imageView)

    }

    //리트윗 확인 -> textview
    @JvmStatic
    @BindingAdapter("twitCheck")
    fun twitCheck(textView: TextView, twit: Boolean) {
        if(!twit){
            textView.visibility = View.GONE
        }else{
            textView.visibility = View.VISIBLE
        }
    }

    //리트윗 -> icon
    @JvmStatic
    @BindingAdapter("twitCheckIcon")
    fun twitCheckIcon(imageView: ImageView, twit: Boolean) {
        imageView.isSelected = twit
    }

    //리트윗 -> text
    @JvmStatic
    @BindingAdapter("twitCheckText")
    fun twitCheckText(textView: TextView, twit: Boolean) {
        textView.isSelected = twit
    }


    //likeCount int -> String 으로 바꿔줘야하는 걸 여기에다가 하는건지
}