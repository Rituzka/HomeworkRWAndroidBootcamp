package com.e.blockbusterrecycler

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import androidx.recyclerview.widget.GridLayoutManager
import androidx.recyclerview.widget.LinearLayoutManager
import androidx.recyclerview.widget.RecyclerView



class MainActivity : AppCompatActivity() {

    lateinit var movieList:RecyclerView

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)

        this.movieList = findViewById(R.id.movieRecycler)
        movieList.layoutManager = GridLayoutManager(this, 3)
        movieList.adapter = MovieListAdapter(this, MovieRepo.movieList)

    }

}