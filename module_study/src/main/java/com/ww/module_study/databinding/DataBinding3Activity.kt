package com.ww.module_study.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ww.module_study.databinding.bean.User
import com.ww.module_study.databinding.handle.EventHandleListener
import kotlin.math.roundToInt

/**
 * @author ww
 * @date 4/29/21.
 * description：
 */
class DataBinding3Activity:AppCompatActivity() {
    private val binding: Activity3BindingDataBinding by lazy {
        Activity3BindingDataBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.user = User("明星", (Math.random()*5+1).roundToInt())
        binding.eventHandle = EventHandleListener(this)
    }

}