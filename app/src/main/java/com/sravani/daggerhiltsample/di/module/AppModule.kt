package com.sravani.daggerhiltsample.di.module

import com.sravani.daggerhiltsample.data.remote.NetworkService
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.components.SingletonComponent
import javax.inject.Singleton

@InstallIn(SingletonComponent::class)
@Module
class AppModule {
    @Singleton
    @Provides
    fun getNetworkService() : NetworkService {
        return NetworkService()
    }
}