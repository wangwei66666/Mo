package com.ww.module_study.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ww.module_study.databinding.ActivityLifecycleBinding

/**
 * @author ww
 * @date 4/28/21.
 * description：
 */
class LifecycleActivity : AppCompatActivity() {
    private val binding: ActivityLifecycleBinding by lazy {
        ActivityLifecycleBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        lifecycle.addObserver(binding.lfChronometer)
    }
}