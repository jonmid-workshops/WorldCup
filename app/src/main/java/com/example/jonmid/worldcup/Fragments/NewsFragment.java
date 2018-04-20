package com.example.jonmid.worldcup.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v4.app.FragmentManager;
import android.support.v4.app.FragmentPagerAdapter;
import android.support.v4.app.FragmentStatePagerAdapter;
import android.support.v4.view.PagerAdapter;
import android.support.v4.view.ViewPager;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jonmid.worldcup.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class NewsFragment extends Fragment {

    ViewPager viewPager;
    PagerAdapter mPagerAdapter;

    private static final String TAG = "MyActivity";

    public NewsFragment() {
        // Required empty public constructor
    }

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_news, container, false);
        viewPager = (ViewPager) view.findViewById(R.id.id_vp_cardview);
        mPagerAdapter = new ViewPagerAdapter(getFragmentManager(), 3);
        viewPager.setAdapter(mPagerAdapter);

        return view;
    }

    class ViewPagerAdapter extends FragmentStatePagerAdapter {
        int pageCount = 0;

        ViewPagerAdapter(FragmentManager manager, int _pageCount) {
            super(manager);
            pageCount = _pageCount;

            getItem(pageCount);
        }

        @Override
        public Fragment getItem(int position) {
            switch (position){
                case 0:
                    return new UnoNewsFragment();
                case 1:
                    return new DosNewsFragment();
                case 2:
                    return new TresNewsFragment();
                default:
                    return new UnoNewsFragment();
            }
        }

        @Override
        public int getCount() {
            return pageCount;
        }

    }

}
