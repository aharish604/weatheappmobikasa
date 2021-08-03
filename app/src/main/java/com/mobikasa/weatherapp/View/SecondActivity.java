package com.mobikasa.weatherapp.View;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;

import com.mobikasa.weatherapp.Adapter.WeatherAdapter;
import com.mobikasa.weatherapp.Model.WeatherResponse;
import com.mobikasa.weatherapp.R;

import java.util.List;

public class SecondActivity extends AppCompatActivity {


    RecyclerView recyclerView;
    WeatherAdapter adapter=null;
    WeatherResponse weatherResponse = new WeatherResponse();



    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        Intent intent = getIntent();
        if (intent != null) {
            if (intent.getSerializableExtra("uidata") != null) {
                weatherResponse = (WeatherResponse) intent.getSerializableExtra("uidata");
            }
        }
        recyclerView = findViewById(R.id.rv);
        if(weatherResponse.getDaily().size()!=0) {
            recyclerView.setLayoutManager(new LinearLayoutManager(SecondActivity.this));
            adapter = new WeatherAdapter(SecondActivity.this, weatherResponse.getDaily());
            recyclerView.setAdapter(adapter);
        }

    }
}