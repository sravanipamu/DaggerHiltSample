package com.sravani.daggerhiltsample

import android.content.Intent
import android.os.Bundle
import android.os.Handler
import android.os.Looper
import android.util.Log
import androidx.activity.enableEdgeToEdge
import androidx.appcompat.app.AppCompatActivity
import androidx.core.view.ViewCompat
import androidx.core.view.WindowInsetsCompat
import com.sravani.daggerhiltsample.data.local.FileStorageService
import com.sravani.daggerhiltsample.data.remote.NetworkService
import dagger.hilt.android.AndroidEntryPoint
import javax.inject.Inject

@AndroidEntryPoint
class MainActivity : AppCompatActivity() {
    @Inject
    lateinit var fileStorageService1: FileStorageService
    @Inject
    lateinit var fileStorageService2: FileStorageService
    @Inject
    lateinit var networkService1: NetworkService
    @Inject
    lateinit var networkService2: NetworkService

    var handler = Handler(Looper.getMainLooper())

    override fun onCreate(savedInstanceState: Bundle?) {
        super.onCreate(savedInstanceState)
        setContentView(R.layout.activity_main)
        Log.v("MainActvity", "file storage service1  = "+fileStorageService1.toString())
        Log.v("MainActvity", "file storage service2  = "+fileStorageService2.toString())
        Log.v("MainActvity", "network service1  = "+networkService1.toString())
        Log.v("MainActvity", "network service2  = "+networkService2.toString())
        handler.postDelayed({
            startActivity(Intent(this, SecondActivity::class.java))
        }, 1000)
    }
}