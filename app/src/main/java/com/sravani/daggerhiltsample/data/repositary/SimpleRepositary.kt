package com.sravani.daggerhiltsample.data.repositary

import com.sravani.daggerhiltsample.data.remote.NetworkService
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class SimpleRepositary @Inject constructor(val networkService: NetworkService) {
    fun getData() {
        networkService.getData()
    }
}