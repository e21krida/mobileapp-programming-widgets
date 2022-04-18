package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("==>", "onCreate ran successfully");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}
