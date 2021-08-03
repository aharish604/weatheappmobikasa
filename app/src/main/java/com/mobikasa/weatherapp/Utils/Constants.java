package com.mobikasa.weatherapp.Utils;

import android.Manifest;
import android.app.ProgressDialog;
import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.widget.Toast;

import com.mobikasa.weatherapp.R;

import java.util.ArrayList;
import java.util.Date;

public class Constants {

    public static String BASE_URL = "https://api.openweathermap.org/";
    public  static String ApiKey = "c8bfa91e3d6c7ae47771abaa83ee73b7";

    public static ArrayList<String> permissionList() {
        ArrayList<String> arrayList = new ArrayList<>();
        arrayList.add(Manifest.permission.ACCESS_FINE_LOCATION);
        arrayList.add(Manifest.permission.ACCESS_COARSE_LOCATION);

        return arrayList;
    }


    public static ProgressDialog showProgressDialog(Context mContext, String message) {
        ProgressDialog pdLoadDialog = null;
        try {
            pdLoadDialog = ProgressDialog.show(mContext, null, null, true);
            pdLoadDialog.setContentView(R.layout.elemento_progress_splash);
            pdLoadDialog.getWindow().setBackgroundDrawable(new ColorDrawable(android.graphics.Color.TRANSPARENT));
            pdLoadDialog.show();
            pdLoadDialog.setCancelable(false);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return pdLoadDialog;
    }

    public static void displayLongToast(Context mContext, String message) {

            try {
                Toast.makeText(mContext, message, Toast.LENGTH_SHORT).show();
            } catch (Exception e) {
                e.printStackTrace();
            }

    }

    public  static String  getday(String dt)
    { long batch_date = Long.parseLong(dt);
        Date date = new Date(batch_date * 1000);
        String str  = date.toString().substring(0,3);
        return str;
    }

}
