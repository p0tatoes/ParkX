package com.example.parkx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.widget.TextView;

public class ParkingMap extends AppCompatActivity {

    TextView user_txt;
    String user;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_map);

        user = getIntent().getStringExtra("USER_NAME");

        user_txt = findViewById(R.id.user_txt);
        user_txt.setText(user);
    }
}