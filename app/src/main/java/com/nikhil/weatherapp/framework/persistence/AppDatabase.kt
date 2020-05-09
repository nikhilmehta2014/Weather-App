package com.nikhil.weatherapp.framework.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import com.nikhil.weatherapp.framework.persistence.model.AppDao
import com.nikhil.weatherapp.framework.persistence.model.AppData

@Database(entities = [AppData::class], version = 1)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): AppDao
}