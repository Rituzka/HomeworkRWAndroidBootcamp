package com.e.blockbusterrecycler.ui

import android.content.Context
import android.content.Intent
import android.net.ConnectivityManager
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import androidx.work.*
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.app.App
import com.e.blockbusterrecycler.model.Success
import com.e.blockbusterrecycler.networking.MovieModelApi
import com.e.blockbusterrecycler.networking.NetworkStatusChecker
import com.e.blockbusterrecycler.networking.RemoteApiService
import com.e.blockbusterrecycler.repository.MovieRoomRepo
import com.e.blockbusterrecycler.worker.SynchronizedWorker
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch
import java.util.concurrent.TimeUnit


const val KEY_LIST = "list"

class MovieActivity(movieApiService: RemoteApiService) : AppCompatActivity(),
    MovieListAdapter.MovieItemClicked {

    private val movieRepository by lazy { MovieRoomRepo(movieApiService) }
    private val remoteApi = App.remoteApi
    private val networkStatusChecker by lazy {
        NetworkStatusChecker(this.getSystemService(ConnectivityManager::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch(Dispatchers.Main) {
            initList()
        }
        synchronization()
    }

    private suspend fun initList(){
        networkStatusChecker.performIfConnectedToInternet {
            val result = remoteApi.getMovies()
            if (result is Success) {
                onMovieListReceived(result.data)
            }
        }
        movieRecycler.layoutManager = GridLayoutManager(this, 3)
            movieRecycler.adapter =
                MovieListAdapter(
                 movieRepository.getAllMovies(),
                    this@MovieActivity
                )

    }

    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        val inflater: MenuInflater = menuInflater
        inflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        val sharedPref = getSharedPreferences(getString(R.string.saveData), Context.MODE_PRIVATE)
        sharedPref.edit().putBoolean(getString(R.string.userlogged),false).apply()
        goToLogin()
        return true
    }

    fun showMovieDetail(list: MovieModelApi){
        val itemMovie = Intent(this, MovieDetail::class.java)
        itemMovie.putExtra(KEY_LIST,list)
        startActivity(itemMovie)
    }

    override fun listItemClicked(list: MovieModelApi) {
        showMovieDetail(list)
    }

    private fun synchronization() {
        val constraints = buildConstraints()
        val worker = buildWorker(constraints)

        val workManager = WorkManager.getInstance(this)
        workManager.enqueueUniquePeriodicWork(
            SynchronizedWorker.WORKER_ID,
            ExistingPeriodicWorkPolicy.KEEP,
            worker
        )
    }

    private fun buildConstraints(): Constraints {
        return Constraints.Builder()
            .setRequiresBatteryNotLow(true)
            .setRequiredNetworkType(NetworkType.CONNECTED)
            .setRequiresBatteryNotLow(true)
            .build()

    }

    private fun buildWorker(constraints: Constraints): PeriodicWorkRequest {
        return PeriodicWorkRequestBuilder<SynchronizedWorker>(15, TimeUnit.MINUTES)
            .setConstraints(constraints)
            .build()
    }

    private fun onMovieListReceived(movies: List<MovieModelApi>){
        onMoviesReceived(movies)
    }

    private fun onMoviesReceived(movies: List<MovieModelApi>) {
       movieRecycler.adapter = MovieListAdapter(movies, this)
    }

    fun goToLogin(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}