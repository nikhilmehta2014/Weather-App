package com.nikhil.weatherapp.framework

import androidx.room.TypeConverter
import com.nikhil.weatherapp.framework.persistence.model.Weather
import com.squareup.moshi.Moshi
import com.squareup.moshi.Types

object RoomTypeConverter {
    @TypeConverter
    @JvmStatic
    fun weatherStringToList(data: String?): List<Weather>? {
        if (data == null) {
            return emptyList()
        }

        val moshi = Moshi.Builder().build()
        val type = Types.newParameterizedType(List::class.java, Weather::class.java)
        val adapter = moshi.adapter<List<Weather>>(type)
        return adapter.fromJson(data)
    }

    @TypeConverter
    @JvmStatic
    fun weatherListToString(objects: List<Weather>): String {
        val moshi = Moshi.Builder().build()
        val type = Types.newParameterizedType(List::class.java, Weather::class.java)
        val adapter = moshi.adapter<List<Weather>>(type)
        return adapter.toJson(objects)
    }
}