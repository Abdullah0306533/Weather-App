package com.project.weather3.model.forecastweathermodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;
import com.project.weather3.model.currentweathermodel.Current;

/**
 * This class represents the weather forecast response from the API.
 * It contains the location, current weather, and forecast details.
 */
public class WeatherForecastResponse {

    @SerializedName("location")
    @Expose
    private ForecastLocation location;

    @SerializedName("current")
    @Expose
    private Current current;

    @SerializedName("forecast")
    @Expose
    private ForeCastWeather forecast;

    // Getters and setters for the fields can be added here if needed
}
