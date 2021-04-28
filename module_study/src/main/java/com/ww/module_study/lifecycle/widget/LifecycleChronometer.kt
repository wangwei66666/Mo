package com.ww.module_study.lifecycle.widget

import android.content.Context
import android.os.SystemClock
import android.util.AttributeSet
import android.widget.Chronometer
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.LifecycleOwner
import androidx.lifecycle.OnLifecycleEvent

/**
 * @author ww
 * @date 4/28/21.
 * description：
 */
class LifecycleChronometer(context: Context?, attrs: AttributeSet?) : Chronometer(context, attrs),
    LifecycleObserver {

    private var elapsedTime: Long = 0

    @OnLifecycleEvent(Lifecycle.Event.ON_RESUME)
    fun startChronometer() {
        base = SystemClock.elapsedRealtime() - elapsedTime
        start()
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_PAUSE)
    fun stopChrometer() {
        elapsedTime = SystemClock.elapsedRealtime() - base
        stop()
    }
}