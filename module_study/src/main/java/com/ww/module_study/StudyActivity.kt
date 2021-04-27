package com.ww.module_study

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ww.module_study.databinding.ActivityStudyBinding

/**
 * @author ww
 * @date 4/27/21.
 * description：
 */
class StudyActivity: AppCompatActivity(){
    private val binding: ActivityStudyBinding by lazy { ActivityStudyBinding.inflate(layoutInflater) }
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
    }

}