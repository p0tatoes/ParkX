package com.example.parkx;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;
import android.widget.Toast;

public class ParkingMap extends AppCompatActivity implements View.OnClickListener {

    TextView user_txt;
    String user;
    Button c1, c2, c3, c4, c5, c6, mtr1, mtr2, mtr3, mtr4;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_parking_map);

        user = getIntent().getStringExtra("USER_NAME");

        user_txt = findViewById(R.id.user_txt);
        user_txt.setText(user);

        c1 = findViewById(R.id.park1);
        c1.setOnClickListener(this);
        c1.setBackgroundTintList(null);

        c2 = findViewById(R.id.park2);
        c2.setOnClickListener(this);
        c2.setBackgroundTintList(null);

        c3 = findViewById(R.id.park3);
        c3.setOnClickListener(this);
        c3.setBackgroundTintList(null);

        c4 = findViewById(R.id.park4);
        c4.setOnClickListener(this);
        c4.setBackgroundTintList(null);

        c5 = findViewById(R.id.park5);
        c5.setOnClickListener(this);
        c5.setBackgroundTintList(null);

        c6 = findViewById(R.id.park6);
        c6.setOnClickListener(this);
        c6.setBackgroundTintList(null);

        mtr1 = findViewById(R.id.mtr1);
        mtr1.setOnClickListener(this);
        mtr1.setBackgroundTintList(null);

        mtr2 = findViewById(R.id.mtr2);
        mtr2.setOnClickListener(this);
        mtr2.setBackgroundTintList(null);

        mtr3 = findViewById(R.id.mtr3);
        mtr3.setOnClickListener(this);
        mtr3.setBackgroundTintList(null);

        mtr4 = findViewById(R.id.mtr4);
        mtr4.setOnClickListener(this);
        mtr4.setBackgroundTintList(null);

    }

    @Override
    public void onClick(View view) {
        switch (view.getId()) {
            case R.id.park1:
                c1.setBackground(getDrawable(R.drawable.car));
                Toast.makeText(this, "You have reserved in slot C-1", Toast.LENGTH_LONG).show();
                c2.setEnabled(false);
                c3.setEnabled(false);
                c4.setEnabled(false);
                c5.setEnabled(false);
                c6.setEnabled(false);
                mtr1.setEnabled(false);
                mtr2.setEnabled(false);
                mtr3.setEnabled(false);
                mtr4.setEnabled(false);
                break;
            case R.id.park2:
                c2.setBackground(getDrawable(R.drawable.car));
                Toast.makeText(this, "You have reserved in slot C-2", Toast.LENGTH_LONG).show();
                c1.setEnabled(false);
                c3.setEnabled(false);
                c4.setEnabled(false);
                c5.setEnabled(false);
                c6.setEnabled(false);
                mtr1.setEnabled(false);
                mtr2.setEnabled(false);
                mtr3.setEnabled(false);
                mtr4.setEnabled(false);
                break;
            case R.id.park3:
                c3.setBackground(getDrawable(R.drawable.car));
                Toast.makeText(this, "You have reserved in slot C-3", Toast.LENGTH_LONG).show();
                c1.setEnabled(false);
                c2.setEnabled(false);
                c4.setEnabled(false);
                c5.setEnabled(false);
                c6.setEnabled(false);
                mtr1.setEnabled(false);
                mtr2.setEnabled(false);
                mtr3.setEnabled(false);
                mtr4.setEnabled(false);
                break;
            case R.id.park4:
                c4.setBackground(getDrawable(R.drawable.car));
                Toast.makeText(this, "You have reserved in slot C-4", Toast.LENGTH_LONG).show();
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                c5.setEnabled(false);
                c6.setEnabled(false);
                mtr1.setEnabled(false);
                mtr2.setEnabled(false);
                mtr3.setEnabled(false);
                mtr4.setEnabled(false);
                break;
            case R.id.park5:
                c5.setBackground(getDrawable(R.drawable.car));
                Toast.makeText(this, "You have reserved in slot C-5", Toast.LENGTH_LONG).show();
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                c4.setEnabled(false);
                c6.setEnabled(false);
                mtr1.setEnabled(false);
                mtr2.setEnabled(false);
                mtr3.setEnabled(false);
                mtr4.setEnabled(false);
                break;
            case R.id.park6:
                c6.setBackground(getDrawable(R.drawable.car));
                Toast.makeText(this, "You have reserved in slot C-6", Toast.LENGTH_LONG).show();
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                c4.setEnabled(false);
                c5.setEnabled(false);
                mtr1.setEnabled(false);
                mtr2.setEnabled(false);
                mtr3.setEnabled(false);
                mtr4.setEnabled(false);
                break;
            case R.id.mtr1:
                mtr1.setBackground(getDrawable(R.drawable.motor));
                Toast.makeText(this, "You have reserved in slot MTR-1", Toast.LENGTH_LONG).show();
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                c4.setEnabled(false);
                c5.setEnabled(false);
                c6.setEnabled(false);
                mtr2.setEnabled(false);
                mtr3.setEnabled(false);
                mtr4.setEnabled(false);
                break;
            case R.id.mtr2:
                mtr2.setBackground(getDrawable(R.drawable.motor));
                Toast.makeText(this, "You have reserved in slot MTR-2", Toast.LENGTH_LONG).show();
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                c4.setEnabled(false);
                c5.setEnabled(false);
                c6.setEnabled(false);
                mtr1.setEnabled(false);
                mtr3.setEnabled(false);
                mtr4.setEnabled(false);
                break;
            case R.id.mtr3:
                mtr3.setBackground(getDrawable(R.drawable.motor));
                Toast.makeText(this, "You have reserved in slot MTR-3", Toast.LENGTH_LONG).show();
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                c4.setEnabled(false);
                c5.setEnabled(false);
                c6.setEnabled(false);
                mtr1.setEnabled(false);
                mtr2.setEnabled(false);
                mtr4.setEnabled(false);
                break;
            case R.id.mtr4:
                mtr4.setBackground(getDrawable(R.drawable.motor));
                Toast.makeText(this, "You have reserved in slot MTR-4", Toast.LENGTH_LONG).show();
                c1.setEnabled(false);
                c2.setEnabled(false);
                c3.setEnabled(false);
                c4.setEnabled(false);
                c5.setEnabled(false);
                c6.setEnabled(false);
                mtr1.setEnabled(false);
                mtr2.setEnabled(false);
                mtr3.setEnabled(false);
                break;

        }

    }
}