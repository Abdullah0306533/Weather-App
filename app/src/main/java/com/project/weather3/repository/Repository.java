package com.project.weather3.repository;

import static com.project.weather3.utils.Utils.API_KEY;

import android.util.Log;

import androidx.lifecycle.LiveData;
import androidx.lifecycle.MutableLiveData;

import com.project.weather3.api.ApiClient;
import com.project.weather3.api.ApiInterface;
import com.project.weather3.model.WeatherResponse;

import retrofit2.Call;
import retrofit2.Callback;
import retrofit2.Response;

public class Repository {

    private static final String TAG = "Repository";
    private final ApiInterface apiInterface;

    public Repository() {
        apiInterface = ApiClient.getApiInterface();
    }

    public LiveData<WeatherResponse> getWeather(String city){
        MutableLiveData<WeatherResponse> mutableLiveData = new MutableLiveData<>();
        Call<WeatherResponse> response = apiInterface.getWeather(city, API_KEY);

        response.enqueue(new Callback<WeatherResponse>() {
            @Override
            public void onResponse(Call<WeatherResponse> call, Response<WeatherResponse> response) {
                if (response.isSuccessful() && response.body() != null) {
                    Log.d(TAG, "Fetched JSON: " + response.body().toString());
                    mutableLiveData.setValue(response.body());
                } else {
                    Log.e(TAG, "Failed to fetch JSON: " + response.errorBody().toString());
                }
            }

            @Override
            public void onFailure(Call<WeatherResponse> call, Throwable throwable) {
                Log.e(TAG, "Network request failed: " + throwable.getMessage());
            }
        });
        return mutableLiveData;
    }
}
