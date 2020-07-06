package com.e.blockbusterrecycler.extensions

import android.view.View

fun View.onClick(onClickAction: () -> Unit) {
    setOnClickListener { onClickAction() }
}