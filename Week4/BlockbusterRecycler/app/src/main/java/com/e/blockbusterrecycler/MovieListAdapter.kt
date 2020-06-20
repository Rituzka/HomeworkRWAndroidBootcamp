package com.e.blockbusterrecycler

import android.view.ViewGroup
import androidx.recyclerview.widget.RecyclerView

class MovieListAdapter: RecyclerView.Adapter<MovieListViewHolder>() {

    var movieList = mutableListOf(

        ModelMovies(
            1,
            "10/26/1984",
            "The Terminator",
            R.string.summaryTerminator,
            R.drawable.main_terminatordetail,
            R.drawable.terminatordetail
        ),
        ModelMovies(
            2,
            "2011 - 2019",
            "Game of Thrones",
            R.string.summaryGoT,
            R.drawable.main_gamethrones,
            R.drawable.gamedetail
        ),
        ModelMovies(
            3,
            "2016 - 2020",
            "Stranger Things",
            R.string.summaryStranger,
            R.drawable.main_strangerdetail2,
            R.drawable.strangerdetails
        ),
        ModelMovies(
            4,
            "07/03/1985",
            "Back to the Future",
            R.string.summaryBackFuture,
            R.drawable.main_backfuture,
            R.drawable.backdetail
        ),
        ModelMovies(
            5,
            "12/17/2003",
            "The Return of The King",
            R.string.summaryReturnKing,
            R.drawable.main_returnKing,
            R.drawable.returnkingdetail
        ),
        ModelMovies(
            6,
            "06/20/1980",
            "The Empire Strikes back",
            R.string.summaryEmpire,
            R.drawable.main_empirestrikes,
            R.drawable.empiredetail
        ),
        ModelMovies(
            7,
            "04/04/2012",
            "The Avengers",
            R.string.summaryAvengers,
            R.drawable.main_Avengers,
            R.drawable.avengersdetail
        ),
        ModelMovies(
            8,
            "07/22/2011",
            "Captain America the First Avenger",
            R.string.summaryCaptain,
            R.drawable.main_captain,
            R.drawable.captaindetail
        ),
        ModelMovies(
            9,
            "06/03/2017",
            "Wonder Woman",
            R.string.summaryWonder,
            R.drawable.main_wonderwoman,
            R.drawable.wonderdetail
        ),
        ModelMovies(
            10,
            "05/23/1984",
            "Indiana Jones and The Temple of Doom",
            R.string.summaryIndy,
            R.drawable.main_indyJones,
            R.drawable.indydetail
        )
    )

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