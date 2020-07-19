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
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.app.App
import com.e.blockbusterrecycler.model.Movie
import com.e.blockbusterrecycler.networking.NetworkStatusChecker
import com.e.blockbusterrecycler.repository.DummyMovieRepo
import com.e.blockbusterrecycler.repository.MovieRoomRepo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch

const val KEY_LIST = "list"

class MovieActivity : AppCompatActivity(),
    MovieListAdapter.MovieItemClicked {

    private val movieRepository by lazy { MovieRoomRepo() }
    private val remoteApi = App.remoteApi
    private val networkStatusChecker by lazy {
        NetworkStatusChecker(this.getSystemService(ConnectivityManager::class.java))
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        lifecycleScope.launch(Dispatchers.Main) {
            movieRepository.storeMoviesIfNotEmpty(DummyMovieRepo.movieList)
        }
            movieRecycler.layoutManager = GridLayoutManager(this, 3)
          lifecycleScope.launch(Dispatchers.Main) {
              movieRecycler.adapter =
                  MovieListAdapter(
                      movieRepository.getAllMovies(),
                      this@MovieActivity
                  )
          }
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

    fun showMovieDetail(list: Movie){
        val itemMovie = Intent(this, MovieDetail::class.java)
        itemMovie.putExtra(KEY_LIST,list)
        startActivity(itemMovie)
    }

    override fun listItemClicked(list: Movie) {
        showMovieDetail(list)
    }

    fun goToLogin(){
        val intent = Intent(this, LoginActivity::class.java)
        startActivity(intent)
    }

}