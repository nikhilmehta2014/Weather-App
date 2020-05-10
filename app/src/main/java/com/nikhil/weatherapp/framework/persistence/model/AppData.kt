package com.nikhil.weatherapp.framework.persistence.model

import androidx.annotation.NonNull
import androidx.room.ColumnInfo
import androidx.room.Embedded
import androidx.room.Entity
import androidx.room.PrimaryKey

@Entity(tableName = "app_data")
data class AppData(
    @PrimaryKey(autoGenerate = true) val primaryId : Int = 0,
    @ColumnInfo(name = "base") val base: String,
    @Embedded @NonNull
    @ColumnInfo(name = "clouds") val clouds: Clouds,
    @ColumnInfo(name = "cod") val cod: Int,
    @Embedded @NonNull
    @ColumnInfo(name = "coord") val coord: Coord,
    @ColumnInfo(name = "dt") val dt: Int,
    @ColumnInfo(name = "id") val id: Int,
    @Embedded @NonNull
    @ColumnInfo(name = "main") val main: Main,
    @ColumnInfo(name = "name") val name: String,
    @Embedded @NonNull
    @ColumnInfo(name = "sys") val sys: Sys,
    @ColumnInfo(name = "timezone") val timezone: Int,
    @ColumnInfo(name = "weather") val weather: List<Weather>,
    @Embedded @NonNull
    @ColumnInfo(name = "wind") val wind: Wind
)

data class Clouds(
    @ColumnInfo(name = "all") val all: Int
)

data class Coord(
    @ColumnInfo(name = "lat") val lat: Double,
    @ColumnInfo(name = "lon") val lon: Double
)

data class Main(
    @ColumnInfo(name = "feels_like") val feelsLike: Double,
    @ColumnInfo(name = "grnd_level") val grounddLevel: Int,
    @ColumnInfo(name = "humidity") val humidity: Int,
    @ColumnInfo(name = "pressure") val pressure: Int,
    @ColumnInfo(name = "sea_level") val seaLevel: Int,
    @ColumnInfo(name = "temp") val temp: Double,
    @ColumnInfo(name = "temp_max") val tempMax: Double,
    @ColumnInfo(name = "temp_min") val tempMin: Double
)

data class Sys(
    @ColumnInfo(name = "country") val country: String,
    @ColumnInfo(name = "sunrise") val sunrise: Int,
    @ColumnInfo(name = "sunset") val sunset: Int
)

data class Weather(
    @ColumnInfo(name = "description") val description: String,
    @ColumnInfo(name = "icon") val icon: String,
    @ColumnInfo(name = "id") val id: Int,
    @ColumnInfo(name = "main") val main: String
)

data class Wind(
    @ColumnInfo(name = "deg") val deg: Int,
    @ColumnInfo(name = "speed") val speed: Double
)