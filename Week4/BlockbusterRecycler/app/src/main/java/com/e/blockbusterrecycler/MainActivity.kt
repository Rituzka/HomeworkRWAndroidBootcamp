package com.e.blockbusterrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView


class MovieListActivity : AppCompatActivity() {

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_movielist)

        val movieList: RecyclerView = findViewById(R.id.movieRecycler)
        movieList.layoutManager = LinearLayoutManager(this, RecyclerView.VERTICAL, false)
        movieList.adapter = MovieListAdapter(this, MovieRepo.movieList)

    }

}