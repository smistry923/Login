package com.example.smistry.login;

import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.EditText;

public class LoginActivity extends AppCompatActivity {
   // public static final int LOGIN_CODE=20;
    public static final String USERNAME="username";


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void login (View v){
        //Toast.makeText(getApplicationContext(), "Log in successful!", Toast.LENGTH_SHORT).show();

        Intent i = new Intent(LoginActivity.this, AfterLogin.class);
        EditText user= (EditText) findViewById(R.id.username);
        //send information
        i.putExtra(USERNAME, user.getText().toString());
        startActivity(i);
    }
}
