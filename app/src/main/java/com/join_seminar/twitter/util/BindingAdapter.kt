package com.join_seminar.twitter.util

import android.view.View
import android.widget.Button
import android.widget.ImageView
import android.widget.TextView
import com.bumptech.glide.Glide
import androidx.databinding.BindingAdapter

object BindingAdapter {
    @JvmStatic
    @BindingAdapter("imageBind")
    fun setImage(imageView: ImageView, imageUrl: Int) {
        Glide.with(imageView.context)
            .load(imageUrl)
            .circleCrop()
            .into(imageView)

    }

    @JvmStatic
    @BindingAdapter("writeImageBind")
    fun writeImageBind(imageView: ImageView, imageUrl: Int) {
        Glide.with(imageView.context)
            .load(imageUrl)
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

    //int -> String
    @JvmStatic
    @BindingAdapter("intToText")
    fun getIntToText(textView: TextView, int: Int): String {
        return int.toString().also { textView.text = it }
    }
}