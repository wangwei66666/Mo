package com.ww.module_study.lifecycle.App

import android.app.Application
import androidx.lifecycle.ProcessLifecycleOwner
import com.ww.module_study.lifecycle.observer.AppLifecycleObserver

/**
 * @author ww
 * @date 4/28/21.
 * description：
 */
class StudyApplication : Application() {
    override fun onCreate() {
        super.onCreate()

        ProcessLifecycleOwner.get().lifecycle.addObserver(AppLifecycleObserver())
    }
}