package com.radithp.parkeetestapp.data

import androidx.lifecycle.LiveData
import androidx.paging.PagedList
import com.radithp.jetpacksubmission3.vo.Resource
import com.radithp.parkeetestapp.data.local.entity.MovieEntity

interface MovieDataSource {
    fun getPopularMovies(): LiveData<Resource<PagedList<MovieEntity>>>
}
