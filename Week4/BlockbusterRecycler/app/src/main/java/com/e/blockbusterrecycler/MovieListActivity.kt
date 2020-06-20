package com.e.blockbusterrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.activity_movielist.*

class MovieListActivity : AppCompatActivity() {

    lateinit var movieList: RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movielist)

        movieList = findViewById(R.id.movieRecycler)
        movieList.layoutManager = GridLayoutManager(this, 2)
        movieList.adapter = MovieListAdapter()


    }
}