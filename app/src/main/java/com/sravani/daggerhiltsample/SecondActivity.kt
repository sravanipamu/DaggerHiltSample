package com.sravani.daggerhiltsample

import android.os.Bundle
import android.util.Log
import android.widget.TextView
import androidx.appcompat.app.AppCompatActivity
import com.sravani.daggerhiltsample.data.local.FileStorageService
import com.sravani.daggerhiltsample.data.remote.NetworkService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class SecondActivity : AppCompatActivity() {
    @Inject
    lateinit var fileStorageService1: FileStorageService
    @Inject
    lateinit var fileStorageService2: FileStorageService
    @Inject
    lateinit var networkService1: NetworkService
    @Inject
    lateinit var networkService2: NetworkService

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        var simpleText = TextView(this)
        simpleText.setText("Hello SecondActivity")
        setContentView(simpleText)
        Log.v("MainActvity", "file storage service1  = "+fileStorageService1.toString())
        Log.v("MainActvity", "file storage service2  = "+fileStorageService2.toString())
        Log.v("MainActvity", "network service1  = "+networkService1.toString())
        Log.v("MainActvity", "network service2  = "+networkService2.toString())
    }
}