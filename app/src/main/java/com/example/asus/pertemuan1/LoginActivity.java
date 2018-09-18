package com.example.asus.pertemuan1;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.Toast;

public class LoginActivity extends AppCompatActivity {
    Button login_id;
    EditText email, pass;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        login_id = findViewById(R.id.login);
        email = findViewById(R.id.email);
        pass = findViewById(R.id.pass);
    }

    public void login(View view) {
        if (email.getText().toString().length() == 0)
            Toast.makeText(this, "Email dan password diperlukan!", Toast.LENGTH_SHORT).show();
        if (pass.getText().toString().length() == 0)
            Toast.makeText(this, "password diperlukan!", Toast.LENGTH_SHORT).show();
        else {
            Toast.makeText(this, "login berhasil!", Toast.LENGTH_SHORT).show();


        }
    }
}