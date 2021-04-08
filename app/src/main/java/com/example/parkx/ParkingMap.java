package com.example.parkx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class ParkingMap extends AppCompatActivity implements View.OnClickListener {

    TextView user_txt;
    String user;
    Button button1;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_map);

        user = getIntent().getStringExtra("USER_NAME");

        user_txt = findViewById(R.id.user_txt);
        user_txt.setText(user);

        button1 = findViewById(R.id.park1);
        button1.setOnClickListener(this);


    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.park1:
                button1.setEnabled(false);
                break;
        }

    }
}