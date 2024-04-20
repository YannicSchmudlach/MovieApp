package com.example.bonusaufgabeppy.network.data.api

import com.example.bonusaufgabeppy.network.data.api.dto.MovieDTO
import com.example.bonusaufgabeppy.network.data.api.dto.MoviesDTO
import io.ktor.client.call.body
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieClient@Inject constructor(
    private val api: MovieAPI) {
    private val key = ""

    suspend fun getMovie(id: Long): Result<MovieDTO> = runCatching {
        api.getMovie(id = id, key = key).body()
    }

    suspend fun searchMovies(title: String,page: Int): Result<MoviesDTO> = runCatching {
        api.searchMovies(title = title,page =page, key = key).body()
    }

    suspend fun getTrendingMovies(page: Int):Result<MoviesDTO> {
        return runCatching {
        api.getTrendingMovies(page=page,key=key).body()
    }
    }
}