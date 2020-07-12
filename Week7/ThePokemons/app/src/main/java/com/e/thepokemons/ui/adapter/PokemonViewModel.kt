package com.e.thepokemons.ui.adapter

import android.view.View
import androidx.recyclerview.widget.RecyclerView
import kotlinx.android.synthetic.main.pokemon_list_item.view.*

class PokemonViewModel(itemView: View) : RecyclerView.ViewHolder(itemView) {

     val pokemonImage = itemView.pokemon_image
     val pokemonName = itemView.pokemon_name

}