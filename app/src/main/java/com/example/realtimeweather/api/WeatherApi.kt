package com.example.realtimeweather.api


import retrofit2.Response
import retrofit2.http.GET
import retrofit2.http.Query
import java.util.Calendar.getInstance

interface WeatherApi {


    @GET("/v1/current.json")
    suspend fun getWeather(
        @Query("key") apikey: String,
        @Query("q") city: String

    ) : Response<WeatherModel>

}