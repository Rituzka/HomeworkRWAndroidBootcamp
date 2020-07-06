package com.e.blockbusterrecycler.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuInflater
import android.view.MenuItem
import androidx.lifecycle.lifecycleScope
import androidx.recyclerview.widget.GridLayoutManager
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.model.Movie
import com.e.blockbusterrecycler.model.MovieRepo
import com.e.blockbusterrecycler.model.MovieRepository
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity(),
    MovieListAdapter.MovieItemClicked {

    private var list: List<Movie>? = null
    private val movieRepository by lazy {MovieRepository()}


    companion object {
        const val KEY_LIST = "list"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)


        movieRecycler.layoutManager = GridLayoutManager(this, 3)
        movieRecycler.adapter =

                    MovieRepo.movieList,
                    this

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
        finish()
    }

    fun getMovies() {
        lifecycleScope.launch(Dispatchers.IO) {
         val result = movieRepository.storeMoviesIfNotEmpty(MovieRepo.movieList)
            launch(Dispatchers.Main) {
             result
            }
        }

    }
}