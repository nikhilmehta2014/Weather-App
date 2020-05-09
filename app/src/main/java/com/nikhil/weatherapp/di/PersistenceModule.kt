package com.nikhil.weatherapp.di

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PersistenceModule {

    @Provides
    @Singleton
    fun providesSharedPreferences(context: Context):SharedPreferences{
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

}