package com.e.blockbusterrecycler.repository

import com.e.blockbusterrecycler.R
import com.e.blockbusterrecycler.model.ModelMovie


object DummyDataMovies {

      val movieList = listOf(
          ModelMovie(
              1,
              "10/26/1984",
              "The Terminator",
              R.string.summaryTerminator,
              R.drawable.main_terminator,
              R.drawable.terminator_detail,
              "James Cameron",
              R.string.starsTerminator
          ),
          ModelMovie(
              2,
              "2011 - 2019",
              "Game of Thrones",
              R.string.summaryGoT,
              R.drawable.main_gamethrones,
              R.drawable.game_detail,
              "David Benioff",
              R.string.starsGoT
          ),
          ModelMovie(
              3,
              "2016 - 2020",
              "Stranger Things",
              R.string.summaryStranger,
              R.drawable.main_stranger,
              R.drawable.stranger_detail,
              "Matt Duffer, Ross Duffer",
              R.string.starsStrangerThings
          ),
          ModelMovie(
              4,
              "07/03/1985",
              "Back to the Future",
              R.string.summaryBackFuture,
              R.drawable.main_backfuture,
              R.drawable.back_detail,
              "Robert Zemeckis",
              R.string.starsBackFuture
          ),
          ModelMovie(
              5,
              "12/17/2003",
              "Lord of the Rings",
              R.string.summaryReturnKing,
              R.drawable.main_returnking,
              R.drawable.returnking_detail,
              "Peter Jackson",
              R.string.starsReturnKing
          ),
          ModelMovie(
              6,
              "06/20/1980",
              "Star Wars",
              R.string.summaryEmpire,
              R.drawable.main_empirestrikes,
              R.drawable.empire_detail,
              "Irvin Kershner",
              R.string.starsEmpire
          ),
          ModelMovie(
              7,
              "04/04/2012",
              "The Avengers",
              R.string.summaryAvengers,
              R.drawable.main_avengers,
              R.drawable.avengers_detail,
              "Joss Whedon",
              R.string.starsAvengers
          ),
          ModelMovie(
              8,
              "07/22/2011",
              "Captain America",
              R.string.summaryCaptain,
              R.drawable.main_captain,
              R.drawable.captain_detail,
              "Joe Johnstone",
              R.string.starsCaptain
          ),
          ModelMovie(
              9,
              "06/03/2017",
              "Wonder Woman",
              R.string.summaryWonder,
              R.drawable.main_wonderwoman,
              R.drawable.wonder_detail,
              "Patty Jenkins",
              R.string.starsWonder
          ),
          ModelMovie(
              10,
              "05/23/1984",
              "Indiana Jones",
              R.string.summaryIndy,
              R.drawable.main_indy,
              R.drawable.indy_detail,
              "Steven Spielberg",
              R.string.starsIndy
          )
      )
}