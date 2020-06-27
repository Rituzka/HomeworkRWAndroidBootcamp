package com.e.blockbusterrecycler

import android.content.Context

class SharedPrefences(context: Context) {

    val SHARED_PREFS_USER = "SharePrefsUser"
    val PREFS_VALUE = "PrefsValue"


    val sharePrefs = context.getSharedPreferences(SHARED_PREFS_USER,Context.MODE_PRIVATE)

    fun getLoginUser(): Boolean {
        return sharePrefs.getBoolean(PREFS_VALUE, true)
    }

    fun setLoginUser(isConnected: Boolean){
        val editor = sharePrefs.edit()
        editor.putBoolean(PREFS_VALUE,isConnected)
        editor.apply()
    }

}