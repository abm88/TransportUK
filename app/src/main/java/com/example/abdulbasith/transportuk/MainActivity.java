package com.example.abdulbasith.transportuk;

import android.annotation.SuppressLint;
import android.support.v4.app.FragmentManager;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.app.AppCompatDialogFragment;
import android.util.Log;

import com.example.abdulbasith.transportuk.data.component.IActivityComponent;
import com.example.abdulbasith.transportuk.data.network.AppDataManager;
import com.example.abdulbasith.transportuk.data.network.model.busStopModels.LocalBusStopModel;
import com.example.abdulbasith.transportuk.fragments.AtcodeBusStopFragment;
import com.example.abdulbasith.transportuk.ui.busStopPresenter.BustStopDataPresenter;
import com.example.abdulbasith.transportuk.ui.busStopPresenter.IBusStopDataMVPView;
import com.example.abdulbasith.transportuk.ui.util.rx.AppSchedulerProvider;


import io.reactivex.disposables.CompositeDisposable;

public class MainActivity extends AppCompatActivity implements IBusStopDataMVPView {


    IActivityComponent iActivityComponent;
    private FragmentManager fragmentManager;

    public IActivityComponent getiActivityComponent() {
        return iActivityComponent;
    }

    BustStopDataPresenter<IBusStopDataMVPView> busStopDataMVPViewBustStopDataPresenter;

    public MainActivity() {

    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.fragment_atcode_bus_stop);
        if (savedInstanceState == null) {
            fragmentManager = getSupportFragmentManager();
            fragmentManager.beginTransaction().add(R.id.container, new AtcodeBusStopFragment())
                    .addToBackStack(null)
                    .commit();
        }

        busStopDataMVPViewBustStopDataPresenter = new BustStopDataPresenter<>(
                new AppDataManager(),
                new AppSchedulerProvider(),
                new CompositeDisposable());
         busStopDataMVPViewBustStopDataPresenter.onAttach(this);
         busStopDataMVPViewBustStopDataPresenter.onViewPrepared(51.8787,0.4200);
  }


    @SuppressLint("LongLogTag")
    @Override
    public void onFetchDataCompleted(LocalBusStopModel localBusStopModel) {
        for (int i=0; i<localBusStopModel.getStops().size(); i++) {
//            Log.i("---> Close bus Stops --> ", localBusStopModel.getStops().get(i).getName().toString());
//            Log.i("---> Close bus Stops --> ", localBusStopModel.getStops().get(i).getAtcocode().toString());
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
        Log.i("this is MainActivity error -->", message);

    }

    @Override
    public void showMessage(String message) {

    }

    @Override
    public boolean isNetworkConnected() {
        return false;
    }
}
