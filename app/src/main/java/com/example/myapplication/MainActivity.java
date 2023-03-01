package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.ExpandableListView;
import android.widget.ImageView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class MainActivity extends AppCompatActivity {

    Intent intent;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        intent= new Intent(this,MainActivity2.class);

        List<item> itemList= new ArrayList<>();
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));
//        itemList.add(new item((new Random()).toString(),"b", R.drawable.a));

        for (int i = 0; i < 1000; i++) {
            itemList.add(new item((new Random()).toString(),(new Random()).toString(), R.drawable.a));
        }
        RecyclerView recyclerView = findViewById(R.id.recyclerview);
        recyclerView.addOnItemTouchListener(
                new RecyclerItemClickListener(this, recyclerView ,new RecyclerItemClickListener.OnItemClickListener() {
                    @Override public void onItemClick(View view, int position) {
                        // do whatever
                        Toast.makeText(getApplicationContext(), "clicked on " + position , Toast.LENGTH_SHORT).show();

                        intent.putExtra("1",itemList.get(position).getImage());
                        intent.putExtra("2",itemList.get(position).getName());
                        intent.putExtra("3",itemList.get(position).getDesc());
startActivity(intent);
                    }

                    @Override public void onLongItemClick(View view, int position) {
                        // do whatever
                    }
                })
        );
            recyclerView.setLayoutManager(new LinearLayoutManager(this));
            recyclerView.setAdapter(new itemAdapter(getApplicationContext(),itemList));
        int a= 5;

    }

}

