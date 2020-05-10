package com.nikhil.weatherapp.framework

import androidx.lifecycle.LiveData
import com.nikhil.weatherapp.framework.persistence.WeatherDao
import com.nikhil.weatherapp.framework.persistence.model.AppData

class WeatherRepository(private val weatherDao: WeatherDao){

    val weatherData: LiveData<AppData> = weatherDao.getWeatherData()

    fun addWeatherData(weatherData: AppData){
        weatherDao.addWeatherData(weatherData)
    }

}