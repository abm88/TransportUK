package com.example.abdulbasith.transportuk.data.network;

import com.example.abdulbasith.transportuk.data.network.model.busStopModels.AtcoCodeBusStopModel;
import com.example.abdulbasith.transportuk.data.network.model.busStopModels.LocalBusStopModel;

import io.reactivex.Observable;

/**
 * Created by Abdul Basith on 15/11/2017.
 */

public class AppDataManager implements IDataManager{
    IApiHelper iApiHelper;



    public AppDataManager() {

        this.iApiHelper = new AppApiHelper();
    }

    @Override
    public Observable<LocalBusStopModel> getLocalBusStop(double lat, double lon) {
        return iApiHelper.getLocalBusStop(lat,lon);
    }

    @Override
    public Observable<AtcoCodeBusStopModel> getAtCoCodeBusStop() {
        return iApiHelper.getAtCoCodeBusStop();
    }
}
