package com.project.weather3.api;


import com.project.weather3.utils.Utils;

import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;


public class ApiClient {

    // Singleton instance of the ApiInterface
    static ApiInterface apiInterface;

    // Method to get the singleton instance of ApiInterface
    public static ApiInterface getApiInterface() {
        if (apiInterface == null) {
            // Build Retrofit instance
            Retrofit retrofit = new Retrofit.Builder()
                    .baseUrl(Utils.BASE_URL) // Set the base URL for the API
                    .addConverterFactory(GsonConverterFactory.create()) // Convert JSON responses to Java objects
                    .build();

            // Create ApiInterface instance
            apiInterface = retrofit.create(ApiInterface.class);
        }
        return apiInterface;
    }
}
