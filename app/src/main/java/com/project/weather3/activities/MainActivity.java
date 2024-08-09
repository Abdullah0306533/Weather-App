package com.project.weather3.activities;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import com.project.weather3.R;
import com.project.weather3.adapters.MainActivityAdapter;
import com.project.weather3.databinding.ActivityMainBinding;

import java.util.ArrayList;
import java.util.List;

public class MainActivity extends AppCompatActivity {
    private MainActivityAdapter activityAdapter;
    private RecyclerView recyclerView;
    private ActivityMainBinding binding;
    private final List<String > list=new ArrayList<>();


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);
        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
            return insets;
        });
        //adding text to the data source
        list.add("Weather");
        //adapter initializing
        activityAdapter=new MainActivityAdapter(list);
        binding = ActivityMainBinding.inflate(getLayoutInflater());

        // Setting the content view to the root of the binding object
        setContentView(binding.getRoot());
        // Initializing the RecyclerView
        binding.recyclerView.setLayoutManager(new LinearLayoutManager(this));
        binding.recyclerView.setAdapter(activityAdapter);

    }
    public void onClickCard(View view){
        Intent i=new Intent(MainActivity.this, WeatherInfo.class);
        startActivity(i);
    }
}