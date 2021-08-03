package com.mobikasa.weatherapp.Network;

public interface APIResponse {
    void onSuccess(Object object);
    void onServerError(String error);
    void showProgress();
    void dismissProgress();
    void networkError(String error);
}
