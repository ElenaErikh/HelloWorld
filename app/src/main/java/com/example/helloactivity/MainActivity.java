package com.example.helloactivity;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        TextView greeting = findViewById(R.id.greeting);

        String hello = getResources().getString(R.string.hello);
        hello += "!!";
        greeting.setText(hello);
















    }
}