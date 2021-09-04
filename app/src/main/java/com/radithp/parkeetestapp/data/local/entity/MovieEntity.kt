package com.radithp.parkeetestapp.data.local.entity

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "movieentities")
data class MovieEntity (
        @PrimaryKey
        @NonNull
        @ColumnInfo(name = "movieId")
        var movieId : String,

        @ColumnInfo(name = "title")
        var title : String,

        @ColumnInfo(name = "synopsis")
        var synopsis : String,

        @ColumnInfo(name = "releaseDate")
        var releaseDate : String,

        @ColumnInfo(name = "cast")
        var cast : String,

        @ColumnInfo(name = "favorite")
        var favorited: Boolean = false,

        @ColumnInfo(name = "imagePath")
        var imagePath : String,
)
