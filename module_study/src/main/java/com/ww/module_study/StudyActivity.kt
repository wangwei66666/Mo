package com.ww.module_study

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ww.module_study.databinding.ActivityStudyBinding
import com.ww.module_study.lifecycle.LifecycleActivity
import com.ww.module_study.lifecycle.LocationServiceActivity
import com.ww.module_study.lifecycle.ProcessLifecycleOwnerActivity

/**
 * @author ww
 * @date 4/27/21.
 * description：
 */
class StudyActivity : AppCompatActivity() {
    private val binding: ActivityStudyBinding by lazy { ActivityStudyBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        initLisetner()
    }

    private fun initLisetner() {
        //Activity LifecycleOwner
        binding.btnLifecycle.setOnClickListener {
            startActivity(Intent(this, LifecycleActivity::class.java))
        }
        //LifecycleService & Service LifecycleOwner
        binding.btnLifecycleService.setOnClickListener {
            startActivity(Intent(this, LocationServiceActivity::class.java))
        }
        //ProcessLifecycleOwner
        binding.btnProcessLifecycleOwner.setOnClickListener {
            startActivity(Intent(this, ProcessLifecycleOwnerActivity::class.java))
        }
    }

}