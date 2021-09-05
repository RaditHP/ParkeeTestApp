package com.radithp.parkeetestapp.data

import androidx.arch.core.executor.testing.InstantTaskExecutorRule
import androidx.paging.DataSource
import com.nhaarman.mockitokotlin2.verify
import com.radithp.jetpacksubmission3.data.source.remote.RemoteDataSource
import com.radithp.jetpacksubmission3.utils.AppExecutors
import com.radithp.jetpacksubmission3.utils.PagedListUtils
import com.radithp.jetpacksubmission3.vo.Resource
import com.radithp.parkeetestapp.data.local.LocalDataSource
import com.radithp.parkeetestapp.data.local.entity.MovieEntity
import org.junit.Test

import org.junit.Assert.*
import org.junit.Rule
import org.mockito.Mockito

/**
 * Created by radit
 */
class MovieRepositoryTest {

    @get:Rule
    var instantTaskExecutorRule = InstantTaskExecutorRule()

    private val remote = Mockito.mock(RemoteDataSource::class.java)
    private val local = Mockito.mock(LocalDataSource::class.java)
    private val appExecutors = Mockito.mock(AppExecutors::class.java)

    private val movieRepository = FakeMovieRepository(remote,local,appExecutors)

    private val movieResponses = DataDummy.generateRemoteDummyMovies()
    private val movieId = movieResponses[0].id

    @Test
    fun getPopularMovies() {
        val dataSourceFactory = Mockito.mock(DataSource.Factory::class.java) as androidx.paging.DataSource.Factory<Int, MovieEntity>
        Mockito.`when`(local.getMovies()).thenReturn(dataSourceFactory)
        movieRepository.getPopularMovies()

        val movieEntities = Resource.success(PagedListUtils.mockPagedList(DataDummy.generateMovies()))
        verify(local).getMovies()
        assertNotNull(movieEntities)
        assertEquals(movieResponses.size.toLong(), movieEntities.data?.size?.toLong())
    }
}