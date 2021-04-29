package com.ww.module_study

import android.content.Intent
import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ww.module_study.databinding.*
import com.ww.module_study.lifecycle.LifecycleActivity
import com.ww.module_study.lifecycle.LocationServiceActivity
import com.ww.module_study.lifecycle.ProcessLifecycleOwnerActivity
import com.ww.module_study.livedata.LiveData1Activity
import com.ww.module_study.livedata.LiveData2Activity
import com.ww.module_study.viewmodel.ViewModeActivity

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
        //ViewModel
        binding.btnViewmodel.setOnClickListener {
            startActivity(Intent(this, ViewModeActivity::class.java))
        }
        //LiveData1
        binding.btnLivedata1.setOnClickListener {
            startActivity(Intent(this, LiveData1Activity::class.java))
        }
        //LiveData2
        binding.btnLivedata2.setOnClickListener {
            startActivity(Intent(this, LiveData2Activity::class.java))
        }
        //DataBinding1
        binding.btnDatabinding1.setOnClickListener {
            startActivity(Intent(this, DataBinding1Activity::class.java))
        }
        //DataBinding2
        binding.btnDatabinding2.setOnClickListener {
            startActivity(Intent(this, DataBinding2Activity::class.java))
        }
        //DataBinding3
        binding.btnDatabinding3.setOnClickListener {
            startActivity(Intent(this, DataBinding3Activity::class.java))
        }
        //DataBinding4
        binding.btnDatabinding4.setOnClickListener {
            startActivity(Intent(this, DataBinding4Activity::class.java))
        }
        //DataBinding5
        binding.btnDatabinding5.setOnClickListener {
            startActivity(Intent(this, DataBinding5Activity::class.java))
        }
    }

}