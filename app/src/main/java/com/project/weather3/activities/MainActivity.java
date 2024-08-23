package com.project.weather3.activities;

import static androidx.databinding.DataBindingUtil.setContentView;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;

import com.project.weather3.R;
import com.project.weather3.adapters.MainActivityAdapter;
import com.project.weather3.databinding.ActivityMainBinding;
import com.project.weather3.model.dataforrecyclerview.AdaptersDataSource;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        ActivityMainBinding binding = ActivityMainBinding.inflate(getLayoutInflater());
        setContentView(binding.getRoot());

        List<AdaptersDataSource> list = new ArrayList<>();
        list.add(new AdaptersDataSource(R.drawable.background_clouds, "Check Weather"));
       // list.add(new AdaptersDataSource(R.drawable.background_clouds, "More Weather"));

        MainActivityAdapter adapter = new MainActivityAdapter(this, list); // Pass the context
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(adapter);
    }
}
