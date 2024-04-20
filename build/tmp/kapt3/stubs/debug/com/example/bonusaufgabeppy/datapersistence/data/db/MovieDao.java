package com.example.bonusaufgabeppy.datapersistence.data.db;

import java.lang.System;

@androidx.room.Dao
@kotlin.Metadata(mv = {1, 7, 1}, k = 1, d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J\u0019\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006J\u0019\u0010\u0007\u001a\u00020\u00052\u0006\u0010\b\u001a\u00020\tH\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\nJ\u0019\u0010\u000b\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\u00a7@\u00f8\u0001\u0000\u00a2\u0006\u0002\u0010\u0006\u0082\u0002\u0004\n\u0002\b\u0019\u00a8\u0006\f"}, d2 = {"Lcom/example/bonusaufgabeppy/datapersistence/data/db/MovieDao;", "", "delete", "", "movie", "Lcom/example/bonusaufgabeppy/datapersistence/data/db/Movie;", "(Lcom/example/bonusaufgabeppy/datapersistence/data/db/Movie;Lkotlin/coroutines/Continuation;)Ljava/lang/Object;", "getMovie", "movieId", "", "(JLkotlin/coroutines/Continuation;)Ljava/lang/Object;", "insert", "app_debug"})
public abstract interface MovieDao {
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Insert
    public abstract java.lang.Object insert(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.datapersistence.data.db.Movie movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Query(value = "SELECT * FROM movie where id = :movieId")
    public abstract java.lang.Object getMovie(long movieId, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super com.example.bonusaufgabeppy.datapersistence.data.db.Movie> continuation);
    
    @org.jetbrains.annotations.Nullable
    @androidx.room.Delete
    public abstract java.lang.Object delete(@org.jetbrains.annotations.NotNull
    com.example.bonusaufgabeppy.datapersistence.data.db.Movie movie, @org.jetbrains.annotations.NotNull
    kotlin.coroutines.Continuation<? super kotlin.Unit> continuation);
}