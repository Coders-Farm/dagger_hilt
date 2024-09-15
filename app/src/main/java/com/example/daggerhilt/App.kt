package com.example.daggerhilt

import android.app.Application
import dagger.hilt.android.HiltAndroidApp
import javax.inject.Inject
import javax.inject.Named

@HiltAndroidApp
class App:Application() {


    override fun onCreate() {
        super.onCreate()

    }

}