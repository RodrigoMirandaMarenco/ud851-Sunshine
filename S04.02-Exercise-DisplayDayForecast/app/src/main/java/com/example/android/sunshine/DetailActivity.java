package com.example.android.sunshine;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.TextView;

public class DetailActivity extends AppCompatActivity {

    public static final String FORECAST_SHARE_HASHTAG = " #SunshineApp";

    private TextView mWeatherForecastTextView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_detail);
        mWeatherForecastTextView = (TextView) findViewById(R.id.tv_weather_forecast);

        // COMPLETE (2) Display the weather forecast that was passed from MainActivity
        if (getIntent().hasExtra(FORECAST_SHARE_HASHTAG)) {
            String weatherForecast = getIntent().getExtras().getString(FORECAST_SHARE_HASHTAG);
            mWeatherForecastTextView.setText(weatherForecast);
        }
    }
}