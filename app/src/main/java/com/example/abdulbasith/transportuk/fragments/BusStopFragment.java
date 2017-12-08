package com.example.abdulbasith.transportuk.fragments;


import android.os.Bundle;
import android.support.v4.app.Fragment;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;

import com.example.abdulbasith.transportuk.R;

/**
 * A simple {@link Fragment} subclass.
 */
public class BusStopFragment extends Fragment {


    public BusStopFragment() {
        // Required empty public constructor
    }


    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_bus_stop, container, false);
    }

}
