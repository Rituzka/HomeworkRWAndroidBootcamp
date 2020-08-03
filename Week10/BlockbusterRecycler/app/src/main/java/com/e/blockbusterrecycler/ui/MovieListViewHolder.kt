package com.e.blockbusterrecycler.ui

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import com.bumptech.glide.Glide
import com.e.blockbusterrecycler.networking.MovieModelApi
import kotlinx.android.extensions.LayoutContainer
import kotlinx.android.synthetic.main.movie_list_view_holder.view.*


class MovieListViewHolder(itemView: View): RecyclerView.ViewHolder(itemView) {

    fun bindView(data: MovieModelApi) {
        itemView.movieTitle.text = data.title
        Glide.with(itemView.imageMovie.context)
            .load(data.poster)
            .into(itemView.imageMovie)

    }
}