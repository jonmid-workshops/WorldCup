package com.example.jonmid.worldcup.Fragments;


import android.content.Intent;
import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.support.v7.widget.CardView;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Toast;

import com.example.jonmid.worldcup.R;
import com.example.jonmid.worldcup.Views.StadiumUnoActivity;

/**
 * A simple {@link Fragment} subclass.
 */
public class StadiumFragment extends Fragment {




    public StadiumFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container, Bundle savedInstanceState) {
        final View view = inflater.inflate(R.layout.fragment_stadium, container, false);

        CardView cardViewNewsUno = (CardView) view.findViewById(R.id.id_cv_news_uno);
        cardViewNewsUno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(view.getContext(), StadiumUnoActivity.class);
                startActivity(intent);
            }
        });

        return view;

        // Inflate the layout for this fragment
        //return inflater.inflate(R.layout.fragment_stadium, container, false);
    }

}
