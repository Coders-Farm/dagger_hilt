package com.example.daggerhilt

import android.provider.ContactsContract.Data
import dagger.Binds
import dagger.Module
import dagger.Provides
import dagger.hilt.InstallIn
import dagger.hilt.android.components.ActivityComponent
import dagger.hilt.android.scopes.ActivityScoped
import dagger.hilt.android.scopes.FragmentScoped
import dagger.hilt.components.SingletonComponent
import javax.inject.Named
import javax.inject.Singleton

@InstallIn(ActivityComponent::class)
@Module
class UserRegistrationModule {

    @Provides
    @UserQualifier
    @ActivityScoped
     fun provideFireBaseService(firebaseService: FirebaseService):UserRegistrationService{
        return firebaseService
    }

    @Provides
    @Named("database")
    fun provideDataBaseService():UserRegistrationService{
        return DatabaseService()
    }

}