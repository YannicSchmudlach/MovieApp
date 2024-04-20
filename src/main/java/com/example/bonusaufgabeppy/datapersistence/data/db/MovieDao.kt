package com.example.bonusaufgabeppy.datapersistence.data.db

import androidx.room.Dao
import androidx.room.Delete
import androidx.room.Insert
import androidx.room.Query

@Dao
interface MovieDao {
    @Insert
    suspend fun insert(movie: Movie)


    @Query("SELECT * FROM movie where id = :movieId")
    suspend fun getMovie(movieId: Long): Movie

    @Delete
    suspend fun delete(movie: Movie)
}