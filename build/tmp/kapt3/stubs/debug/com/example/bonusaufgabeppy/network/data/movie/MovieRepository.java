package com.example.bonusaufgabeppy.network.data.movie;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0007\u0018\u0000 \u00132\u00020\u0001:\u0001\u0013B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u001b\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0087@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u001f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u000eJ\'\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00060\u000b2\u0006\u0010\u0010\u001a\u00020\u00112\u0006\u0010\f\u001a\u00020\rH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0012R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u0014"}, d2 = {"Lcom/example/bonusaufgabeppy/network/data/movie/MovieRepository;", "", "movieClient", "Lcom/example/bonusaufgabeppy/network/data/api/MovieClient;", "(Lcom/example/bonusaufgabeppy/network/data/api/MovieClient;)V", "getMovie", "Lcom/example/bonusaufgabeppy/network/data/movie/Movie;", "id", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingMovies", "", "page", "", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMovies", "title", "", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "Companion", "app_debug"})
@javax.inject.Singleton
public final class MovieRepository {
    private final com.example.bonusaufgabeppy.network.data.api.MovieClient movieClient = null;
    @org.jetbrains.annotations.NotNull
    public static final com.example.bonusaufgabeppy.network.data.movie.MovieRepository.Companion Companion = null;
    private static final java.lang.String LOG_TAG = "MovieRepository";
    
    @javax.inject.Inject
    public MovieRepository(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.network.data.api.MovieClient movieClient) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    @android.annotation.SuppressLint(value = {"RestrictedApi"})
    public final java.lang.Object getMovie(long id, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.bonusaufgabeppy.network.data.movie.Movie> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object searchMovies(@org.jetbrains.annotations.NotNull
    java.lang.String title, int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.bonusaufgabeppy.network.data.movie.Movie>> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getTrendingMovies(int page, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super java.util.List<com.example.bonusaufgabeppy.network.data.movie.Movie>> continuation) {
        return null;
    }
    
    @kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\u0005"}, d2 = {"Lcom/example/bonusaufgabeppy/network/data/movie/MovieRepository$Companion;", "", "()V", "LOG_TAG", "", "app_debug"})
    public static final class Companion {
        
        private Companion() {
            super();
        }
    }
}