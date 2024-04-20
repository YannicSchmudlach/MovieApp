package com.example.bonusaufgabeppy.datapersistence.data

import com.example.bonusaufgabeppy.datapersistence.data.db.Movie
import com.example.bonusaufgabeppy.datapersistence.data.db.MovieDao
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor(
    private val movieDao: MovieDao)
{
    suspend fun addMovie(movie: Movie) {
        movieDao.insert(movie)
    }

    suspend fun getMovie(movieId: Long):Movie{
        return movieDao.getMovie(movieId = movieId)
    }
    suspend fun removeNote(movie: Movie) {
        movieDao.delete(movie)
    }
}