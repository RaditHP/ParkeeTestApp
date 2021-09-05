package com.radithp.jetpacksubmission3.data.source.remote

import android.os.Parcelable
import com.google.gson.annotations.SerializedName
import kotlinx.parcelize.Parcelize

/**
Created by radit
 */

data class MoviesResponse (
        @field: SerializedName("id")
        val id: Int,

        @field:SerializedName("title")
        val title: String,

        @field:SerializedName("overview")
        val overview: String,

        @field: SerializedName("release_date")
        val releaseDate: String,

        @field: SerializedName("poster_path")
        val posterPath: String



)