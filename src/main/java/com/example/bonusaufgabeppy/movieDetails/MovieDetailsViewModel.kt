package com.example.bonusaufgabeppy.movieDetails

import androidx.lifecycle.ViewModel
import androidx.lifecycle.viewModelScope
import com.example.bonusaufgabeppy.network.data.movie.MovieRepository
import dagger.hilt.android.lifecycle.HiltViewModel
import kotlinx.coroutines.flow.MutableStateFlow
import kotlinx.coroutines.flow.asStateFlow
import kotlinx.coroutines.flow.update
import kotlinx.coroutines.launch
import javax.inject.Inject

@HiltViewModel
class MovieDetailsViewModel@Inject constructor(
    private val movieRepository: MovieRepository,
    private val movieDbRepository: com.example.bonusaufgabeppy.datapersistence.data.MovieRepository
):ViewModel() {
    private val _movie = MutableStateFlow(DEFAULT_MOVIE_DETAIL_UI_DATA)
    val movie = _movie.asStateFlow()

    fun decideMovieLoad(movieID:Long){
        viewModelScope.launch {
            if (movieDbRepository.getMovie(movieID)==null){
                loadMovie(movieID)
            }else{
                getMovieFromDb(movieID)
            }
        }
    }

    private fun loadMovie(movieID:Long) {
        _movie.update { prev -> prev.copy(isLoading = true) }
        viewModelScope.launch {
            val movie = movieRepository.getMovie(movieID)
            if (movie != null) {
                _movie.update { prev -> prev.copy(isLoading = false,
                    id = movie.id,
                    title = movie.title,
                    poster_path = movie.poster_path,
                    overview = movie.overview,
                    backdrop_path = movie.backdrop_path,
                    vote_average = movie.vote_average,
                    ) }
                addMovie(com.example.bonusaufgabeppy.datapersistence.data.db.Movie(movieID,_movie.value.title,_movie.value.poster_path,_movie.value.overview,_movie.value.backdrop_path,_movie.value.vote_average))

            }
        }
    }

    private fun getMovieFromDb(movieId : Long){
        viewModelScope.launch {
                _movie.update { prev -> prev.copy(isLoading = true) }
                val data = movieDbRepository.getMovie(movieId)
                _movie.update { prev -> prev.copy(id=data.id, title = data.title, poster_path = data.poster_path,
                overview = data.overview, backdrop_path = data.backdrop_path, vote_average = data.vote_average, isLoading = false) }
        }
    }

    fun removeMovie(movie: com.example.bonusaufgabeppy.datapersistence.data.db.Movie) {
        viewModelScope.launch {
            movieDbRepository.removeNote(movie)
        }
    }
    fun addMovie(movie: com.example.bonusaufgabeppy.datapersistence.data.db.Movie) {
        viewModelScope.launch {
            if(movieDbRepository.getMovie(movieId = movie.id)==null) {
                movieDbRepository.addMovie(movie)
            }
        }
    }
    companion object {
        private val DEFAULT_MOVIE_DETAIL_UI_DATA = MovieDetailUIData(
            id = 0,
            title = "",
            poster_path = "",
            overview = "",
            backdrop_path = "",
            vote_average = 0.0,
            isLoading = false
        )
    }
}
