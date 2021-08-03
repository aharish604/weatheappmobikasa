package com.mobikasa.weatherapp.View;

import androidx.annotation.RequiresApi;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.content.ContextCompat;

import android.annotation.SuppressLint;
import android.app.ProgressDialog;
import android.content.Intent;
import android.location.LocationManager;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.provider.Settings;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

import com.karumi.dexter.Dexter;
import com.karumi.dexter.MultiplePermissionsReport;
import com.karumi.dexter.PermissionToken;
import com.karumi.dexter.listener.PermissionRequest;
import com.karumi.dexter.listener.multi.MultiplePermissionsListener;
import com.mobikasa.weatherapp.Location.LocationTracker;
import com.mobikasa.weatherapp.Model.WeatherResponse;
import com.mobikasa.weatherapp.Network.APIResponse;
import com.mobikasa.weatherapp.R;
import com.mobikasa.weatherapp.Utils.Constants;
import com.mobikasa.weatherapp.ViewModel.WeatherViewModel;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

public class MainActivity extends AppCompatActivity implements  APIResponse {

    ProgressDialog progressDialog=null;
    LocationManager locationManager;
    WeatherResponse weatherResponse = new WeatherResponse();
    TextView temp;
    TextView desc;
    TextView day;
    Button btn;

    WeatherViewModel viewModel = null;
    @RequiresApi(api = Build.VERSION_CODES.LOLLIPOP)
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        getSupportActionBar().hide();
        getWindow().setStatusBarColor(ContextCompat.getColor(this, R.color.colorPrimary));

        temp = findViewById(R.id.temp);
        desc = findViewById(R.id.desc);
        btn = findViewById(R.id.btn_seeweather);
        day = findViewById(R.id.day);

        requestPermission();

        btn.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
                intent.putExtra("uidata", weatherResponse);
                startActivity(intent);

            }
        });

    }



    private void requestPermission() {
        Dexter.withActivity(this).withPermissions(Constants.permissionList())
                .withListener(new MultiplePermissionsListener() {
                    @Override
                    public void onPermissionsChecked(MultiplePermissionsReport report) {
                        if (report.areAllPermissionsGranted()) {
                            getLocation();
                        }else {
                            showSettingsDialog();
                        }
                        if (report.isAnyPermissionPermanentlyDenied()) {
                            showSettingsDialog();
                        }
                    }

                    @Override
                    public void onPermissionRationaleShouldBeShown(List<PermissionRequest> permissions, PermissionToken token) {
                        token.continuePermissionRequest();
                    }
                }).withErrorListener(error -> Toast.makeText(getApplicationContext(), "Error occurred! ", Toast.LENGTH_SHORT).show())
                .onSameThread()
                .check();
    }

    @SuppressLint("MissingPermission")
    private void getLocation() {
        LocationTracker gpsTracker = new LocationTracker(MainActivity.this);
        String stringLatitude = "", stringLongitude = "", nameOfLocation="";
        if (gpsTracker.canGetLocation()) {
            viewModel = new WeatherViewModel(MainActivity.this, MainActivity.this);
            viewModel.getWeatherData(""+gpsTracker.latitude,""+gpsTracker.longitude);
        }

    }

    private void showSettingsDialog() {
        android.app.AlertDialog.Builder builder = new android.app.AlertDialog.Builder(this);
        builder.setTitle("Need Permissions");
        builder.setMessage("This app needs permission to use this feature. You can grant them in app settings.");
        builder.setPositiveButton("GOTO SETTINGS", (dialog, which) -> {
            dialog.cancel();
            openSettings();
        });
        builder.setNegativeButton("Cancel", (dialog, which) -> dialog.cancel());
        builder.show();

    }

    private void openSettings() {
        Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS);
        Uri uri = Uri.fromParts("package", getPackageName(), null);
        intent.setData(uri);
        startActivityForResult(intent, 101);
    }

    @Override
    public void onSuccess(Object object) {
         weatherResponse = (WeatherResponse) object;

        List<WeatherResponse.Daily>
        daily = weatherResponse.getDaily();

        desc.setText(""+daily.get(0).getWeather().get(0).getDescription());
        temp.setText(""+daily.get(0).getTemp().getDay());

day.setText(""+Constants.getday(""+daily.get(0).getDt()));





    }

    @Override
    public void onServerError(String error) {

        Constants.displayLongToast(MainActivity.this,error);
    }

    public void showProgress() {
        progressDialog = Constants.showProgressDialog(MainActivity.this, "");
    }

    public void dismissProgress() {
        if (progressDialog != null) {
            progressDialog.dismiss();
        }
    }

    @Override
    public void networkError(String error) {
        Constants.displayLongToast(MainActivity.this,error);

    }
}