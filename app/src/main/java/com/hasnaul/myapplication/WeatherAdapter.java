package com.hasnaul.myapplication;

import android.content.Context;
import android.support.annotation.NonNull;
import android.support.v7.widget.RecyclerView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import com.hasnaul.myapplication.Weather.WeatherResult;
import com.squareup.picasso.Picasso;

public class WeatherAdapter extends RecyclerView.Adapter<WeatherAdapter.ViewHolder> {


    Context context;
    WeatherResult weatherResult;


    public WeatherAdapter(Context context, WeatherResult weatherResult) {
        this.context = context;
        this.weatherResult = weatherResult;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup viewGroup, int i) {

        View itemView = LayoutInflater.from(context).inflate(R.layout.weither_items,viewGroup,false);
        return  new ViewHolder(itemView);
    }

    @Override
