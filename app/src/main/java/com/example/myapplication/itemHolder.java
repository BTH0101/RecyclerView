package com.example.myapplication;

import android.view.View;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

public class itemHolder extends RecyclerView.ViewHolder {
   ImageView imageView;
   TextView name,desc;


    public itemHolder(@NonNull View itemView) {
        super(itemView);
        imageView= itemView.findViewById(R.id.image);
        name= itemView.findViewById(R.id.name);
        desc= itemView.findViewById(R.id.desc);


    }
}
