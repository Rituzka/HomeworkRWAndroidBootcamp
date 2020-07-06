package com.e.blockbusterrecycler.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.e.blockbusterrecycler.extensions.LayoutContainer
import com.e.blockbusterrecycler.model.ModelMovie
import kotlinx.android.synthetic.main.movie_list_view_holder.view.*


class MovieListViewHolder(override val containerView: View): RecyclerView.ViewHolder(containerView),
    LayoutContainer {


    fun bindView(movie: ModelMovie, onMovieClicked: (ModelMovie) -> Unit) = with(containerView){
        movieTitle.text = movie.title
        imageMovie.setImageResource(movie.poster)
        rootView.setOnClickListener { onMovieClicked(movie) }
    }
}