package com.example.practiceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {
Button bt1;
TextView tv1;

EditText et1;
EditText et2;
    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        bt1=findViewById(R.id.login_Button);
        et1=findViewById(R.id.userName_Input);
        et2=findViewById(R.id.username_password);
        tv1=findViewById(R.id.textView);
        bt1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                    if((!et1.toString().isEmpty() && !et2.toString().isEmpty())) {
                        if (et1.getText().toString().equals("ManishYadav") && et2.getText().toString().equals("12345")) {
                            Log.i("Credentials", " You have entered right password");
                            Toast.makeText(MainActivity.this, "LogIn Successful", Toast.LENGTH_LONG).show();
                        } else {
                            Log.i("Credentials", "Please enter correct Password ");
                            Toast.makeText(MainActivity.this, "Enter Correct Password", Toast.LENGTH_LONG).show();
                        }
                    }

                    else {
                        Toast.makeText(MainActivity.this, "Can't leave the space empty", Toast.LENGTH_LONG).show();
                    }
            }
        });
    }
}