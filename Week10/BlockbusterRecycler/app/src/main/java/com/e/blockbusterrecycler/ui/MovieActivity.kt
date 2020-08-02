package com.e.blockbusterrecycler.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import android.view.View
import android.widget.Toast
import androidx.lifecycle.Observer
import androidx.recyclerview.widget.GridLayoutManager
import androidx.work.*
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.networking.MovieModelApi
import com.e.blockbusterrecycler.viewModel.MoviesViewModel
import com.e.blockbusterrecycler.worker.SynchronizedWorker
import kotlinx.android.synthetic.main.activity_main.*
import java.util.concurrent.TimeUnit
import com.e.blockbusterrecycler.utils.Status
import org.koin.android.viewmodel.ext.android.viewModel

const val KEY_LIST = "list"


class MovieActivity : AppCompatActivity(),
    MovieListAdapter.MovieItemClicked {

    private lateinit var movieAdapter: MovieListAdapter
    private val moviesViewModel: MoviesViewModel by viewModel()

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        setupUI()
        setupObserver()
        synchronization()
    }

    private fun setupUI(){
        movieRecycler.layoutManager = GridLayoutManager(this, 3)
        movieAdapter = MovieListAdapter(arrayListOf())

        movieRecycler.adapter = movieAdapter

    }

    private fun setupObserver() {
        moviesViewModel.movies.observe(this, Observer {
            when (it.status) {
                Status.SUCCESS -> {
                    progressBar.visibility = View.GONE
                    it.data?.let { movies -> renderList(movies) }
                    movieRecycler.visibility = View.VISIBLE
                }
                Status.LOADING -> {
                    progressBar.visibility = View.VISIBLE
                    movieRecycler.visibility = View.GONE
                }
                Status.ERROR -> {
                    progressBar.visibility = View.GONE
                    Toast.makeText(this, it.message, Toast.LENGTH_LONG).show()
                }
            }
        })
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
        stopSynchronization()
        return true
    }

    private fun showMovieDetail(list: MovieModelApi){
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

    private fun stopSynchronization() {
        val workManager = WorkManager.getInstance(this)

        workManager.cancelUniqueWork(SynchronizedWorker.WORKER_ID)
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

    private fun renderList(movies: List<MovieModelApi>) {
        movieAdapter.setMovies(movies)
        movieAdapter.notifyDataSetChanged()
    }


    private fun goToLogin(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}