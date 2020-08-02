package com.e.blockbusterrecycler.worker

import android.content.Context
import androidx.work.CoroutineWorker
import androidx.work.WorkerParameters
import com.e.blockbusterrecycler.networking.buildApiService
import com.e.blockbusterrecycler.repository.MovieRoomRepo

class SynchronizedWorker (context: Context, workerParameters: WorkerParameters):
CoroutineWorker(context, workerParameters) {

    private val movieApiService by lazy { buildApiService() }
    private val movieRepository by lazy { MovieRoomRepo(movieApiService) }

    companion object {
        const val WORKER_ID = "SynchronizationWorkerID"
    }

    override suspend fun doWork(): Result {
        return try {
            movieRepository.loadMoviesForPage(1)
            Result.success()

        } catch (error: Throwable) {
            Result.failure()
        }
    }
}