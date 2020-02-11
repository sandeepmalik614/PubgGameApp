package com.gameapp.adapter;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.bumptech.glide.Glide;
import com.gameapp.R;

import java.util.ArrayList;

public class MainTopAdapter extends RecyclerView.Adapter<MainTopAdapter.ViewHoler> {

    private Context context;
    private ArrayList<String> arrayList;

    public MainTopAdapter(Context context, ArrayList<String> arrayList) {
        this.context = context;
        this.arrayList = arrayList;
    }

    @NonNull
    @Override
    public ViewHoler onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(context).inflate(R.layout.item_home_top, parent, false);
        return new ViewHoler(view);
    }

    @Override
    public void onBindViewHolder(@NonNull ViewHoler holder, int position) {
        Glide.with(context).load(arrayList.get(position)).into(holder.banner);
    }

    @Override
    public int getItemCount() {
        return arrayList.size();
    }

    public class ViewHoler extends RecyclerView.ViewHolder {
        private ImageView banner;
        public ViewHoler(@NonNull View itemView) {
            super(itemView);
            banner = itemView.findViewById(R.id.imageView6);
        }
    }
}
