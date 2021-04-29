package com.ww.module_study.livedata

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.Observer
import androidx.lifecycle.ViewModelProvider
import com.ww.module_study.databinding.Activity1DataLiveBinding
import com.ww.module_study.livedata.vm.ScopeViewModel

/**
 * @author ww
 * @date 4/29/21.
 * description：
 */
class LiveData1Activity : AppCompatActivity() {
    private val binding: Activity1DataLiveBinding by lazy {
        Activity1DataLiveBinding.inflate(
            layoutInflater
        )
    }

    private var scopeVm: ScopeViewModel? = null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)
        scopeVm = ViewModelProvider(this).get(ScopeViewModel::class.java)

        binding.tvScope.text = "${scopeVm!!.scope.value}"

        binding.btnStart.setOnClickListener {
            scopeVm!!.startTimer()
        }

        scopeVm!!.scope.observe(this,
            Observer<Int> {
                binding.tvScope.text = "$it"
            })
    }
}