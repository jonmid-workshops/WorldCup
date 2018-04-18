package com.example.jonmid.worldcup.Views;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jonmid.worldcup.R;

public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);

        showHome();
    }

    public void showHome(){
        Intent intent = new Intent(this, HomeActivity.class);
        startActivity(intent);
    }
}
