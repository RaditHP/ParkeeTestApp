package com.radithp.parkeetestapp.ui.fragment

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.lifecycle.MutableLiveData
import androidx.lifecycle.Observer
import androidx.paging.PagedList
import com.radithp.jetpacksubmission3.vo.Resource
import com.radithp.parkeetestapp.data.MovieRepository
import com.radithp.parkeetestapp.data.local.entity.MovieEntity
import org.junit.Test

import org.junit.Assert.*
import org.junit.Before
import org.junit.Rule
import org.junit.runner.RunWith
import org.mockito.Mock
import org.mockito.Mockito
import org.mockito.junit.MockitoJUnitRunner

/**
 * Created by radit
 */
@RunWith(MockitoJUnitRunner::class)
class MoviePopularViewModelTest {
    private lateinit var viewModel: MoviePopularViewModel

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    @Mock
    private lateinit var movieRepository: MovieRepository

    @Mock
    private lateinit var observer: Observer<Resource<PagedList<MovieEntity>>>

    @Mock
    private lateinit var pagedList: PagedList<MovieEntity>

    @Before
    fun setUp(){
        viewModel = MoviePopularViewModel(movieRepository)
    }

    @Test
    fun getPopularMovies() {
        val dummyMovies = Resource.success(pagedList)
        Mockito.`when`(dummyMovies.data?.size).thenReturn(10)
        val movies = MutableLiveData<Resource<PagedList<MovieEntity>>>()
        movies.value = dummyMovies


        Mockito.`when`(movieRepository.getPopularMovies()).thenReturn(movies)
        val moviesEntities = viewModel.getPopularMovies().value?.data
        Mockito.verify(movieRepository).getPopularMovies()
        assertNotNull(moviesEntities)
        assertEquals(10,moviesEntities?.size)

        viewModel.getPopularMovies().observeForever(observer)
        Mockito.verify(observer).onChanged(dummyMovies)
    }
}