package com.project.weather3.adapters;

import android.view.LayoutInflater;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.weather3.databinding.WeatherEachItemBinding;

import java.util.List;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.ViewHolder> {

    private final List<String> weatherDataList; // Assuming you are passing a list of weather data

    public MainActivityAdapter(List<String> weatherDataList) {
        this.weatherDataList = weatherDataList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        WeatherEachItemBinding binding = WeatherEachItemBinding.inflate(LayoutInflater.from(parent.getContext()), parent, false);
        return new ViewHolder(binding);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        // Bind data to the views
        String weatherData = weatherDataList.get(position);
        holder.binding.modernTextView.setText(weatherData); // Example of setting text
        // You can set other data as needed
    }

    @Override
    public int getItemCount() {
        return weatherDataList.size(); // Return the size of your data list
    }

    class ViewHolder extends RecyclerView.ViewHolder {
        WeatherEachItemBinding binding;

        public ViewHolder(@NonNull WeatherEachItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
