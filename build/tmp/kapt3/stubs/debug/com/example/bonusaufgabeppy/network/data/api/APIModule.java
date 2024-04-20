package com.example.bonusaufgabeppy.network.data.api;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.OptIn(markerClass = {kotlinx.serialization.ExperimentalSerializationApi.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u00c7\u0002\u0018\u00002\u00020\u0001B\u0007\b\u0002\u00a2\u0006\u0002\u0010\u0002J\b\u0010\u0005\u001a\u00020\u0006H\u0007J\u0010\u0010\u0007\u001a\u00020\b2\u0006\u0010\t\u001a\u00020\u0006H\u0007R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082T\u00a2\u0006\u0002\n\u0000\u00a8\u0006\n"}, d2 = {"Lcom/example/bonusaufgabeppy/network/data/api/APIModule;", "", "()V", "MOVIE_API_BASE_URL", "", "provideHttpClientForApi", "Lio/ktor/client/HttpClient;", "provideJsonPlaceHolderApi", "Lcom/example/bonusaufgabeppy/network/data/api/MovieAPI;", "client", "app_debug"})
@dagger.Module
public final class APIModule {
    @org.jetbrains.annotations.NotNull
    public static final com.example.bonusaufgabeppy.network.data.api.APIModule INSTANCE = null;
    private static final java.lang.String MOVIE_API_BASE_URL = "https://api.themoviedb.org/";
    
    private APIModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final io.ktor.client.HttpClient provideHttpClientForApi() {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.bonusaufgabeppy.network.data.api.MovieAPI provideJsonPlaceHolderApi(@org.jetbrains.annotations.NotNull
    io.ktor.client.HttpClient client) {
        return null;
    }
}