package com.e.blockbusterrecycler

import android.content.Intent
import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity(), MovieListAdapter.MovieItemClicked {

    private lateinit var movieList:RecyclerView

    companion object {
        const val KEY_LIST = "list"
    }

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.movieList = findViewById(R.id.movieRecycler)
        movieList.layoutManager = GridLayoutManager(this, 3)
        movieList.adapter = MovieListAdapter(MovieRepo.movieList, this)

    }

    fun showMovieDetail(list: ModelMovies){
        val itemMovie = Intent(this, MovieDetail::class.java)
        itemMovie.putExtra(KEY_LIST,list)
        startActivity(itemMovie)
    }

    override fun listItemClicked(list: ModelMovies) {
        showMovieDetail(list)
    }

}