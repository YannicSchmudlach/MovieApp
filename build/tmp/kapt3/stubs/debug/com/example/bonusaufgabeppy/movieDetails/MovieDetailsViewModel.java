package com.example.bonusaufgabeppy.movieDetails;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0006\b\u0007\u0018\u0000 \u00182\u00020\u0001:\u0001\u0018B\u0017\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u00a2\u0006\u0002\u0010\u0006J\u000e\u0010\u000e\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0010J\u000e\u0010\u0011\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u000f2\u0006\u0010\u0015\u001a\u00020\u0013H\u0002J\u0010\u0010\u0016\u001a\u00020\u000f2\u0006\u0010\u0012\u001a\u00020\u0013H\u0002J\u000e\u0010\u0017\u001a\u00020\u000f2\u0006\u0010\n\u001a\u00020\u0010R\u0014\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\bX\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\u000b\u00a2\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0019"}, d2 = {"Lcom/example/bonusaufgabeppy/movieDetails/MovieDetailsViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepository", "Lcom/example/bonusaufgabeppy/network/data/movie/MovieRepository;", "movieDbRepository", "Lcom/example/bonusaufgabeppy/datapersistence/data/MovieRepository;", "(Lcom/example/bonusaufgabeppy/network/data/movie/MovieRepository;Lcom/example/bonusaufgabeppy/datapersistence/data/MovieRepository;)V", "_movie", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/bonusaufgabeppy/movieDetails/MovieDetailUIData;", "movie", "Lkotlinx/coroutines/flow/StateFlow;", "getMovie", "()Lkotlinx/coroutines/flow/StateFlow;", "addMovie", "", "Lcom/example/bonusaufgabeppy/datapersistence/data/db/Movie;", "decideMovieLoad", "movieID", "", "getMovieFromDb", "movieId", "loadMovie", "removeMovie", "Companion", "app_debug"})
public final class MovieDetailsViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.bonusaufgabeppy.network.data.movie.MovieRepository movieRepository = null;
    private final com.example.bonusaufgabeppy.datapersistence.data.MovieRepository movieDbRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bonusaufgabeppy.movieDetails.MovieDetailUIData> _movie = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.bonusaufgabeppy.movieDetails.MovieDetailUIData> movie = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.bonusaufgabeppy.movieDetails.MovieDetailsViewModel.Companion Companion = null;
    private static final com.example.bonusaufgabeppy.movieDetails.MovieDetailUIData DEFAULT_MOVIE_DETAIL_UI_DATA = null;
    
    @javax.inject.Inject
    public MovieDetailsViewModel(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.network.data.movie.MovieRepository movieRepository, @org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.datapersistence.data.MovieRepository movieDbRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.bonusaufgabeppy.movieDetails.MovieDetailUIData> getMovie() {
        return null;
    }
    
    public final void decideMovieLoad(long movieID) {
    }
    
    private final void loadMovie(long movieID) {
    }
    
    private final void getMovieFromDb(long movieId) {
    }
    
    public final void removeMovie(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.datapersistence.data.db.Movie movie) {
    }
    
    public final void addMovie(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.datapersistence.data.db.Movie movie) {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/bonusaufgabeppy/movieDetails/MovieDetailsViewModel$Companion;", "", "()V", "DEFAULT_MOVIE_DETAIL_UI_DATA", "Lcom/example/bonusaufgabeppy/movieDetails/MovieDetailUIData;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}