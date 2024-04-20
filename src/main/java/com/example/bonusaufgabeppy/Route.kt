package com.example.bonusaufgabeppy

const val MOVIE_ID ="movieID"
sealed class Route(val route: String) {
    object SearchAndResultRoute : Route("searchandresultrout")
    object MovieDetailsRoute : Route("moviedetailsroute/{$MOVIE_ID}") {
        fun passMovieID(id: Long): String {
            return "moviedetailsroute/$id"
        }
    }
}