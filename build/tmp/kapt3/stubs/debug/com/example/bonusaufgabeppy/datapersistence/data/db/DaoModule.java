package com.example.bonusaufgabeppy.datapersistence.data.db;

import java.lang.System;

@dagger.hilt.InstallIn(value = {dagger.hilt.components.SingletonComponent.class})
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0005\u00a2\u0006\u0002\u0010\u0002J\u0010\u0010\u0003\u001a\u00020\u00042\u0006\u0010\u0005\u001a\u00020\u0006H\u0007J\u0012\u0010\u0007\u001a\u00020\u00062\b\b\u0001\u0010\b\u001a\u00020\tH\u0007\u00a8\u0006\n"}, d2 = {"Lcom/example/bonusaufgabeppy/datapersistence/data/db/DaoModule;", "", "()V", "provideMovieDao", "Lcom/example/bonusaufgabeppy/datapersistence/data/db/MovieDao;", "database", "Lcom/example/bonusaufgabeppy/datapersistence/data/db/MovieDatabase;", "provideMovieDatabase", "context", "Landroid/content/Context;", "app_debug"})
@dagger.Module
public final class DaoModule {
    
    public DaoModule() {
        super();
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.bonusaufgabeppy.datapersistence.data.db.MovieDatabase provideMovieDatabase(@org.jetbrains.annotations.NotNull
    @dagger.hilt.android.qualifiers.ApplicationContext
    android.content.Context context) {
        return null;
    }
    
    @org.jetbrains.annotations.NotNull
    @javax.inject.Singleton
    @dagger.Provides
    public final com.example.bonusaufgabeppy.datapersistence.data.db.MovieDao provideMovieDao(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.datapersistence.data.db.MovieDatabase database) {
        return null;
    }
}