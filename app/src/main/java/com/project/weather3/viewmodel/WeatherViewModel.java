package com.project.weather3.viewmodel;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.ViewModel;

import com.project.weather3.model.WeatherResponse;
import com.project.weather3.repository.Repository;

public class WeatherViewModel extends ViewModel {

    private  Repository repository;
    private LiveData<WeatherResponse> weatherResponseLiveData;

    public WeatherViewModel() {
        repository = new Repository();
    }

    public LiveData<WeatherResponse> getWeather(String city) {
            weatherResponseLiveData = repository.getWeather(city);

        return weatherResponseLiveData;
    }
}
