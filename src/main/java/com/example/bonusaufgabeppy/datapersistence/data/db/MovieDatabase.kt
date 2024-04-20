package com.example.bonusaufgabeppy.datapersistence.data.db

import android.content.Context
import androidx.room.Database
import androidx.room.Room
import androidx.room.RoomDatabase

@Database(entities = [Movie::class], version = 1)
abstract class MovieDatabase : RoomDatabase() {
    abstract fun movieDao(): MovieDao


    companion object {
        fun getDatabase(context: Context): MovieDatabase {
            return Room.databaseBuilder(
                context.applicationContext,//jede activity hat auch einen context applicationContext = Globaler context
                MovieDatabase::class.java,
                "movie_database"
            ).build()
        }
    }
}