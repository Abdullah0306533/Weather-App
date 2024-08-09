package com.project.weather3.api;

import com.project.weather3.model.WeatherResponse;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Query;

// Interface for API calls
public interface ApiInterface {
    @GET("current.json") // Assuming the endpoint is 'weather'
    Call<WeatherResponse> getWeather(
            @Query("q") String city,
            @Query("key") String apiKey // Add API key directly as a query parameter
    );
}