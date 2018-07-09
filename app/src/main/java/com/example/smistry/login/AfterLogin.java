package com.example.smistry.login;

import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.Toast;

import static com.example.smistry.login.LoginActivity.USERNAME;

public class AfterLogin extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_after_login);

        Toast.makeText(getApplicationContext(), "Hello "+ getIntent().getStringExtra(USERNAME) , Toast.LENGTH_SHORT).show();

    }


}
