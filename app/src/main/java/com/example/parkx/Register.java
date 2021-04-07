package com.example.parkx;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class Register extends AppCompatActivity implements View.OnClickListener {

    EditText reg_username, reg_password, reg_confirmPass, reg_ID;
    Button reg_confirmBtn;
    String username, password, confirmPass;
    int id = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);

        reg_username = findViewById(R.id.reg_username);
        reg_password = findViewById(R.id.reg_password);
        reg_confirmPass = findViewById(R.id.reg_confirmPass);
        reg_ID = findViewById(R.id.reg_ID);

        reg_confirmBtn = findViewById(R.id.reg_confirmBtn);
        reg_confirmBtn.setOnClickListener(this);
    }

    @Override
    public void onClick(View view) {

        Intent login = new Intent(this, LogIn.class);

        username = reg_username.getText().toString();
        password = reg_password.getText().toString();
        confirmPass = reg_confirmPass.getText().toString();

        if (reg_ID.getText().toString().equals("")) {
            id = 0;
        }
        else {
            id = Integer.parseInt(reg_ID.getText().toString());
        }

        switch (view.getId()) {
            case R.id.reg_confirmBtn:
                if (!password.equals(confirmPass)) {
                    Toast.makeText(this, "Password does not match", Toast.LENGTH_SHORT).show();
                }
                else if (username.trim().isEmpty()) {
                    // does nothing
                }
                else if (id == 0) {
                    Toast.makeText(this, "ID must not be empty", Toast.LENGTH_SHORT).show();
                }
                else {
                    Toast.makeText(this, "Account has been registered", Toast.LENGTH_LONG).show();
                    startActivity(login);
                }
                break;
        }

    }
}