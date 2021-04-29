package com.ww.module_study.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ww.module_study.databinding.bean.User
import kotlin.math.roundToInt

/**
 * @author ww
 * @date 4/29/21.
 * description：
 */
class DataBinding1Activity : AppCompatActivity() {

    private val binding: Activity1BindingDataBinding by lazy {
        Activity1BindingDataBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.user = User("机器人", (Math.random()*5+1).roundToInt())
    }

}