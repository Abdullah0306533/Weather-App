package com.project.weather3.activities;

import android.os.Bundle;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.weather3.R;
import com.project.weather3.adapters.WeatherForeCastAdapter;
import com.project.weather3.databinding.ActivityWeatherForeCastBinding;
import com.project.weather3.model.dataforrecyclerview.AdaptersDataSource;

import java.util.ArrayList;
import java.util.List;

public class WeatherForeCast extends AppCompatActivity {

    List<AdaptersDataSource> dataSources;
    ActivityWeatherForeCastBinding binding;
    WeatherForeCastAdapter adapter;
    RecyclerView recyclerView;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_weather_fore_cast);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.recyclerView2), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
//        dataSources=new ArrayList<>();
//        AdaptersDataSource adaptersDataSource=new AdaptersDataSource(R.drawable.back2,"Weather");
//        dataSources.add(adaptersDataSource);
//
//        adapter=new WeatherForeCastAdapter(dataSources,this);
//
//        binding=ActivityWeatherForeCastBinding.inflate(getLayoutInflater());
//        setContentView(binding.getRoot());
//
//        binding.recyclerView2.setLayoutManager(new LinearLayoutManager(this));
//        binding.recyclerView2.setAdapter(adapter);


    }
}