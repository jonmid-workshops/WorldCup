package com.example.jonmid.worldcup.Views;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.Toolbar;

import com.example.jonmid.worldcup.R;

public class CreateAccountActivity extends AppCompatActivity {

    Toolbar toolbar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_create_account);

        toolbar = (Toolbar) findViewById(R.id.id_tb_toolbarindex);

        toolbar.setTitle(R.string.str_toolbar_account);
    }
}
