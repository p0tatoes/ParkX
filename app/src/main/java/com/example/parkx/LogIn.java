package com.example.parkx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

public class LogIn extends AppCompatActivity implements View.OnClickListener {

    EditText username_txt, password_txt;
    Button signup, login;

    String username, password;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        username_txt = findViewById(R.id.user_name);
        password_txt = findViewById(R.id.user_password);


        signup = findViewById(R.id.signup_btn);
        signup.setOnClickListener(this);


        login = findViewById(R.id.login_btn);
        login.setOnClickListener(this);
    }

    @Override
    public void onClick (View v) {

        Intent next = new Intent(this, ParkingMap.class);
        Intent register = new Intent(this, Register.class);

        username = username_txt.getText().toString();
        password = password_txt.getText().toString();

        switch (v.getId()) {
            case R.id.login_btn:
                if (username.trim().isEmpty() || password.trim().isEmpty()) {
                    // does nothing
                }
                else {
                    next.putExtra("USER_NAME", username);
                    startActivity(next);
                }
                break;
            case R.id.signup_btn:
                startActivity(register);
                break;
        }
    }
}