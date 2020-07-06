package com.e.blockbusterrecycler.ui

import android.content.Context
import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.view.Menu
import android.view.MenuItem
import androidx.recyclerview.widget.GridLayoutManager
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.model.ModelMovie
import com.e.blockbusterrecycler.repository.DummyDataMovies.movieList
import com.e.blockbusterrecycler.repository.MovieRepository
import com.e.blockbusterrecycler.repository.UserRepository
import kotlinx.android.synthetic.main.activity_main.*

fun startMovieActivity(from: Context) = from.startActivity(Intent(from, MainActivity::class.java))

class MainActivity : AppCompatActivity() {

    private val movieRepository by lazy { MovieRepository() }
    private val movieAdapter by lazy { MovieListAdapter(::movieClicked) }
    private val userRepository by lazy { UserRepository()}


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        movieRepository.storeMoviesIfNotEmpty(movieList)
        initMovieList()
    }
    private fun initMovieList() {
        movieRecycler.layoutManager = GridLayoutManager(this, 3)
        movieRecycler.adapter = movieAdapter
        movieAdapter.setMovies(movieRepository.getAllMovies())
    }


    override fun onCreateOptionsMenu(menu: Menu?): Boolean {
        this.menuInflater.inflate(R.menu.menu, menu)
        return true
    }

    override fun onOptionsItemSelected(item: MenuItem): Boolean {
        if(item.itemId == R.id.action_logout) {
            userRepository.setUserLoggedIn(false)
            goToLogin()
        }
        return false
    }

    fun movieClicked (movie: ModelMovie){
     startMovieDetailsActivity(this, movie.id)
    }

    fun goToLogin(){
       startLoginActivity(this)
        finish()
    }

}