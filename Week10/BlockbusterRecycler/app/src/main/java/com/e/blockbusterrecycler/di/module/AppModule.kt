package com.e.blockbusterrecycler.di.module

import android.content.Context
import com.e.blockbusterrecycler.networking.*
import okhttp3.OkHttpClient
import okhttp3.logging.HttpLoggingInterceptor
import org.koin.android.BuildConfig
import org.koin.android.ext.koin.androidContext
import org.koin.dsl.module
import retrofit2.Retrofit
import retrofit2.converter.moshi.MoshiConverterFactory


val appModule = module {
    single { provideOkHttpClient() }
    single { provideRetrofit(get(), BASE_URL) }
    single { provideApiService(get()) }
    single { provideNetworkHelper(androidContext()) }

    single<ApiHelper> {
        return@single RemoteApiImpl(get())
    }
}

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
    baseURL: String
) =
    Retrofit.Builder()
        .addConverterFactory(MoshiConverterFactory.create())
        .baseUrl(baseURL)
        .client(okHttpClient)
        .build()

private fun provideApiService(retrofit: Retrofit): RemoteApiService = retrofit.create(RemoteApiService::class.java)

private fun provideApiHelper(apiHelper: RemoteApiImpl): ApiHelper = apiHelper