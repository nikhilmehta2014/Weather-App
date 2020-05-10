package com.nikhil.weatherapp.framework.persistence

import androidx.lifecycle.LiveData
import androidx.room.Dao
import androidx.room.Insert
import androidx.room.OnConflictStrategy.REPLACE
import androidx.room.Query
import com.nikhil.weatherapp.framework.persistence.model.AppData

@Dao
interface WeatherDao {

    @Insert(onConflict = REPLACE)
    fun addWeatherData(weatherData: AppData)

    @Query("SELECT * from app_data")
    fun getWeatherData(): LiveData<AppData>
}