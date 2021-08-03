package com.mobikasa.weatherapp.Adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.core.content.ContextCompat;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.mobikasa.weatherapp.Model.WeatherResponse;
import com.mobikasa.weatherapp.R;
import com.mobikasa.weatherapp.Utils.Constants;

import java.util.List;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.MyViewHolder> {

    Context mcontext;
    List<WeatherResponse.Daily> dailylist;


    public WeatherAdapter(Context mcontext, List<WeatherResponse.Daily> profileList) {

        this.mcontext = mcontext;
        this.dailylist = profileList;

    }

    @NonNull
    @Override
    public MyViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext())
                .inflate(R.layout.card_item, parent, false);

        MyViewHolder myViewHolder = new MyViewHolder(view);
        return myViewHolder;
    }

    @Override
    public void onBindViewHolder(@NonNull MyViewHolder holder, int position) {

        WeatherResponse.Daily bean = dailylist.get(position);
        holder.desc.setText(""+bean.getWeather().get(0).getDescription());
        holder.temp.setText(""+Constants.getday(""+bean.getDt()));

//        Glide.with(mcontext)
//                .load(bean.getProfile_pic_url_hd())
//                .placeholder(R.drawable.progress_animation)
//                // .error(R.drawable.ic_arrow_back_24_px)
//                .into(holder.profile_image);
//

    }

    @Override
    public int getItemCount() {
        return dailylist.size();
    }




    public class MyViewHolder extends RecyclerView.ViewHolder {

        TextView desc,temp;
        public MyViewHolder(@NonNull View itemView) {
            super(itemView);

            desc = itemView.findViewById(R.id.desc);
            temp = itemView.findViewById(R.id.temp);


        }
    }
}