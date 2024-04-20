package com.example.bonusaufgabeppy.datapersistence.data;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J\u0019\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tJ\u0019\u0010\n\u001a\u00020\b2\u0006\u0010\u000b\u001a\u00020\fH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\rJ\u0019\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0086@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\tR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\u000f"}, d2 = {"Lcom/example/bonusaufgabeppy/datapersistence/data/MovieRepository;", "", "movieDao", "Lcom/example/bonusaufgabeppy/datapersistence/data/db/MovieDao;", "(Lcom/example/bonusaufgabeppy/datapersistence/data/db/MovieDao;)V", "addMovie", "", "movie", "Lcom/example/bonusaufgabeppy/datapersistence/data/db/Movie;", "(Lcom/example/bonusaufgabeppy/datapersistence/data/db/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovie", "movieId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "removeNote", "app_debug"})
@javax.inject.Singleton
public final class MovieRepository {
    private final com.example.bonusaufgabeppy.datapersistence.data.db.MovieDao movieDao = null;
    
    @javax.inject.Inject
    public MovieRepository(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.datapersistence.data.db.MovieDao movieDao) {
        super();
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object addMovie(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.datapersistence.data.db.Movie movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object getMovie(long movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.bonusaufgabeppy.datapersistence.data.db.Movie> continuation) {
        return null;
    }
    
    @org.jetbrains.annotations.Nullable
    public final java.lang.Object removeNote(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.datapersistence.data.db.Movie movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation) {
        return null;
    }
}