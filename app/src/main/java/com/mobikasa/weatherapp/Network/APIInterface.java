package com.mobikasa.weatherapp.Network;


import com.mobikasa.weatherapp.Model.WeatherResponse;
import com.mobikasa.weatherapp.Utils.Constants;

import retrofit2.Call;
import retrofit2.http.GET;
import retrofit2.http.Path;
import retrofit2.http.Query;

public interface APIInterface {
   // https://api.openweathermap.org/data/2.5/onecall?lat=60.99&lon=30.0&units=imperial&appid=c8bfa91e3d6c7ae47771abaa83ee73b7

    @GET("data/2.5/onecall?")
    Call<WeatherResponse> getWeatherData(@Query("lat") String lat, @Query("lon") String lon, @Query("units") String units, @Query("appid") String api);

}
