package com.e.blockbusterrecycler


import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieListAdapter: RecyclerView.Adapter<MovieListViewHolder>() {
     val movieList = mutableListOf<ModelMovies>()

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder {
        TODO("Not yet implemented")
    }

    override fun getItemCount(): Int {
        return movieList.size
    }

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
        TODO("Not yet implemented")
    }


}