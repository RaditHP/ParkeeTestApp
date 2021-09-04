package com.radithp.parkeetestapp.data.local.room

import androidx.paging.DataSource
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy
import androidx.room.Query
import com.radithp.parkeetestapp.data.local.entity.MovieEntity


/**
Created by radit
 */
@Dao
interface MovieDao {
    @Query("SELECT * FROM movieentities")
    fun getPopularMovies(): DataSource.Factory<Int, MovieEntity>

    @Insert(onConflict = OnConflictStrategy.REPLACE)
    fun insertMovies(courses: List<MovieEntity>)
}