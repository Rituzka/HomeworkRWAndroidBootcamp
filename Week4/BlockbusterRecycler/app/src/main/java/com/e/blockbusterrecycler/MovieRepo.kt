package com.e.blockbusterrecycler

object MovieRepo {

    var movieList = mutableListOf(

        ModelMovies(
            1,
            "10/26/1984",
            "The Terminator",
            R.string.summaryTerminator,
            R.drawable.main_terminatordetail,
            R.drawable.terminatordetail,
            "James Cameron",
            R.string.starsTerminator
        ),
        ModelMovies(
            2,
            "2011 - 2019",
            "Game of Thrones",
            R.string.summaryGoT,
            R.drawable.main_gamethrones,
            R.drawable.gamedetail,
            "David Benioff",
            R.string.starsGoT
        ),
        ModelMovies(
            3,
            "2016 - 2020",
            "Stranger Things",
            R.string.summaryStranger,
            R.drawable.main_strangerdetail2,
            R.drawable.strangerdetails,
            "Matt Duffer, Ross Duffer",
            R.string.starsStrangerThings
        ),
        ModelMovies(
            4,
            "07/03/1985",
            "Back to the Future",
            R.string.summaryBackFuture,
            R.drawable.main_backfuture,
            R.drawable.backdetail,
            "Robert Zemeckis",
            R.string.starsBackFuture
        ),
        ModelMovies(
            5,
            "12/17/2003",
            "The Return of The King",
            R.string.summaryReturnKing,
            R.drawable.main_returnKing,
            R.drawable.returnkingdetail,
            "Peter Jackson",
            R.string.starsReturnKing
        ),
        ModelMovies(
            6,
            "06/20/1980",
            "The Empire Strikes back",
            R.string.summaryEmpire,
            R.drawable.main_empirestrikes,
            R.drawable.empiredetail,
            "Irvin Kershner",
            R.string.starsEmpire
        ),
        ModelMovies(
            7,
            "04/04/2012",
            "The Avengers",
            R.string.summaryAvengers,
            R.drawable.main_Avengers,
            R.drawable.avengersdetail,
            "Joss Whedon",
            R.string.starsAvengers
        ),
        ModelMovies(
            8,
            "07/22/2011",
            "Captain America the First Avenger",
            R.string.summaryCaptain,
            R.drawable.main_captain,
            R.drawable.captaindetail,
            "Joe Johnstone",
            R.string.starsCaptain
        ),
        ModelMovies(
            9,
            "06/03/2017",
            "Wonder Woman",
            R.string.summaryWonder,
            R.drawable.main_wonderwoman,
            R.drawable.wonderdetail,
            "Patty Jenkins",
            R.string.starsWonder
        ),
        ModelMovies(
            10,
            "05/23/1984",
            "Indiana Jones and The Temple of Doom",
            R.string.summaryIndy,
            R.drawable.main_indyJones,
            R.drawable.indydetail,
            "Steven Spielberg",
            R.string.starsIndy
        )
    )

}