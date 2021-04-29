package com.ww.module_study.viewmodel

import android.os.Bundle
import android.os.PersistableBundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.ViewModelProvider
import androidx.lifecycle.ViewModelProviders
import com.ww.module_study.databinding.ActivityModelViewBinding
import com.ww.module_study.viewmodel.vm.ScopeViewModel

/**
 * @author ww
 * @date 4/28/21.
 * description：
 */
class ViewModeActivity : AppCompatActivity() {
    private val binding: ActivityModelViewBinding by lazy {
        ActivityModelViewBinding.inflate(
            layoutInflater
        )
    }

    private var scopeVM:ScopeViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        scopeVM = ViewModelProvider(this).get(ScopeViewModel::class.java)
        initListener()
        binding.tvScope.text = "${scopeVM!!.scope}"
    }

    private fun initListener() {
        binding.btnAdd.setOnClickListener{
            binding.tvScope.text = "${++scopeVM!!.scope}"
        }
    }
}