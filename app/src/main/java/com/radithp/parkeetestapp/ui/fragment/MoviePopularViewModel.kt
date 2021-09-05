package com.radithp.parkeetestapp.ui.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.radithp.jetpacksubmission3.vo.Resource
import com.radithp.parkeetestapp.data.MovieRepository
import com.radithp.parkeetestapp.data.local.entity.MovieEntity
import javax.inject.Inject

class MoviePopularViewModel @Inject constructor(private val movieRepository: MovieRepository) : ViewModel() {
    fun getPopularMovies(): LiveData<Resource<PagedList<MovieEntity>>> = movieRepository.getPopularMovies()
}