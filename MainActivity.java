package com.example.clickerrrrr;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
    int count = 0;
    int kill = 1;
    Button but_apple;
    TextView text_apple;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        but_apple = (Button)findViewById(R.id.but_apple);
        text_apple = (TextView)findViewById(R.id.tyt);
        kill();
    }
    void kill(){
        but_apple.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                count += kill;
                text_apple.setText(count + "");
            }
        });

    }


    
}

