package com.example.bonusaufgabeppy.network.data.movie

import com.example.bonusaufgabeppy.network.data.api.dto.MovieDTO

data class Movie(
    val id: Long,
    val title: String?,
    val poster_path: String?,
    val overview: String,
    val backdrop_path:String?,
    val vote_average:Double,
)
fun MovieDTO.mapToMovie(): Movie = Movie(
    id=id,
    title=title,
    poster_path=poster_path,
    overview=overview,
    backdrop_path=backdrop_path,
    vote_average=vote_average,
)
fun List<MovieDTO>.mapToMovies():List<Movie> = map {it.mapToMovie()}



