package com.radithp.parkeetestapp.data.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import com.radithp.parkeetestapp.data.local.entity.MovieEntity
import com.radithp.parkeetestapp.data.local.room.MovieDao

/**
Created by radit
 */
class LocalDataSource private constructor(private val mMovieDao: MovieDao){

    companion object{
        private var INSTANCE: LocalDataSource? = null

        fun getInstance(mMovieDao: MovieDao): LocalDataSource =
            INSTANCE ?: LocalDataSource(mMovieDao)
    }

    fun getMovies(): DataSource.Factory<Int, MovieEntity> = mMovieDao.getPopularMovies()

    fun insertMovies(movies: List<MovieEntity>) = mMovieDao.insertMovies(movies)

}