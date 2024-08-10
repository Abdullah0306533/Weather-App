package com.project.weather3.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.project.weather3.model.currentweathermodel.CurrentWeatherResponse;
import com.project.weather3.model.forecastweathermodel.WeatherForecastResponse;
import com.project.weather3.repository.WeatherRepository;

/**
 * ViewModel class for managing and providing weather data.
 * This class interacts with the repository to fetch weather data and exposes it as LiveData.
 */
public class WeatherViewModel extends ViewModel {

    private WeatherRepository weatherRepository;
    private LiveData<CurrentWeatherResponse> weatherResponseLiveData;
    private LiveData<WeatherForecastResponse> foreCastWeatherResponseLiveData;

    /**
     * Initializes the WeatherViewModel and creates an instance of WeatherRepository.
     */
    public WeatherViewModel() {
        weatherRepository = new WeatherRepository();
    }

    /**
     * Fetches the current weather data for a specified city.
     * This method returns a LiveData object containing the current weather response.
     *
     * @param city The name of the city for which to fetch the current weather.
     * @return A LiveData object containing the current weather response.
     */
    public LiveData<CurrentWeatherResponse> getCurrentWeather(String city) {
        weatherResponseLiveData = weatherRepository.getWeather(city);
        return weatherResponseLiveData;
    }

    /**
     * Fetches the weather forecast data for a specified city and number of days.
     * This method returns a LiveData object containing the weather forecast response.
     *
     * @param city The name of the city for which to fetch the weather forecast.
     * @param day The number of days for which to fetch the forecast.
     * @return A LiveData object containing the weather forecast response.
     */
    public LiveData<WeatherForecastResponse> getForeCastWeather(String city, Integer day) {
        foreCastWeatherResponseLiveData = weatherRepository.getForecastWeather(city, day);
        return foreCastWeatherResponseLiveData;
    }
}
