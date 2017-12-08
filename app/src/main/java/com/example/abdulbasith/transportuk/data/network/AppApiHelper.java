package com.example.abdulbasith.transportuk.data.network;

import com.example.abdulbasith.transportuk.data.network.model.busStopModels.AtcoCodeBusStopModel;
import com.example.abdulbasith.transportuk.data.network.model.busStopModels.LocalBusStopModel;
import com.example.abdulbasith.transportuk.data.network.service.ConnectionService;
import com.example.abdulbasith.transportuk.data.network.service.IRequestInterface;

import io.reactivex.Observable;

/**
 * Created by Abdul Basith on 15/11/2017.
 */

public class AppApiHelper implements IApiHelper {
    private IRequestInterface requestInterface;

    public AppApiHelper() {
        this.requestInterface = ConnectionService.getConnectionService();
    }

    @Override
    public io.reactivex.Observable<LocalBusStopModel> getLocalBusStop(double lat, double lon) {
        return requestInterface.getLocalBusStop(lat,lon,API_Constants.APP_KEY, API_Constants.API_KEY);
    }

    @Override
    public Observable<AtcoCodeBusStopModel> getAtCoCodeBusStop() {
        return requestInterface.getAtCoCodeBusStop(API_Constants.APP_KEY, API_Constants.API_KEY);
    }
}
