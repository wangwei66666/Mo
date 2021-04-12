package com.ww.mo

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import com.airbnb.lottie.LottieAnimationView

class MainActivity : AppCompatActivity() {
    var lottieAnimation:LottieAnimationView?= null
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        lottieAnimation = findViewById(R.id.animation_view)
        lottieAnimation?.speed  = 2.5f
//        lottieAnimation?.pauseAnimation()
    }
}