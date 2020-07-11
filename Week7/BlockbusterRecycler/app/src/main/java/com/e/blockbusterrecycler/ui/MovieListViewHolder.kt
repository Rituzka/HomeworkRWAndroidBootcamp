package com.e.blockbusterrecycler.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.e.blockbusterrecycler.model.Movie
import kotlinx.android.synthetic.main.movie_list_view_holder.view.*


class MovieListViewHolder(view: View): RecyclerView.ViewHolder(view) {

    fun bindView(image: Movie){
        itemView.imageMovie.setImageResource(image.poster)
        itemView.movieTitle.text = image.title
    }
}