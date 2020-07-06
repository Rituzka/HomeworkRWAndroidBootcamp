package com.e.blockbusterrecycler.repository

import com.e.blockbusterrecycler.extensions.SharedPrefsManager

class UserRepository {
    private val sharedPrefsManager = SharedPrefsManager()

    fun setUserLoggedIn(isLoggedIn: Boolean) = sharedPrefsManager.setUserLoggedIn(isLoggedIn)

    fun isUserLoggedIn() = sharedPrefsManager.isUserLoggedIn()
}