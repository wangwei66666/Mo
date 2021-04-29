package com.ww.module_study.databinding.bindingadapter

import android.graphics.Color
import android.text.TextUtils
import android.widget.ImageView
import androidx.databinding.BindingAdapter
import com.squareup.picasso.Picasso
import com.ww.module_study.R

/**
 * @author ww
 * @date 4/29/21.
 * description：
 */
object ImageViewBindingAdapter {

    @BindingAdapter("image")
    @JvmStatic
    fun setImage(iv: ImageView, url: String) {
        if (!TextUtils.isEmpty(url)) {
            Picasso.get().load(url).placeholder(R.mipmap.ic_launcher).into(iv)
        } else {
            iv.setBackgroundColor(Color.RED)
        }
    }

    @BindingAdapter("image")
    @JvmStatic
    fun setImage(iv: ImageView, resId: Int) {
        iv.setImageResource(resId)
    }

    @BindingAdapter("image", "defaultImage", requireAll = false)
    @JvmStatic
    fun setImage(iv: ImageView, url: String, resId: Int) {
        if (!TextUtils.isEmpty(url)) {
            Picasso.get().load(url).placeholder(R.mipmap.ic_launcher).into(iv)
        } else {
            iv.setImageResource(resId)
        }
    }

}