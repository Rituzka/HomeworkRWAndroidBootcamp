package com.e.blockbusterrecycler

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView


class MovieListAdapter: RecyclerView.Adapter<MovieListViewHolder>() {

    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_list_view_holder, parent, false)
        return MovieListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return MovieRepo.movieList.size
    }

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
        holder.movieImage.setImageResource(MovieRepo.movieList[position].poster)
        holder.movieTitle.text = MovieRepo.movieList[position].title
    }

}