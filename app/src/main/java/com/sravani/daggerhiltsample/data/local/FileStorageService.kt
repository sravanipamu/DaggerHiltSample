package com.sravani.daggerhiltsample.data.local

import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject

@ActivityScoped
class FileStorageService @Inject constructor() {
    fun getData() : String {
        return "Getting data from File"
    }
}