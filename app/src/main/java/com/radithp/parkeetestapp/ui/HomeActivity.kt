package com.radithp.parkeetestapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.transaction
import com.radithp.parkeetestapp.api.ApiConfig
import com.radithp.parkeetestapp.data.remote.MoviesResponseApi
import com.radithp.parkeetestapp.databinding.ActivityHomeBinding
import com.radithp.parkeetestapp.ui.fragment.MoviePopularFragment
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response

class HomeActivity : AppCompatActivity() {

    companion object{
        private const val TAG = "MovieView"
    }


    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)

        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)

        loadFragment()
        loadMovies()


    }

    fun loadFragment(){
        val fm : FragmentManager = supportFragmentManager
        val fragmentTransaction = fm.beginTransaction()
    }

    fun loadMovies(){
        val client = ApiConfig.getApiService().getPopular()
        client.enqueue(object : Callback<MoviesResponseApi>{
            override fun onResponse(
                call: Call<MoviesResponseApi>,
                response: Response<MoviesResponseApi>
            ){
                if(response.isSuccessful){
                    Log.d(TAG,response.body().toString())
                }else{
                    Log.e(TAG,"onFailure: ${response.message()}")
                }

            }
            override fun onFailure(call: Call<MoviesResponseApi>, t: Throwable) {
                Log.e(TAG, "onFailure: ${t.message.toString()}")
            }

        })
    }
}