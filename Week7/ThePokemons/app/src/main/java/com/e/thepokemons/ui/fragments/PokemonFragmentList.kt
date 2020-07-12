package com.e.thepokemons.ui.fragments

import android.content.Context
import android.net.ConnectivityManager
import android.os.Bundle
import androidx.fragment.app.Fragment
import android.view.LayoutInflater
import android.view.View
import android.view.ViewGroup
import android.widget.Toast
import androidx.recyclerview.widget.GridLayoutManager
import com.e.thepokemons.App
import com.e.thepokemons.R
import com.e.thepokemons.common.ItemDecoration
import com.e.thepokemons.model.Pokemon
import com.e.thepokemons.model.response.Success
import com.e.thepokemons.networking.NetworkStatusChecker
import com.e.thepokemons.ui.adapter.PokemonAdapter
import kotlinx.android.synthetic.main.fragment_pokemon_list.*


class PokemonFragmentList : Fragment() {

    private val adapter by lazy { PokemonAdapter()}
    private val remoteApi = App.remoteApi
    private val networkStatusChecker by lazy {
        NetworkStatusChecker(activity?.getSystemService(ConnectivityManager::class.java))}

    override fun onCreateView(
        inflater: LayoutInflater, container: ViewGroup?, savedInstanceState: Bundle?
    ): View? {
        return inflater.inflate(R.layout.fragment_pokemon_list, container, false)
    }

    override fun onViewCreated(view: View, savedInstanceState: Bundle?) {
            super.onViewCreated(view, savedInstanceState)
            initUI()
        }

    private fun initUI() {
        pokemon_recyclerview.setHasFixedSize(true)
        pokemon_recyclerview.layoutManager = GridLayoutManager(activity, 2)
        val itemDecoration = ItemDecoration(activity!!, R.dimen.fourdp)
        pokemon_recyclerview.addItemDecoration(itemDecoration)
    }

    private fun getAllPokemons() {
        networkStatusChecker.performIfConnectedToInternet {
            remoteApi.getPokemons { result ->
                if(result is Success) {
                    onDataReceived(result.data)
                }else{
                    onGetDataFailed()
                }

            }
        }
    }

    private fun onGetDataFailed() {
        activity?.toast("Failed to fetch pokemons!")
    }

    private fun onDataReceived(pokemons: List<Pokemon>) {
        adapter.setData(pokemons)
    }

    fun Context.toast(message: String, length: Int = Toast.LENGTH_SHORT) {
        Toast.makeText(this, message, length).show()
    }
}


