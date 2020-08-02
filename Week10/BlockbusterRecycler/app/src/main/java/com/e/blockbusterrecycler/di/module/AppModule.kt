package com.e.blockbusterrecycler.di.module

import android.content.Context
import com.e.blockbusterrecycler.networking.ApiHelper
import com.e.blockbusterrecycler.networking.NetworkStatusChecker
import com.e.blockbusterrecycler.networking.RemoteApiImpl
import com.e.blockbusterrecycler.networking.RemoteApiService
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.BuildConfig
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory

private fun provideNetworkHelper(context: Context) = NetworkStatusChecker(context)

private fun provideOkHttpClient() = if (BuildConfig.DEBUG) {
    val loggingInterceptor = HttpLoggingInterceptor()
    loggingInterceptor.setLevel(HttpLoggingInterceptor.Level.BODY)
    OkHttpClient.Builder()
        .addInterceptor(loggingInterceptor)
        .build()
} else OkHttpClient
    .Builder()
    .build()

private fun provideRetrofit(
    okHttpClient: OkHttpClient,
    BASE_URL: String
): Retrofit =
    Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl(BASE_URL)
        .client(okHttpClient)
        .build()

private fun provideApiService(retrofit: Retrofit): RemoteApiService = retrofit.create(RemoteApiService::class.java)

private fun provideApiHelper(apiHelper: RemoteApiImpl): ApiHelper = apiHelper