package com.ww.module_study.lifecycle.service

import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleService
import com.ww.module_study.lifecycle.observer.LocationObserver

/**
 * @author ww
 * @date 4/28/21.
 * description：
 */
class LocationService : LifecycleService() {

    init {
        lifecycle.addObserver(LocationObserver(this))
    }
}