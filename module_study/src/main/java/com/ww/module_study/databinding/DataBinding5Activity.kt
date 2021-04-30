package com.ww.module_study.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.ViewModelProvider
import com.ww.module_study.databinding.bean.User
import com.ww.module_study.databinding.handle.EventHandleListener
import com.ww.module_study.databinding.viewmodel.ScopeViewModel
import kotlin.math.roundToInt

/**
 * @author ww
 * @date 4/29/21.
 * description：
 */
class DataBinding5Activity : AppCompatActivity() {
    private var scopeVM: ScopeViewModel? = null
    private val binding: Activity5BindingDataBinding by lazy {
        Activity5BindingDataBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        scopeVM = ViewModelProvider(this).get(ScopeViewModel::class.java)
        binding.scopeVm = scopeVM
        binding.lifecycleOwner = this
    }

}