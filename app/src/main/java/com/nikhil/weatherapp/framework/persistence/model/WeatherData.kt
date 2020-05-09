package com.nikhil.weatherapp.framework.persistence.model

import androidx.room.Entity
import com.squareup.moshi.Json

@Entity
data class WeatherData(
    @Json(name = "base") val base: String,
    @Json(name = "clouds") val clouds: Clouds,
    @Json(name = "cod") val cod: Int,
    @Json(name = "coord") val coord: Coord,
    @Json(name = "dt") val dt: Int,
    @Json(name = "id") val id: Int,
    @Json(name = "main") val main: Main,
    @Json(name = "name") val name: String,
    @Json(name = "sys") val sys: Sys,
    @Json(name = "timezone") val timezone: Int,
    @Json(name = "weather") val weather: List<Weather>,
    @Json(name = "wind") val wind: Wind
)

data class Clouds(
    @Json(name = "all") val all: Int
)

data class Coord(
    @Json(name = "lat") val lat: Double,
    @Json(name = "lon") val lon: Double
)

data class Main(
    @Json(name = "feels_like") val feelsLike: Double,
    @Json(name = "grnd_level") val grounddLevel: Int,
    @Json(name = "humidity") val humidity: Int,
    @Json(name = "pressure") val pressure: Int,
    @Json(name = "sea_level") val seaLevel: Int,
    @Json(name = "temp") val temp: Double,
    @Json(name = "temp_max") val tempMax: Double,
    @Json(name = "temp_min") val tempMin: Double
)

data class Sys(
    @Json(name = "country") val country: String,
    @Json(name = "sunrise") val sunrise: Int,
    @Json(name = "sunset") val sunset: Int
)

data class Weather(
    @Json(name = "description") val description: String,
    @Json(name = "icon") val icon: String,
    @Json(name = "id") val id: Int,
    @Json(name = "main") val main: String
)

data class Wind(
    @Json(name = "deg") val deg: Int,
    @Json(name = "speed") val speed: Double
)