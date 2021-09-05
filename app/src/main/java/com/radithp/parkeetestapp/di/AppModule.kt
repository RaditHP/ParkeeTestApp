package com.radithp.parkeetestapp.di

import com.radithp.jetpacksubmission3.data.source.remote.RemoteDataSource
import com.radithp.parkeetestapp.ViewModelFactory.ViewModelFactory
import com.radithp.parkeetestapp.api.ApiService
import com.radithp.parkeetestapp.data.MovieRepository
import com.radithp.parkeetestapp.data.local.LocalDataSource
import com.radithp.parkeetestapp.data.local.room.MovieDao
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import dagger.hilt.migration.DisableInstallInCheck
import javax.inject.Singleton

/**
Created by radit
 */
@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    companion object{
        @Singleton
        @Provides
        fun provideRemoteDataSource(apiService: ApiService): RemoteDataSource =
            RemoteDataSource(apiService)

        @Singleton
        @Provides
        fun provideLocalDataSource(movieDao: MovieDao): LocalDataSource =
            LocalDataSource(movieDao)

        @Singleton
        @Provides
        fun provideMovieRepository(
            remoteDataSource: RemoteDataSource,
            localDataSource: LocalDataSource
        ): MovieRepository = MovieRepository(remoteDataSource, localDataSource)

        @Singleton
        @Provides
        fun provideViewModelFactory(movieRepository: MovieRepository): ViewModelFactory =
            ViewModelFactory(movieRepository)
    }
}