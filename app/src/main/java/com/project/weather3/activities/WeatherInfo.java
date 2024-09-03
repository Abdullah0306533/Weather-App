package com.project.weather3.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.project.weather3.R;
import com.project.weather3.databinding.ActivityWeatherInfoBinding;
import com.project.weather3.model.currentweathermodel.CurrentWeatherResponse;
import com.project.weather3.model.forecastweathermodel.WeatherForecastResponse;
import com.project.weather3.viewmodel.WeatherViewModel;

public class WeatherInfo extends AppCompatActivity {

    private WeatherViewModel weatherViewModel;
    private ActivityWeatherInfoBinding binding;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);

        // Initializing bindings
        binding = ActivityWeatherInfoBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        // Handle window insets for edge-to-edge display
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });

        // Set visibility
        EditText dayET = binding.dayET;
        dayET.setVisibility(View.GONE);
        TextView dayTextView = binding.textView;
        dayTextView.setOnClickListener(view -> dayET.setVisibility(View.VISIBLE));

        // Initialize ViewModel
        weatherViewModel = new ViewModelProvider(this).get(WeatherViewModel.class);

        // Check weather button click listener
        binding.checkWeather.setOnClickListener(view -> {
            String cityName = binding.cityNameEdit.getText().toString();
            if (cityName.isEmpty()) {
                Toast.makeText(WeatherInfo.this, "Please enter a city name or wrong city name", Toast.LENGTH_SHORT).show();
                return;
            }

            String days = dayET.getText().toString();
            if (!days.isEmpty()) {
                weatherViewModel.getForeCastWeather(cityName, Integer.parseInt(days))
                        .observe(WeatherInfo.this, new Observer<WeatherForecastResponse>() {
                            @Override
                            public void onChanged(WeatherForecastResponse weatherForecastResponse) {
                                if (weatherForecastResponse != null) {
                                    binding.cloudTextView.setText("Cloud Cover (%) : " + weatherForecastResponse.getCurrent().getCloud().toString());
                                    binding.humidityTextView.setText("Humidity (%) : " + weatherForecastResponse.getCurrent().getHumidity().toString());
                                    binding.windMphTextView.setText("Wind Speed (mph) : " + weatherForecastResponse.getCurrent().getWindMph().toString());
                                    binding.tempCTextView.setText("Temperature (°C) : " + weatherForecastResponse.getCurrent().getTempC().toString());

                                    // Update UI with location data
                                    binding.locationNameTextView.setText("Location Name : " + weatherForecastResponse.getLocation().getName());
                                    binding.regionTextView.setText("Region : " + weatherForecastResponse.getLocation().getRegion());
                                    binding.countryTextView.setText("Country : " + weatherForecastResponse.getLocation().getCountry());
                                    binding.latitudeTextView.setText("Latitude : " + weatherForecastResponse.getLocation().getLat().toString());
                                    binding.longitudeTextView.setText("Longitude : " + weatherForecastResponse.getLocation().getLon().toString());
                                    binding.tzIdTextView.setText("Time Zone ID : " + weatherForecastResponse.getLocation().getTzId());
                                    binding.localtimeTextView.setText("Local Date & Time : " + weatherForecastResponse.getLocation().getLocaltime());

                                } else {
                                    Toast.makeText(WeatherInfo.this, "Failed to load forecast data", Toast.LENGTH_SHORT).show();
                                }
                            }
                        });
            }

            weatherViewModel.getCurrentWeather(cityName).observe(WeatherInfo.this, new Observer<CurrentWeatherResponse>() {
                @Override
                public void onChanged(CurrentWeatherResponse weatherResponse) {
                    if (weatherResponse != null) {
                        // Update UI with current weather data
                        binding.cloudTextView.setText("Cloud Cover (%) : " + weatherResponse.getCurrent().getCloud().toString());
                        binding.humidityTextView.setText("Humidity (%) : " + weatherResponse.getCurrent().getHumidity().toString());
                        binding.windMphTextView.setText("Wind Speed (mph) : " + weatherResponse.getCurrent().getWindMph().toString());
                        binding.tempCTextView.setText("Temperature (°C) : " + weatherResponse.getCurrent().getTempC().toString());

                        // Update UI with location data
                        binding.locationNameTextView.setText("Location Name : " + weatherResponse.getLocation().getName());
                        binding.regionTextView.setText("Region : " + weatherResponse.getLocation().getRegion());
                        binding.countryTextView.setText("Country : " + weatherResponse.getLocation().getCountry());
                        binding.latitudeTextView.setText("Latitude : " + weatherResponse.getLocation().getLat().toString());
                        binding.longitudeTextView.setText("Longitude : " + weatherResponse.getLocation().getLon().toString());
                        binding.tzIdTextView.setText("Time Zone ID : " + weatherResponse.getLocation().getTzId());
                        binding.localtimeTextView.setText("Local Date & Time : " + weatherResponse.getLocation().getLocaltime());
                    } else {
                        // Handle error or no data
                        Toast.makeText(WeatherInfo.this, "Failed to load weather data", Toast.LENGTH_SHORT).show();
                    }
                }
            });
        });
    }
}
