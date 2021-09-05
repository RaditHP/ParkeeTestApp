package com.radithp.jetpacksubmission3.data.source.remote

import androidx.lifecycle.LiveData
import androidx.lifecycle.MutableLiveData
import com.radithp.jetpacksubmission3.utils.EspressoIdlingResource
import com.radithp.parkeetestapp.api.ApiService
import retrofit2.await
import kotlinx.coroutines.CoroutineScope
import kotlinx.coroutines.Dispatchers.IO
import kotlinx.coroutines.launch
import java.io.IOException
import javax.inject.Inject

/**
Created by radit
 */
class RemoteDataSource @Inject constructor(private val movieApiService: ApiService) {


    fun getMovies(): LiveData<ApiResponse<List<MoviesResponse>>> {


        EspressoIdlingResource.increment()
        val resultMovie = MutableLiveData<ApiResponse<List<MoviesResponse>>>()
        CoroutineScope(IO).launch{
            try{
                val response = movieApiService.getPopular().await()
                resultMovie.postValue(ApiResponse.success(response.result!!))

            }catch (e:IOException){
                e.printStackTrace()
                resultMovie.postValue(
                    ApiResponse.error(
                        e.message.toString(),
                        mutableListOf()
                    )
                )
        }

        }
        EspressoIdlingResource.decrement()
        return resultMovie
    }


    interface LoadMoviesCallback {
        fun onAllMoviesRecieved(moviesResponse: List<MoviesResponse>)
    }


}

