package com.example.bonusaufgabeppy.searchAndResult

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
class SearchAndResultViewModel @Inject constructor(
    private val movieRepository: MovieRepository
): ViewModel() {
    private val _movies = MutableStateFlow(DEFAULT_MOVIE_UI_DATA)
    val movie = _movies.asStateFlow()
    private var buttonCount = 1
    init {
        loadMovies(1)
    }
    private fun loadMovies(page:Int) {
        _movies.update { prev -> prev.copy(isLoading = true) }
        viewModelScope.launch {
            val movies = movieRepository.getTrendingMovies(page).filter { it.title!=null }
            _movies.update { prev -> prev.copy(isLoading = false, movies = prev.movies + movies) }
        }
    }

    private fun searchMovie(page:Int){
        _movies.update { prev -> prev.copy(isLoading = true) }
        viewModelScope.launch {
            val movies = movieRepository.searchMovies(_uiData.value,page)
            _movies.update { prev -> prev.copy(isLoading = false, movies = prev.movies + movies) }
        }
    }

    private fun removeMovies() {
        _movies.update { prev ->
            prev.copy(isLoading = true)
        }
        viewModelScope.launch {
            _movies.update { prev ->
                prev.copy(isLoading = false, movies = emptyList())
            }
        }
    }

    private val _uiData: MutableStateFlow<String> = MutableStateFlow("")
    val uiData =_uiData.asStateFlow()

    fun searchField(search: String){
        _uiData.value = search
        removeMovies()
        buttonCount=1
        if(_uiData.value.equals("")){
            loadMovies(buttonCount)
        }else{
            searchMovie(buttonCount)
        }

    }

    fun loadMoreButton(){
        buttonCount += 1
        if(uiData.value.equals("")){
            loadMovies(buttonCount)
        }else{
            searchMovie(buttonCount)
        }
    }

    companion object {
        private val DEFAULT_MOVIE_UI_DATA = MovieUIData(movies = emptyList(), isLoading = false)
    }
}