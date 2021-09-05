package com.radithp.parkeetestapp.data.local

import androidx.lifecycle.LiveData
import androidx.paging.DataSource
import com.radithp.parkeetestapp.data.local.entity.MovieEntity
import com.radithp.parkeetestapp.data.local.room.MovieDao
import javax.inject.Inject

/**
Created by radit
 */
class LocalDataSource @Inject constructor(private val mMovieDao: MovieDao){


    fun getMovies(): DataSource.Factory<Int, MovieEntity> = mMovieDao.getPopularMovies()

    fun insertMovies(movies: List<MovieEntity>) = mMovieDao.insertMovies(movies)

}