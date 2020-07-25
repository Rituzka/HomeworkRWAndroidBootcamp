package com.e.blockbusterrecycler.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.e.blockbusterrecycler.app.App

class SynchronizedWorker (context: Context, workerParameters: WorkerParameters):
CoroutineWorker(context, workerParameters){



    val repository by lazy { App.remoteApi }

    companion object {
        const val WORKER_ID = "SynchronizationWorkerID"
    }

    override suspend fun doWork(): Result {
       return try {
           repository.
       }
    }


}