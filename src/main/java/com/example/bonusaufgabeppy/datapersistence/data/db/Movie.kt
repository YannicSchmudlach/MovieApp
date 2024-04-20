package com.example.bonusaufgabeppy.datapersistence.data.db

import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity
data class Movie(
    @PrimaryKey
    val id: Long,
    val title: String?,
    val poster_path: String?,
    val overview: String,
    val backdrop_path:String?,
    val vote_average:Double,
) {

}