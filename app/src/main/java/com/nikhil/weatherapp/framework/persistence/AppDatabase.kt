package com.nikhil.weatherapp.framework.persistence

import androidx.room.Database
import androidx.room.RoomDatabase
import androidx.room.TypeConverters
import com.nikhil.weatherapp.framework.RoomTypeConverter
import com.nikhil.weatherapp.framework.persistence.model.AppData

@Database(entities = [AppData::class], version = AppDatabase.VERSION, exportSchema = false)
@TypeConverters(RoomTypeConverter::class)
abstract class AppDatabase : RoomDatabase() {
    abstract fun appDao(): WeatherDao

    companion object {
        const val NAME = "app-database"
        const val VERSION = 1
    }
}