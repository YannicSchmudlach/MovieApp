package com.example.bonusaufgabeppy.movieDetails

data class MovieDetailUIData(
    val id: Long,
    val title: String?,
    val poster_path: String?,
    val overview: String,
    val backdrop_path:String?,
    val vote_average:Double,
    val isLoading: Boolean
) {
}