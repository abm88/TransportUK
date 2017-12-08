package com.example.abdulbasith.transportuk.fragments;


import android.annotation.SuppressLint;
import android.os.Bundle;
import android.support.annotation.Nullable;
import android.support.v4.app.Fragment;
import android.util.Log;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import com.example.abdulbasith.transportuk.R;
import com.example.abdulbasith.transportuk.data.network.AppDataManager;
import com.example.abdulbasith.transportuk.data.network.model.busStopModels.AtcoCodeBusStopModel;
import com.example.abdulbasith.transportuk.ui.atcoCodeBusStop.AtcoCodeBusStopDataPresenter;
import com.example.abdulbasith.transportuk.ui.atcoCodeBusStop.IAtcoCodeBusStopDataMVPView;
import com.example.abdulbasith.transportuk.ui.util.rx.AppSchedulerProvider;

import java.util.List;

import io.reactivex.disposables.CompositeDisposable;

/**
 * A simple {@link Fragment} subclass.
 */
public class AtcodeBusStopFragment extends Fragment implements IAtcoCodeBusStopDataMVPView{

    List<AtcoCodeBusStopModel> atcoCodeBusStopModel;
    TextView textView;





    public AtcodeBusStopFragment() {
        // Required empty public constructor
    }

    AtcoCodeBusStopDataPresenter<IAtcoCodeBusStopDataMVPView> atcoCodeBusStopDataMVPViewAtcoCodeBusStopDataPresenter;

    @Override
    public View onCreateView(LayoutInflater inflater, ViewGroup container,
                             Bundle savedInstanceState) {
        // Inflate the layout for this fragment
        return inflater.inflate(R.layout.fragment_atcode_bus_stop, container, false);
    }

    @Override
    public void onViewCreated(View view, @Nullable Bundle savedInstanceState) {
        atcoCodeBusStopDataMVPViewAtcoCodeBusStopDataPresenter = new AtcoCodeBusStopDataPresenter<>(
                new AppDataManager(),
                new AppSchedulerProvider(),
                new CompositeDisposable());

        atcoCodeBusStopDataMVPViewAtcoCodeBusStopDataPresenter.onAttach(this);
        atcoCodeBusStopDataMVPViewAtcoCodeBusStopDataPresenter.onViewPrepared();



        super.onViewCreated(view, savedInstanceState);
    }

    @SuppressLint("LongLogTag")
    @Override
    public void onFetchDataCompleted(AtcoCodeBusStopModel atcoCodeBusStopModel) {
         textView = (TextView)getActivity().findViewById(R.id.textView);

         textView.setText(atcoCodeBusStopModel.getLocality());
         Log.i("Data ----> ", atcoCodeBusStopModel.getLocality().toString());
        for (int i=0; i<atcoCodeBusStopModel.getDepartures().getAll().size(); i++) {
            Log.i("this is AtcoCodeBusStop data ---> ", atcoCodeBusStopModel.getDepartures().getAll().get(i).getId().toString());
        }


    }

    @Override
    public void showLoading() {

    }

    @Override
    public void hideLoading() {

    }

    @SuppressLint("LongLogTag")
    @Override
    public void onError(String message) {
        Log.i("On error AtcoCodeBusStop --->", message);

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public boolean isNetworkConnected() {
        return false;
    }
}
