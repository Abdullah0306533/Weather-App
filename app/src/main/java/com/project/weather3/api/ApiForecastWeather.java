package com.project.weather3.api;

import com.project.weather3.model.forecastweathermodel.WeatherForecastResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

public interface ApiForecastWeather {
    @GET("forecast.json")
    Call<WeatherForecastResponse> getAllForecast(
            @Query("key") String api_key,
            @Query("q") String city,
            @Query("days") int days
    );
}
