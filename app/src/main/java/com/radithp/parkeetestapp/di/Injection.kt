package com.radithp.parkeetestapp.di

import android.content.Context
import com.radithp.jetpacksubmission3.data.source.remote.RemoteDataSource
import com.radithp.jetpacksubmission3.utils.AppExecutors
import com.radithp.jetpacksubmission3.utils.JsonHelper
import com.radithp.parkeetestapp.data.MovieRepository
import com.radithp.parkeetestapp.data.local.LocalDataSource
import com.radithp.parkeetestapp.data.local.room.MovieDatabase

/**
Created by radit
 */
object Injection {
    fun provideRepository(context: Context): MovieRepository {

        val database = MovieDatabase.getInstance(context)

        val remoteDataSource = RemoteDataSource.getInstance(JsonHelper(context))
        val localDataSource = LocalDataSource.getInstance(database.movieDao())
        val appExecutors = AppExecutors()

        return MovieRepository.getInstance(remoteDataSource,localDataSource,appExecutors)
    }
}