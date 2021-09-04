package com.radithp.jetpacksubmission3.data.source.remote

import android.os.Parcelable
import kotlinx.parcelize.Parcelize

/**
Created by radit
 */

@Parcelize
data class MoviesResponse (
        val id : String,
        val title :String,
        val synopsis :String,
        val releaseDate :String,
        val cast: String,
        val posterPath :String
): Parcelable