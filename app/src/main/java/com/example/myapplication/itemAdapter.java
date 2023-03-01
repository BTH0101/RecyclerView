package com.example.myapplication;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.RelativeLayout;
import android.widget.Toast;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import java.util.List;

public class itemAdapter extends RecyclerView.Adapter<itemHolder> {
    Context context;
    List<item> itemList;

    public itemAdapter(Context applicationContext, List<item> itemList) {
        this.context= applicationContext;
        this.itemList= itemList;
    }


    @NonNull
    @Override
    public itemHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        return new itemHolder(LayoutInflater.from(context).inflate(R.layout.item, parent,false));
    }

    @Override
    public void onBindViewHolder(@NonNull itemHolder holder, int position) {
        holder.name.setText(itemList.get(position).getName());
        holder.desc.setText(itemList.get(position).getDesc());
        holder.imageView.setImageResource(itemList.get(position).getImage());



    }

    @Override
    public int getItemCount() {
        return itemList.size();
    }
}
