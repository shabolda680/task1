package com.example.recre;

import android.graphics.Color;
import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import android.view.View;

import androidx.constraintlayout.widget.ConstraintLayout;

import android.widget.Button;

import java.util.Random;

public class MainActivity extends AppCompatActivity {

    private ConstraintLayout layout;
    private Button button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        layout = findViewById(R.id.layout);
        button = findViewById(R.id.button_red);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color =Color.argb(255, 255,0,0);
                layout.setBackgroundColor(color);

            }
        });

        button = findViewById(R.id.button_yellow);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {

                int color =Color.argb(255, 255,255,0);
                layout.setBackgroundColor(color);

            }


        });

        button = findViewById(R.id.button_green);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                int color =Color.argb(255, 0,255,0);
                layout.setBackgroundColor(color);

            }


        });


    }}