package com.example.widgets;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private Button facebookButton;
    private Button googleButton;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        Log.d("==>", "onCreate ran successfully");
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebookButton = findViewById(R.id.facebook_button);
        facebookButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "facebookButton pressed.");
            }
        });

        googleButton = findViewById(R.id.google_button);
        googleButton.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Log.d("==>", "googleButton pressed.");
            }
        });
    }
}
