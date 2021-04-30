package com.ww.module_study.databinding

import android.os.Bundle
import androidx.appcompat.app.AppCompatActivity
import com.ww.module_study.databinding.bean.User
import com.ww.module_study.databinding.handle.EventHandleListener
import com.ww.module_study.databinding.viewmodel.BaseObservableUser
import com.ww.module_study.databinding.viewmodel.ObservableFieldUser
import kotlin.math.roundToInt

/**
 * @author ww
 * @date 4/29/21.
 * description：
 */
class DataBinding4Activity : AppCompatActivity() {
    private val binding: Activity4BindingDataBinding by lazy {
        Activity4BindingDataBinding.inflate(
            layoutInflater
        )
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(binding.root)

        binding.baseObserverableUser = BaseObservableUser()
        binding.observerableFieldUser = ObservableFieldUser()
    }

}