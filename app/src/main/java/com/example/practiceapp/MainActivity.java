package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
Button bt1;
TextView tv;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.b1);
        tv=findViewById(R.id.textView);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
               if(tv.getText().equals("Hello World")){
                   tv.setText("Manish");
               }
               else{
                   tv.setText("Hello World");
               }
            }
        });
    }
}