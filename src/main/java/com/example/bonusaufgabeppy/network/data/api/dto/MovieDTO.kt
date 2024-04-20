package com.example.bonusaufgabeppy.network.data.api.dto

import kotlinx.serialization.Serializable

@Serializable
data class MovieDTO (
    val id: Long,
    val title: String ?,
    val poster_path: String?,
    val overview: String,
    val backdrop_path:String?,
    val vote_average:Double,
) {

}
@Serializable
data class MoviesDTO(
    val page: Int,
    val results: List<MovieDTO>,
){

}