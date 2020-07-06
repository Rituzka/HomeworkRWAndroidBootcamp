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
import com.e.blockbusterrecycler.app.DataMovieApplication
import com.e.blockbusterrecycler.model.Movie
import com.e.blockbusterrecycler.model.MovieRepo
import kotlinx.android.synthetic.main.activity_main.*
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.launch


class MainActivity : AppCompatActivity(),
    MovieListAdapter.MovieItemClicked {

    lateinit var movieList: List<Movie>

    companion object {
        const val KEY_LIST = "list"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
         movieList = mutableListOf()
        movieRecycler.layoutManager = GridLayoutManager(this, 3)
        movieRecycler.adapter =
            getMovies()?.let {
                MovieListAdapter(
                    it,
                    //MovieRepo.movieList,
                    this
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
        finish()
    }

    fun getMovies(): List<Movie>? {
      var moviesMain:List<Movie>? = null
        lifecycleScope.launch(Dispatchers.IO) {
            movieList = DataMovieApplication.database.movieDao().getAllMovies()
            launch(Dispatchers.Main) {
                moviesMain = movieList
            }
        }
        return moviesMain
    }

}