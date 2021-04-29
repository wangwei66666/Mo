package com.ww.module_study.livedata.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel
import java.util.*

/**
 * @author ww
 * @date 4/29/21.
 * description：
 */
class ScopeViewModel : ViewModel() {

    var scope: MutableLiveData<Int> = MutableLiveData<Int>(0)

    fun startTimer() {
        Timer().schedule(object : TimerTask() {
            override fun run() {
                scope.postValue((scope.value?.plus(1)))
            }

        }, 1000, 1000)
    }
}