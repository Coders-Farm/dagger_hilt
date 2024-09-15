package com.example.daggerhilt

import android.util.Log
import javax.inject.Inject

class LoggerService @Inject constructor() {

    fun log(message:String){
        Log.e("User",message)
    }
}