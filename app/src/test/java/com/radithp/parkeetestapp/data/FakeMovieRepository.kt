package com.radithp.parkeetestapp.data

import androidx.lifecycle.LiveData
import androidx.paging.LivePagedListBuilder
import androidx.paging.PagedList
import com.radithp.jetpacksubmission3.data.source.remote.ApiResponse
import com.radithp.jetpacksubmission3.data.source.remote.MoviesResponse
import com.radithp.jetpacksubmission3.data.source.remote.RemoteDataSource
import com.radithp.jetpacksubmission3.utils.AppExecutors
import com.radithp.jetpacksubmission3.vo.Resource
import com.radithp.parkeetestapp.data.local.LocalDataSource
import com.radithp.parkeetestapp.data.local.entity.MovieEntity

/**
Created by radit
 */
class FakeMovieRepository(
        private val remoteDataSource: RemoteDataSource,
        private val localDataSource: LocalDataSource,
        private val appExecutors: AppExecutors): MovieDataSource {

    override fun getPopularMovies(): LiveData<Resource<PagedList<MovieEntity>>> {

        return object : NetworkBoundResource<PagedList<MovieEntity>, List<MoviesResponse>>(appExecutors){

            public override fun loadFromDB(): LiveData<PagedList<MovieEntity>> {
                val config = PagedList.Config.Builder()
                        .setEnablePlaceholders(false)
                        .setInitialLoadSizeHint(4)
                        .setPageSize(4)
                        .build()
                return LivePagedListBuilder(localDataSource.getMovies(),config).build()
            }

            override fun shouldFetch(data: PagedList<MovieEntity>?): Boolean =
                    data == null || data.isEmpty()


            override fun createCall(): LiveData<ApiResponse<List<MoviesResponse>>> =
                    remoteDataSource.getMovies()

            public override fun saveCallResult(moviesResponse: List<MoviesResponse>){
                val movieList = ArrayList<MovieEntity>()
                for (response in moviesResponse){
                    val movie = MovieEntity(
                            response.id,
                            response.title,
                            response.synopsis,
                            response.releaseDate,
                            response.cast,
                            false,
                            response.posterPath)
                    movieList.add(movie)
                }
                localDataSource.insertMovies(movieList)
            }
        }.asLiveData()

    }

}