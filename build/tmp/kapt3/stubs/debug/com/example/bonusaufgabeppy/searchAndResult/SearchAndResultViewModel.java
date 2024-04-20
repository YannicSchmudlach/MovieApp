package com.example.bonusaufgabeppy.searchAndResult;

import java.lang.System;

@dagger.hilt.android.lifecycle.HiltViewModel
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\b\b\u0007\u0018\u0000 \u001a2\u00020\u0001:\u0001\u001aB\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0006\u0010\u0012\u001a\u00020\u0013J\u0010\u0010\u0014\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0002J\b\u0010\u0016\u001a\u00020\u0013H\u0002J\u000e\u0010\u0017\u001a\u00020\u00132\u0006\u0010\u0018\u001a\u00020\tJ\u0010\u0010\u0019\u001a\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u000bH\u0002R\u0014\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0014\u0010\b\u001a\b\u0012\u0004\u0012\u00020\t0\u0006X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e\u00a2\u0006\u0002\n\u0000R\u0017\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u00070\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u0017\u0010\u0010\u001a\b\u0012\u0004\u0012\u00020\t0\r\u00a2\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u000f\u00a8\u0006\u001b"}, d2 = {"Lcom/example/bonusaufgabeppy/searchAndResult/SearchAndResultViewModel;", "Landroidx/lifecycle/ViewModel;", "movieRepository", "Lcom/example/bonusaufgabeppy/network/data/movie/MovieRepository;", "(Lcom/example/bonusaufgabeppy/network/data/movie/MovieRepository;)V", "_movies", "Lkotlinx/coroutines/flow/MutableStateFlow;", "Lcom/example/bonusaufgabeppy/searchAndResult/MovieUIData;", "_uiData", "", "buttonCount", "", "movie", "Lkotlinx/coroutines/flow/StateFlow;", "getMovie", "()Lkotlinx/coroutines/flow/StateFlow;", "uiData", "getUiData", "loadMoreButton", "", "loadMovies", "page", "removeMovies", "searchField", "search", "searchMovie", "Companion", "app_debug"})
public final class SearchAndResultViewModel extends androidx.lifecycle.ViewModel {
    private final com.example.bonusaufgabeppy.network.data.movie.MovieRepository movieRepository = null;
    private final kotlinx.coroutines.flow.MutableStateFlow<com.example.bonusaufgabeppy.searchAndResult.MovieUIData> _movies = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<com.example.bonusaufgabeppy.searchAndResult.MovieUIData> movie = null;
    private int buttonCount = 1;
    private final kotlinx.coroutines.flow.MutableStateFlow<java.lang.String> _uiData = null;
    @org.jetbrains.annotations.NotNull
    private final kotlinx.coroutines.flow.StateFlow<java.lang.String> uiData = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.bonusaufgabeppy.searchAndResult.SearchAndResultViewModel.Companion Companion = null;
    private static final com.example.bonusaufgabeppy.searchAndResult.MovieUIData DEFAULT_MOVIE_UI_DATA = null;
    
    @javax.inject.Inject
    public SearchAndResultViewModel(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.network.data.movie.MovieRepository movieRepository) {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<com.example.bonusaufgabeppy.searchAndResult.MovieUIData> getMovie() {
        return null;
    }
    
    private final void loadMovies(int page) {
    }
    
    private final void searchMovie(int page) {
    }
    
    private final void removeMovies() {
    }
    
    @org.jetbrains.annotations.NotNull
    public final kotlinx.coroutines.flow.StateFlow<java.lang.String> getUiData() {
        return null;
    }
    
    public final void searchField(@org.jetbrains.annotations.NotNull
    java.lang.String search) {
    }
    
    public final void loadMoreButton() {
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/bonusaufgabeppy/searchAndResult/SearchAndResultViewModel$Companion;", "", "()V", "DEFAULT_MOVIE_UI_DATA", "Lcom/example/bonusaufgabeppy/searchAndResult/MovieUIData;", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}