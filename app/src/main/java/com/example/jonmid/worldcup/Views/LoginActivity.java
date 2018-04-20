package com.example.jonmid.worldcup.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

import com.example.jonmid.worldcup.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }

    public void showHome(View view){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }

    public void showRegister(View view){
        Intent intent = new Intent(this, CreateAccountActivity.class);
        startActivity(intent);
    }


}
