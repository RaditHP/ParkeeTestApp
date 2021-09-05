package com.radithp.parkeetestapp.data.remote

import com.google.gson.annotations.SerializedName

/**
Created by radit
 */
data class MoviesResponseApi (

    @field:SerializedName("results")
    val movie: List<Movie>
    )

data class Movie(
    @field:SerializedName("title")
    val title: String,

    @field:SerializedName("overview")
    val overview: String,

    @field: SerializedName("release_date")
    val releaseDate: String,

    @field: SerializedName("poster_path")
    val posterPath: String,

    @field: SerializedName("id")
    val id: Int

)