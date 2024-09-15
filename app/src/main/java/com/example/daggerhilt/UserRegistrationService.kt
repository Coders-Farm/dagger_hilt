package com.example.daggerhilt

import android.util.Log
import dagger.hilt.android.scopes.ActivityScoped
import javax.inject.Inject


interface  UserRegistrationService{
    fun createUser(email:String,password:String)
}

class FirebaseService @Inject constructor():UserRegistrationService {

    override fun createUser(email:String,password:String){
        Log.e("User","User saved successfully. $email")
    }

}

class DatabaseService:UserRegistrationService {

    override fun createUser(email:String,password:String){
        Log.e("User","User saved successfully. $email")
    }

}