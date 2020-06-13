package com.e.businesscard

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.animation.AnimationUtils
import kotlinx.android.synthetic.main.activity_main.*

class MainActivity : AppCompatActivity() {
    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        btnJoinUs.setOnClickListener {
            val animation = AnimationUtils.loadAnimation(this, R.anim.rotate)
            logoAndroid.startAnimation(animation)

            val animation2 = AnimationUtils.loadAnimation(this, R.anim.zoom_in)
            logoText.startAnimation(animation2)

            val animation3 = AnimationUtils.loadAnimation(this, R.anim.zoom_out)
            logoText.startAnimation(animation3)

        }

    }
}