package com.example.abdulbasith.transportuk.data.network;

import com.example.abdulbasith.transportuk.data.network.model.busStopModels.AtcoCodeBusStopModel;
import com.example.abdulbasith.transportuk.data.network.model.busStopModels.LocalBusStopModel;

import io.reactivex.Observable;

/**
 * Created by Abdul Basith on 15/11/2017.
 */

public interface IApiHelper {
    io.reactivex.Observable<LocalBusStopModel> getLocalBusStop(double lat, double lon);
    Observable<AtcoCodeBusStopModel> getAtCoCodeBusStop();
}
