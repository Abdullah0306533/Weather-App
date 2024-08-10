package com.project.weather3.repository;

import static com.project.weather3.utils.Utils.API_KEY;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.project.weather3.api.ApiForecastWeather;
import com.project.weather3.api.RetrofitCurrentWeather;
import com.project.weather3.api.ApiCurrentWeather;
import com.project.weather3.api.RetrofitForecastWeather;
import com.project.weather3.model.currentweathermodel.CurrentWeatherResponse;
import com.project.weather3.model.forecastweathermodel.WeatherForecastResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

/**
 * Repository class for fetching current weather and forecast data from the API.
 * This class handles the data retrieval using Retrofit and exposes the data via LiveData.
 */
public class WeatherRepository {

    private static final String TAG = "Repository"; // Use a single tag for logging
    private final ApiCurrentWeather apiInterface;
    private ApiForecastWeather apiForecastWeather;

    /**
     * Constructor that initializes the Retrofit API interfaces for current weather and forecast weather.
     */
    public WeatherRepository() {
        apiInterface = RetrofitCurrentWeather.getApiInterface();
        apiForecastWeather = RetrofitForecastWeather.getApiForecastWeather();
    }

    /**
     * Fetches the current weather data for a specified city.
     * The data is fetched asynchronously and returned as LiveData.
     *
     * @param city The name of the city for which to fetch the current weather.
     * @return A LiveData object containing the current weather response.
     */
    public LiveData<CurrentWeatherResponse> getWeather(String city) {
        MutableLiveData<CurrentWeatherResponse> mutableLiveData = new MutableLiveData<>();
        Call<CurrentWeatherResponse> response = apiInterface.getCurrentWeather(city, API_KEY);

        // Enqueue the API call asynchronously and set the response to LiveData on success.
        response.enqueue(new Callback<CurrentWeatherResponse>() {
            @Override
            public void onResponse(Call<CurrentWeatherResponse> call, Response<CurrentWeatherResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    // Log the fetched JSON response
                    Log.d(TAG, "Fetched JSON: " + response.body().toString());
                    // Set the fetched data to the MutableLiveData object
                    mutableLiveData.setValue(response.body());
                } else {
                    // Log an error if the response is not successful
                    Log.e(TAG, "Failed to fetch JSON: " + response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<CurrentWeatherResponse> call, Throwable throwable) {
                // Log an error if the network request fails
                Log.e(TAG, "Network request failed: " + throwable.getMessage());
            }
        });
        return mutableLiveData;
    }

    /**
     * Fetches the weather forecast data for a specified city and number of days.
     * The data is fetched asynchronously and returned as LiveData.
     *
     * @param city The name of the city for which to fetch the weather forecast.
     * @param days The number of days for which to fetch the forecast.
     * @return A LiveData object containing the weather forecast response.
     */
    public LiveData<WeatherForecastResponse> getForecastWeather(String city, Integer days) {
        MutableLiveData<WeatherForecastResponse> mutableLiveData = new MutableLiveData<>();
        Call<WeatherForecastResponse> response = apiForecastWeather.getAllForecast(API_KEY, city, days);

        // Enqueue the API call asynchronously and set the response to LiveData on success.
        response.enqueue(new Callback<WeatherForecastResponse>() {
            @Override
            public void onResponse(Call<WeatherForecastResponse> call, Response<WeatherForecastResponse> response) {
                // Log the fetched JSON response
                Log.d(TAG, "Fetched JSON: " + response.body().toString());
                // Set the fetched data to the MutableLiveData object
                mutableLiveData.setValue(response.body());
            }

            @Override
            public void onFailure(Call<WeatherForecastResponse> call, Throwable throwable) {
                // Log an error if the network request fails
                Log.e(TAG, "Network request failed: " + throwable.getMessage());
            }
        });
        return mutableLiveData;
    }
}
