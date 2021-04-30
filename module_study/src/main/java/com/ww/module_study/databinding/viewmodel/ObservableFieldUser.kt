package com.ww.module_study.databinding.viewmodel

import android.text.TextUtils
import android.util.Log
import androidx.databinding.ObservableField
import com.ww.module_study.databinding.bean.User

/**
 * @author ww
 * @date 4/30/21.
 * description：
 */
class ObservableFieldUser {

    var observableUser = ObservableField<User>()

    init {
        observableUser.set(User("周慧敏"))
    }

    fun setName(name:String) {
        if(!TextUtils.isEmpty(name)&&observableUser.get()!!.name!=name){
            Log.d("MoMo",name)
            observableUser.get()!!.name = name
        }
    }

    fun getName():String{
        return observableUser.get()!!.name
    }
}