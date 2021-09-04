package com.radithp.parkeetestapp.ui.fragment

import androidx.lifecycle.LiveData
import androidx.lifecycle.ViewModel
import androidx.paging.PagedList
import com.radithp.jetpacksubmission3.vo.Resource
import com.radithp.parkeetestapp.data.MovieRepository
import com.radithp.parkeetestapp.data.local.entity.MovieEntity

class MoviePopularViewModel(private val movieRepository: MovieRepository) : ViewModel() {
    fun getPopularMovies(): LiveData<Resource<PagedList<MovieEntity>>> = movieRepository.getPopularMovies()
}