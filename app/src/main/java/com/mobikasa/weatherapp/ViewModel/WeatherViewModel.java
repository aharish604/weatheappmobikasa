package com.mobikasa.weatherapp.ViewModel;

import android.app.Activity;
import android.content.Context;

import com.mobikasa.weatherapp.Model.WeatherResponse;
import com.mobikasa.weatherapp.Network.APIInterface;
import com.mobikasa.weatherapp.Network.APIResponse;
import com.mobikasa.weatherapp.Network.ConnectionDetector;
import com.mobikasa.weatherapp.Network.RequestClient;
import com.mobikasa.weatherapp.R;
import com.mobikasa.weatherapp.Utils.Constants;

import retrofit2.Call;
import retrofit2.Callback;

public class WeatherViewModel {

    Context mcontext;
    APIResponse apiResponse;

    public WeatherViewModel(Context activity, APIResponse apiResponse) {
        this.mcontext = activity;
        this.apiResponse = apiResponse;
    }

    public void getWeatherData(String latitude, String longitude) {


        ((Activity) mcontext).runOnUiThread(new Runnable() {
                @Override
                public void run() {
                    apiResponse.showProgress();
                }
            });

        try {
                if (ConnectionDetector.isNetworkAvailable(mcontext)) {
                    Call<WeatherResponse> call = RequestClient.getClient().create(APIInterface.class).getWeatherData(latitude,longitude,"imperial",Constants.ApiKey);
                    call.enqueue(new Callback<WeatherResponse>() {
                        @Override
                        public void onResponse(Call<WeatherResponse> call, retrofit2.Response<WeatherResponse> response) {
                            try {
                                WeatherResponse responsebean = response.body();
                                System.out.println("Result:-  "+responsebean.toString());
                                    apiResponse.dismissProgress();
                                apiResponse.onSuccess(responsebean);

                            } catch (Exception e) {
                                apiResponse.dismissProgress();
                                apiResponse.onServerError(mcontext.getResources().getString(R.string.server_error));
                            }
                        }

                        @Override
                        public void onFailure(Call<WeatherResponse> call, Throwable t) {
                            call.cancel();
                            ((Activity) mcontext).runOnUiThread(new Runnable() {
                                @Override
                                public void run() {

                                    if (apiResponse != null) {
                                        apiResponse.dismissProgress();
                                    }
                                }
                            });
                            apiResponse.onServerError(mcontext.getResources().getString(R.string.server_error));
                        }
                    });
                } else {
                    apiResponse.networkError(mcontext.getResources().getString(R.string.check_network));
                }
            } catch (Exception e) {
                e.printStackTrace();
                apiResponse.onServerError(mcontext.getResources().getString(R.string.server_error));
            }





    }


}
