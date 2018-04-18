package com.example.jonmid.worldcup.Views;

import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

import com.example.jonmid.worldcup.R;
import com.example.jonmid.worldcup.Utilities.BottomNavigationViewHelper;

public class HomeActivity extends AppCompatActivity {

    BottomNavigationView bottomNavigationView;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);

        bottomNavigationView = (BottomNavigationView) findViewById(R.id.id_bnv_index);
        BottomNavigationViewHelper.removeShiftMode(bottomNavigationView);
    }
}
