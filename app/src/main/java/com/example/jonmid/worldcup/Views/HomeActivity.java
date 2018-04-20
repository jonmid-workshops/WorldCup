package com.example.jonmid.worldcup.Views;

import android.app.FragmentTransaction;
import android.support.annotation.NonNull;
import android.support.design.widget.BottomNavigationView;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.MenuItem;

import com.example.jonmid.worldcup.Fragments.GroupsFragment;
import com.example.jonmid.worldcup.Fragments.NewsFragment;
import com.example.jonmid.worldcup.Fragments.ProfileFragment;
import com.example.jonmid.worldcup.Fragments.ResultsFragment;
import com.example.jonmid.worldcup.Fragments.StadiumFragment;
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

        bottomNavigationView.setSelectedItemId(R.id.id_menubn_news);

        bottomNavigationView.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {

                switch (item.getItemId()){
                    case R.id.id_menubn_results:
                        ResultsFragment resultsFragment = new ResultsFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_fl_index, resultsFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case R.id.id_menubn_group:
                        GroupsFragment groupsFragment = new GroupsFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_fl_index, groupsFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case R.id.id_menubn_news:
                        NewsFragment newsFragment = new NewsFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_fl_index, newsFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case R.id.id_menubn_stadium:
                        StadiumFragment stadiumFragment = new StadiumFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_fl_index, stadiumFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        break;
                    case R.id.id_menubn_profile:
                        ProfileFragment profileFragment = new ProfileFragment();
                        getSupportFragmentManager()
                                .beginTransaction()
                                .replace(R.id.id_fl_index, profileFragment)
                                .setTransition(FragmentTransaction.TRANSIT_FRAGMENT_FADE)
                                .addToBackStack(null)
                                .commit();
                        break;
                }

                return true;
            }
        });
    }
}
