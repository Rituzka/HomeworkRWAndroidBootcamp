package com.e.blockbusterrecycler.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.e.blockbusterrecycler.app.App

class UploadImageWorker(context: Context, workerParameters: WorkerParameters):
CoroutineWorker(context, workerParameters){

    private val remoteApi by lazy { App.remoteApi}

    override suspend fun doWork(): Result {
        val imagePath = inputData.getString()

    }
}