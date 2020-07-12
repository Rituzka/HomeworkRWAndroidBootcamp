package com.e.thepokemons.ui.fragments

import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import androidx.recyclerview.widget.GridLayoutManager
import com.e.thepokemons.R
import com.e.thepokemons.common.ItemDecoration
import kotlinx.android.synthetic.main.fragment_pokemon_list.*


class PokemonFragmentList : Fragment() {

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?,
        savedInstanceState: Bundle?
    ): View? {
        // Inflate the layout for this fragment
        val itemView =  inflater.inflate(R.layout.fragment_pokemon_list, container, false)

        pokemon_recyclerview.setHasFixedSize(true)
        pokemon_recyclerview.layoutManager = GridLayoutManager(activity, 2)
        val itemDecoration = ItemDecoration(activity!!, R.dimen.fourdp)
        pokemon_recyclerview.addItemDecoration(itemDecoration)

        fetchData()

        return itemView
    }

    private fun fetchData() {

    }
}