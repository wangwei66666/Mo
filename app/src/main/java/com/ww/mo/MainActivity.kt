package com.ww.mo

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.ww.mo.databinding.ActivityMainBinding
import com.ww.module_study.StudyActivity

class MainActivity : AppCompatActivity() {

    private val binding: ActivityMainBinding by lazy { ActivityMainBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        binding.lottieAnimation.speed = 1.5f
        binding.btnJetpack.setOnClickListener {
            startActivity(Intent(this,StudyActivity::class.java))
        }
    }
}