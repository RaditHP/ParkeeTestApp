package com.radithp.parkeetestapp.ViewModelFactory

import android.content.Context
import androidx.lifecycle.ViewModel
import androidx.lifecycle.ViewModelProvider
import com.radithp.parkeetestapp.data.MovieRepository
import com.radithp.parkeetestapp.ui.fragment.MoviePopularViewModel
import javax.inject.Inject

/**
Created by radit
 */
class ViewModelFactory @Inject constructor(private val mMovieRepository: MovieRepository): ViewModelProvider.NewInstanceFactory(){
//    companion object {
//        @Volatile
//        private var instance: ViewModelFactory? = null
//
//        fun getInstance(context: Context): ViewModelFactory =
//            instance ?: synchronized(this) {
//                instance ?: ViewModelFactory(Injection.provideRepository(context)).apply {
//                    instance = this
//                }
//            }
//    }
    @Suppress("UNCHECKED_CAST")
    override fun <T : ViewModel> create(modelClass: Class<T>): T {
        return when {
            modelClass.isAssignableFrom(MoviePopularViewModel::class.java) -> {
                MoviePopularViewModel(mMovieRepository) as T
            }

            else -> throw Throwable("Unknown ViewModel class: " + modelClass.name)
        }

    }
}