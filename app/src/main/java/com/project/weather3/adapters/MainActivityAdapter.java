package com.project.weather3.adapters;

import android.content.Context;
import android.content.Intent;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.project.weather3.activities.WeatherForeCast;
import com.project.weather3.activities.WeatherInfo;
import com.project.weather3.databinding.WeatherEachItemBinding;
import com.project.weather3.model.dataforrecyclerview.AdaptersDataSource;

import java.util.List;

public class MainActivityAdapter extends RecyclerView.Adapter<MainActivityAdapter.ViewHolder> {

    private final List<AdaptersDataSource> weatherDataList;
    private final Context context;

    public MainActivityAdapter(Context context, List<AdaptersDataSource> weatherDataList) {
        this.context = context;
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
        AdaptersDataSource weatherData = weatherDataList.get(position);
        holder.binding.modernTextView.setText(weatherData.getText());
        holder.binding.imageView.setImageResource(weatherData.getImageSource());

        // Set an onClickListener on the CardView
        holder.binding.getRoot().setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                switch (position){
                    case 0: {
                        Intent intent = new Intent(context, WeatherInfo.class);
                        context.startActivity(intent);
                    }
                break;
                    case 1: {
                        Intent intent = new Intent(context, WeatherForeCast.class);
                        context.startActivity(intent);
                    }
                }

            }
        });
    }

    @Override
    public int getItemCount() {
        return weatherDataList.size();
    }

    static class ViewHolder extends RecyclerView.ViewHolder {
        final WeatherEachItemBinding binding;

        public ViewHolder(@NonNull WeatherEachItemBinding binding) {
            super(binding.getRoot());
            this.binding = binding;
        }
    }
}
