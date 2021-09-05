package com.radithp.parkeetestapp.ui

import androidx.appcompat.app.AppCompatActivity
import android.os.Bundle
import android.util.Log
import androidx.fragment.app.FragmentManager
import androidx.fragment.app.commit
import androidx.fragment.app.transaction
import androidx.lifecycle.ViewModelProvider
import com.radithp.parkeetestapp.R
import com.radithp.parkeetestapp.ViewModelFactory.ViewModelFactory
import com.radithp.parkeetestapp.api.ApiConfig
import com.radithp.parkeetestapp.data.remote.ListResponse
import com.radithp.parkeetestapp.data.remote.Movie
import com.radithp.parkeetestapp.data.remote.MoviesResponseApi
import com.radithp.parkeetestapp.databinding.ActivityHomeBinding
import com.radithp.parkeetestapp.ui.fragment.MoviePopularFragment
import com.radithp.parkeetestapp.ui.fragment.MoviePopularViewModel
import dagger.hilt.android.AndroidEntryPoint
import retrofit2.Call
import retrofit2.Callback
import retrofit2.Response
import javax.inject.Inject

@AndroidEntryPoint
class HomeActivity : AppCompatActivity() {

    @Inject
    lateinit var factory: ViewModelFactory

    companion object{
        private const val TAG = "MovieView"
    }


    override fun onCreate(savedInstanceState: Bundle?) {


        super.onCreate(savedInstanceState)

        val activityHomeBinding = ActivityHomeBinding.inflate(layoutInflater)
        setContentView(activityHomeBinding.root)
        //setupViewModel()

        supportFragmentManager.commit {
            add(R.id.hool,MoviePopularFragment())
        }



//        val sectionsPagerAdapter = SectionsPageAdapter(this, supportFragmentManager)
//        activityHomeBinding.viewPager.adapter = sectionsPagerAdapter
//        activityHomeBinding.tabs.setupWithViewPager(activityHomeBinding.viewPager)
//        supportActionBar?.elevation = 0f

    }
//    private fun setupViewModel() {
//        viewModel = ViewModelProvider(
//            this@HomeActivity,
//            factory
//        )[MoviePopularViewModel::class.java]
//    }


//    fun loadMovies(){
//        val client = ApiConfig.getApiService().getPopular()
//        client.enqueue(object : Callback<ListResponse<Movie>>{
//            override fun onResponse(
//                call: Call<MoviesResponseApi>,
//                response: Response<MoviesResponseApi>
//            ){
//                if(response.isSuccessful){
//                    Log.d(TAG,response.body().toString())
//                }else{
//                    Log.e(TAG,"onFailure: ${response.message()}")
//                }
//
//            }
//            override fun onFailure(call: Call<MoviesResponseApi>, t: Throwable) {
//                Log.e(TAG, "onFailure: ${t.message.toString()}")
//            }
//
//        })
//    }
}