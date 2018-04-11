package com.example.vitek.weather;


import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.widget.TextView;

import com.example.lib.WeatherClass;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView cityname = (TextView)findViewById(R.id.CityName);

        WeatherClass weather = new WeatherClass();
//        weather.setCity_name("My city name");

        cityname.setText(weather.getCity_name());

    }


}
