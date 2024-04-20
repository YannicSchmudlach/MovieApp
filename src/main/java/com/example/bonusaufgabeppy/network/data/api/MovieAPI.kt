package com.example.bonusaufgabeppy.network.data.api

import io.ktor.client.HttpClient
import io.ktor.client.request.get
import io.ktor.client.statement.HttpResponse

class MovieAPI (private val httpClient: HttpClient) {
    // 1 Movie
    suspend fun getMovie(id: Long,key:String): HttpResponse = httpClient.get("/3/movie/$id?api_key=$key")
    //Liste Movie
    suspend fun searchMovies(title: String,page: Int, key:String): HttpResponse = httpClient.get("/3/search/movie?&api_key=$key&query=$title&page=$page")

    suspend fun getTrendingMovies(page: Int, key:String): HttpResponse = httpClient.get("/3/trending/movie/day?&api_key=$key&page=$page")

}