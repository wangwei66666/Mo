package com.ww.module_study.lifecycle

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ww.module_study.databinding.ActivityServiceLocationBinding
import com.ww.module_study.lifecycle.service.LocationService

/**
 * @author ww
 * @date 4/28/21.
 * description：
 */
class LocationServiceActivity : AppCompatActivity() {
    private val binding: ActivityServiceLocationBinding by lazy {
        ActivityServiceLocationBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        initListener()
    }

    private fun initListener() {
        binding.btnStart.setOnClickListener {
            startService(Intent(this, LocationService::class.java))
        }
        binding.btnStop.setOnClickListener {
            stopService(Intent(this, LocationService::class.java))
        }
    }
}