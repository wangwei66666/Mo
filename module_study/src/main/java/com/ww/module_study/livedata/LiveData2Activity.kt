package com.ww.module_study.livedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ww.module_study.databinding.Activity2DataLiveBinding

/**
 * @author ww
 * @date 4/29/21.
 * description：
 */
class LiveData2Activity : AppCompatActivity() {
    private val binding: Activity2DataLiveBinding by lazy {
        Activity2DataLiveBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }
}