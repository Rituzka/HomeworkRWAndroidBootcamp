package com.e.blockbusterrecycler.ui

import android.view.LayoutInflater
import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView
import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.model.ModelMovie


class MovieListAdapter(
    private val onMovieClicked: (ModelMovie) -> Unit
): RecyclerView.Adapter<MovieListViewHolder>() {

    private val movies = mutableListOf<ModelMovie>()

    fun setMovies(movies: List<ModelMovie>) {
        this.movies.clear()
        this.movies.addAll(movies)
        notifyDataSetChanged()
    }


    override fun onCreateViewHolder(parent: ViewGroup, viewType: Int): MovieListViewHolder {
        val view = LayoutInflater.from(parent.context)
            .inflate(R.layout.movie_list_view_holder, parent, false)
        return MovieListViewHolder(view)
    }

    override fun getItemCount(): Int {
        return movies.size
    }

    override fun onBindViewHolder(holder: MovieListViewHolder, position: Int) {
        holder.bindView(movies[position], onMovieClicked)
        }

    }

