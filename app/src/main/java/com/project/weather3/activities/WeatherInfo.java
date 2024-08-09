package com.project.weather3.activities;

import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.lifecycle.Observer;
import androidx.lifecycle.ViewModelProvider;

import com.project.weather3.R;
import com.project.weather3.databinding.ActivityWeatherInfoBinding;
import com.project.weather3.model.WeatherResponse;
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

        // Initializing ViewModel
        weatherViewModel = new ViewModelProvider(this).get(WeatherViewModel.class);

        binding.checkWeather.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String cityName = binding.cityNameEdit.getText().toString();
                if (cityName.isEmpty()) {
                    Toast.makeText(WeatherInfo.this, "Please enter a city name", Toast.LENGTH_SHORT).show();
                    return;
                }

                weatherViewModel.getWeather(cityName).observe(WeatherInfo.this, new Observer<WeatherResponse>() {
                    @Override
                    public void onChanged(WeatherResponse weatherResponse) {
                        if (weatherResponse != null) {
                            // Update the UI with weather data
                            binding.cloudTextView.setText("Cloud Cover (%) : " + weatherResponse.getCurrent().getCloud().toString());
                            binding.humidityTextView.setText("Humidity (%) : " + weatherResponse.getCurrent().getHumidity().toString());
                            binding.windMphTextView.setText("Wind Speed (mph) : " + weatherResponse.getCurrent().getWindMph().toString());
                            binding.tempCTextView.setText("Temperature (°C) : " + weatherResponse.getCurrent().getTempC().toString());

                            // Update the UI with location data
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
            }
        });
    }
}
