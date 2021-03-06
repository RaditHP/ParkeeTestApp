package com.radithp.parkeetestapp.api

import com.radithp.jetpacksubmission3.data.source.remote.MoviesResponse
import com.radithp.parkeetestapp.data.remote.ListResponse
import dagger.Provides
import retrofit2.Call
import retrofit2.http.GET
import retrofit2.http.Headers

/**
Created by radit
 */
interface ApiService {
    @GET("3/movie/popular?api_key=f265234dddf1d9550de4f4382774685a&language=en-US&page=1")
    fun getPopular(): Call<ListResponse<MoviesResponse>>
}