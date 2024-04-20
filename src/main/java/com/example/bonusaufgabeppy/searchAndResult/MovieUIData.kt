package com.example.bonusaufgabeppy.searchAndResult

import com.example.bonusaufgabeppy.network.data.movie.Movie

data class MovieUIData(
    val movies: List<Movie>,
    val isLoading: Boolean) {
}