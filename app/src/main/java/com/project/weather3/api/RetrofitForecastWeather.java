package com.project.weather3.api;

import static com.project.weather3.utils.Utils.BASE_URL;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

public class RetrofitForecastWeather {
    private static ApiForecastWeather apiForecastWeather;
    public static ApiForecastWeather getApiForecastWeather(){
        if (apiForecastWeather==null){
            Retrofit retrofit=new Retrofit.Builder()
                    .baseUrl(BASE_URL)
                    .addConverterFactory(GsonConverterFactory.create())
                    .build();
                    apiForecastWeather=retrofit.create(ApiForecastWeather.class);
        }
        return apiForecastWeather;
    }
}
