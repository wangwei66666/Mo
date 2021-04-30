package com.ww.module_study.databinding.viewmodel

import android.text.TextUtils
import android.util.Log
import androidx.databinding.BaseObservable
import androidx.databinding.Bindable
import androidx.databinding.library.baseAdapters.BR
import com.ww.module_study.databinding.bean.User

/**
 * @author ww
 * @date 4/30/21.
 * description：
 */
class BaseObservableUser :BaseObservable(){
    private var user = User("哈哈哈哈")

    fun setName(name:String) {
        if(!TextUtils.isEmpty(name)&&name!=user.name){
            Log.d("MoMo",name);
            user.name = name
            notifyPropertyChanged(BR.name)
        }
    }

    @Bindable
    fun getName(): String {
        return user.name
    }

}