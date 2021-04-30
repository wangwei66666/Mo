package com.ww.module_study.databinding.viewmodel

import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.ViewModel

/**
 * @author ww
 * @date 4/30/21.
 * description：
 */
class ScopeViewModel : ViewModel() {
    var aScope = MutableLiveData<Int>(0)
    var bScope = MutableLiveData<Int>(0)

    var aLast = aScope.value
    var bLast = bScope.value

    fun getAScope(): Int {
        return aScope.value!!
    }

    fun getBScope(): Int {
        return bScope.value!!
    }

    fun aScopeAdd(value: Int) {
        saveLastScope()
        aScope.value = aScope.value!! + value
    }

    fun bScopeAdd(value: Int) {
        saveLastScope()
        bScope.value = bScope.value!! + value
    }

    fun undo() {
        aScope.value = aLast
        bScope.value = bLast
    }

    private fun saveLastScope() {
        aLast = aScope.value
        bLast = bScope.value
    }

    fun reset() {
        aScope.value = 0
        bScope.value = 0
    }
}