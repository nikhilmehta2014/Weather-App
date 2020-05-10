package com.nikhil.weatherapp.di

import android.content.Context
import android.content.SharedPreferences
import androidx.preference.PreferenceManager
import androidx.room.Room
import com.nikhil.weatherapp.framework.persistence.AppDatabase
import com.nikhil.weatherapp.framework.persistence.WeatherDao
import dagger.Module
import dagger.Provides
import javax.inject.Singleton

@Module
class PersistenceModule {

    @Provides
    @Singleton
    fun provideSharedPreferences(context: Context): SharedPreferences {
        return PreferenceManager.getDefaultSharedPreferences(context)
    }

    @Provides
    @Singleton
    fun provideAppDatabase(context: Context): AppDatabase {
        return Room.databaseBuilder(context, AppDatabase::class.java, AppDatabase.NAME)
            .build()
    }

    @Provides
    @Singleton
    fun provideAppDao(appDatabase: AppDatabase): WeatherDao {
        return appDatabase.appDao()
    }

}