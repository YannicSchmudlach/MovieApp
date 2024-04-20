package com.example.bonusaufgabeppy.network.data.movie

import android.annotation.SuppressLint
import android.util.Log
import com.example.bonusaufgabeppy.network.data.api.MovieClient
import kotlinx.coroutines.Dispatchers
import kotlinx.coroutines.withContext
import javax.inject.Inject
import javax.inject.Singleton

@Singleton
class MovieRepository @Inject constructor
    (
        private val movieClient: MovieClient
    )
{
    @SuppressLint("RestrictedApi")
    suspend fun getMovie(id: Long): Movie? = withContext(Dispatchers.IO){
        val movie = movieClient.getMovie(id).getOrElse {
            Log.e(LOG_TAG, "getMovie failed: ", it)
            null
        }
        movie?.mapToMovie()
    }

    suspend fun searchMovies(title: String,page :Int): List<Movie> = withContext(Dispatchers.IO) {
        val movies = movieClient.searchMovies(java.net.URLEncoder.encode(title, "utf-8"),page)
            .getOrElse {
                Log.e(LOG_TAG, "searchMovies failed: ", it)
                null
            }

        (if(movies!=null){movies?.results?.mapToMovies()} else{
            emptyList()
        }) as List<Movie>
    }
    suspend fun getTrendingMovies(page :Int): List<Movie> = withContext(Dispatchers.IO) {
        val movies = movieClient.getTrendingMovies(page)
            .getOrElse {
                Log.e(LOG_TAG, "getTrendingMovies failed: ", it)
                null
            }
        (if(movies!=null){movies?.results?.mapToMovies()} else{
            emptyList()
        }) as List<Movie>
    }


    companion object {
        private const val LOG_TAG = "MovieRepository"
    }
}


