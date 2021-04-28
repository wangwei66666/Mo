package com.ww.module_study.lifecycle.observer

import android.Manifest
import android.content.Context
import android.content.pm.PackageManager
import android.location.Location
import android.location.LocationListener
import android.location.LocationManager
import android.os.Bundle
import android.util.Log
import androidx.core.app.ActivityCompat
import androidx.lifecycle.Lifecycle
import androidx.lifecycle.LifecycleObserver
import androidx.lifecycle.OnLifecycleEvent

/**
 * @author ww
 * @date 4/28/21.
 * description：
 */
class LocationObserver(var mContext: Context) : LifecycleObserver {
    private var locationManager: LocationManager? = null
    private var locationHelper: LocationHelper? = null

    @OnLifecycleEvent(Lifecycle.Event.ON_CREATE)
    fun start() {
        Log.d("ww", "start------service")
        locationHelper = LocationHelper()
        locationManager = mContext.getSystemService(Context.LOCATION_SERVICE) as LocationManager
        if (ActivityCompat.checkSelfPermission(mContext, Manifest.permission.ACCESS_FINE_LOCATION)
            != PackageManager.PERMISSION_GRANTED && ActivityCompat.checkSelfPermission(
                mContext,
                Manifest.permission.ACCESS_COARSE_LOCATION
            )
            != PackageManager.PERMISSION_GRANTED
        ) {
            return
        }

        locationManager!!.requestLocationUpdates(
            LocationManager.GPS_PROVIDER,
            3000L,
            1f,
            locationHelper
        )
    }

    @OnLifecycleEvent(Lifecycle.Event.ON_DESTROY)
    fun stop() {
        Log.d("ww", "stop------service")
        locationManager!!.removeUpdates(locationHelper)
    }

    internal class LocationHelper : LocationListener {
        override fun onLocationChanged(location: Location?) {
            Log.d("ww", "onLocationChanged:${location.toString()}")
        }

        override fun onStatusChanged(provider: String?, status: Int, extras: Bundle?) {
        }

        override fun onProviderEnabled(provider: String?) {
        }

        override fun onProviderDisabled(provider: String?) {
        }
    }
}