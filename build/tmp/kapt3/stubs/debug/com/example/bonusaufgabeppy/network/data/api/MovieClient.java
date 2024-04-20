package com.example.bonusaufgabeppy.network.data.api;

import java.lang.System;

@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\b\u0007\u0018\u00002\u00020\u0001B\u000f\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u00a2\u0006\u0002\u0010\u0004J*\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\n\u001a\u00020\u000bH\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\f\u0010\rJ*\u0010\u000e\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0012\u0010\u0013J2\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u000f0\b2\u0006\u0010\u0015\u001a\u00020\u00062\u0006\u0010\u0010\u001a\u00020\u0011H\u0086@\u00f8\u0001\u0000\u00f8\u0001\u0001\u00f8\u0001\u0002\u00f8\u0001\u0002\u00a2\u0006\u0004\b\u0016\u0010\u0017R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004\u00a2\u0006\u0002\n\u0000R\u000e\u0010\u0005\u001a\u00020\u0006X\u0082D\u00a2\u0006\u0002\n\u0000\u0082\u0002\u000f\n\u0002\b!\n\u0005\b\u00a1\u001e0\u0001\n\u0002\b\u0019\u00a8\u0006\u0018"}, d2 = {"Lcom/example/bonusaufgabeppy/network/data/api/MovieClient;", "", "api", "Lcom/example/bonusaufgabeppy/network/data/api/MovieAPI;", "(Lcom/example/bonusaufgabeppy/network/data/api/MovieAPI;)V", "key", "", "getMovie", "Lkotlin/Result;", "Lcom/example/bonusaufgabeppy/network/data/api/dto/MovieDTO;", "id", "", "getMovie-gIAlu-s", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getTrendingMovies", "Lcom/example/bonusaufgabeppy/network/data/api/dto/MoviesDTO;", "page", "", "getTrendingMovies-gIAlu-s", "(ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "searchMovies", "title", "searchMovies-0E7RQCE", "(Ljava/lang/String;ILkotlin/coroutines/Continuation;)Ljava/lang/Object;", "app_debug"})
@javax.inject.Singleton
public final class MovieClient {
    private final com.example.bonusaufgabeppy.network.data.api.MovieAPI api = null;
    private final java.lang.String key = "fdda6957b6449a6de568d1f176b6d657";
    
    @javax.inject.Inject
    public MovieClient(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.network.data.api.MovieAPI api) {
        super();
    }
}