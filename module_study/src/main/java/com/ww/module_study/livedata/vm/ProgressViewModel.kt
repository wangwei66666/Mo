package com.ww.module_study.livedata.vm

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author ww
 * @date 4/29/21.
 * description：
 */
class ProgressViewModel : ViewModel() {

    var progress: MutableLiveData<Int> = MutableLiveData<Int>(0)

    fun setProgress(value: Int) {
        progress.postValue(value)
    }
}