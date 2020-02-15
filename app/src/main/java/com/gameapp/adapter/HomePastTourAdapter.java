package com.gameapp.adapter;

import android.content.Context;
import android.content.Intent;
import android.text.Layout;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.gameapp.R;
import com.gameapp.activity.TourDetailActivity;

import java.util.ArrayList;

public class HomePastTourAdapter extends RecyclerView.Adapter<HomePastTourAdapter.ViewHolder> {

    private Context context;
    private ArrayList<String> arrayList;

    public HomePastTourAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_main_category, parent, false);
        return new ViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHolder holder, int position) {
        Glide.with(context).load(arrayList.get(position)).into(holder.banner);

        holder.itemView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(context, TourDetailActivity.class);
                intent.putExtra("Name", "Squad Fury");
                context.startActivity(intent);
            }
        });
    }

    @Override
    public int getItemCount() {
        if (arrayList.size() > 4) {
            return 4;
        } else {
            return arrayList.size();
        }
    }

    public class ViewHolder extends RecyclerView.ViewHolder {
        private ImageView banner;

        public ViewHolder(@NonNull View itemView) {
            super(itemView);

            banner = itemView.findViewById(R.id.imageView7);
        }
    }
}
