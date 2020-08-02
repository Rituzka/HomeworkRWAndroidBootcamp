package com.e.blockbusterrecycler.networking

import android.content.Context
import android.net.ConnectivityManager
import android.net.NetworkCapabilities
import android.os.Build

class NetworkStatusChecker(private val context: Context) {

  fun hasInternetConnection(): Boolean {
      var result = false
      val connectivityManager =
          context.getSystemService(Context.CONNECTIVITY_SERVICE) as ConnectivityManager

      if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M){
          val network = connectivityManager.activeNetwork ?: return false
          val capabilities = connectivityManager.getNetworkCapabilities(
              network) ?: return false

          result = when {
              capabilities.hasTransport(NetworkCapabilities.TRANSPORT_WIFI)
                      || capabilities.hasTransport(NetworkCapabilities.TRANSPORT_CELLULAR)
                      || capabilities.hasTransport(NetworkCapabilities.TRANSPORT_VPN) -> true

              else -> false
          }
      }

      return result

      }
  }
