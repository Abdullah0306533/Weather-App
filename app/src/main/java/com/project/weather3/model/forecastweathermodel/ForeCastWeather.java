package com.project.weather3.model.forecastweathermodel;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

import java.util.List;

/**
 * This class represents the weather forecast data.
 * It contains a list of forecast days.
 */
public class ForeCastWeather {

    @SerializedName("forecastday")
    @Expose
    private List<ForeCastDay> forecastday;

    /**
     * Gets the list of forecast days.
     *
     * @return A list of {@link ForeCastDay} objects.
     */
    public List<ForeCastDay> getForecastday() {
        return forecastday;
    }

    /**
     * Sets the list of forecast days.
     *
     * @param forecastday A list of {@link ForeCastDay} objects.
     */
    public void setForecastday(List<ForeCastDay> forecastday) {
        this.forecastday = forecastday;
    }
}
