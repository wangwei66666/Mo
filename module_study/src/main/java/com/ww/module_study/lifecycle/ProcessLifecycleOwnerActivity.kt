package com.ww.module_study.lifecycle

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ww.module_study.databinding.ActivityOwnerLifecycleProcessBinding

/**
 * @author ww
 * @date 4/28/21.
 * description：
 */
class ProcessLifecycleOwnerActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(ActivityOwnerLifecycleProcessBinding.inflate(layoutInflater).root)
    }
}