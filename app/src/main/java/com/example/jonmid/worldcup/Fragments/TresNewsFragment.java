package com.example.jonmid.worldcup.Fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.jonmid.worldcup.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class TresNewsFragment extends Fragment {


    public TresNewsFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_tres_news, container, false);
    }

}
