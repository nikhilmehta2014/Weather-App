package com.nikhil.weatherapp.framework.persistence.model

import androidx.room.Dao
import androidx.room.Query

@Dao
interface AppDao {
    @Query("SELECT * from app_data")
    fun getWeatherData(): AppData
}