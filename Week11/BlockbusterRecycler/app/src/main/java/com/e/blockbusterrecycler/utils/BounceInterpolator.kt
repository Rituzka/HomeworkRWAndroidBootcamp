package com.e.blockbusterrecycler.utils

import android.view.animation.Interpolator

class BounceInterpolator(d: Double, d1: Double) : Interpolator {
    val mAmplitude: Double = 1.0
    val mFrequency: Double = 10.0

    override fun getInterpolation(time: Float): Float {
        val interpolator = (-1 * Math.pow(Math.E, -time / mAmplitude) *
                Math.cos(mFrequency * time) + 1).toFloat()

        return interpolator
    }

}