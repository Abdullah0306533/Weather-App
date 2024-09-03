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

    // Getters and setters

    public ForecastLocation getLocation() {
        return location;
    }

    public void setLocation(ForecastLocation location) {
        this.location = location;
    }

    public Current getCurrent() {
        return current;
    }

    public void setCurrent(Current current) {
        this.current = current;
    }

    public ForeCastWeather getForecast() {
        return forecast;
    }

    public void setForecast(ForeCastWeather forecast) {
        this.forecast = forecast;
    }
}
