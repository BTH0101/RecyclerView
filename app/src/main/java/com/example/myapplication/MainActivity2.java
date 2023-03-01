package com.example.myapplication;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity2 extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main2);
        Intent intent= getIntent();
        ImageView imageView =findViewById(R.id.imageView);
        imageView.setImageResource(intent.getIntExtra("1",0));

        (    (TextView) findViewById(R.id.textView1)).setText(intent.getStringExtra("2"));
        (    (TextView) findViewById(R.id.textView2)).setText(intent.getStringExtra("3"));

    }
}