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
        var movieId : Int,

        @ColumnInfo(name = "title")
        var title : String,

        @ColumnInfo(name = "overview")
        var synopsis : String,

        @ColumnInfo(name = "releaseDate")
        var releaseDate : String,

        @ColumnInfo(name = "favorite")
        var favorited: Boolean = false,

        @ColumnInfo(name = "imagePath")
        var imagePath : String,
)
