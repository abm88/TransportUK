package com.example.abdulbasith.transportuk.data.network.service;

import com.example.abdulbasith.transportuk.data.network.API_Constants;
import com.example.abdulbasith.transportuk.data.network.model.busStopModels.AtcoCodeBusStopModel;
import com.example.abdulbasith.transportuk.data.network.model.busStopModels.LocalBusStopModel;
import com.example.abdulbasith.transportuk.data.network.model.busStopModels.Stop;

import java.util.Observable;

import retrofit2.http.GET;
import retrofit2.http.Query;


import retrofit2.http.Headers;

/**
 * Created by Abdul Basith on 15/11/2017.
 */

public interface IRequestInterface {

    @GET(API_Constants.BUS_STOP_API)
    io.reactivex.Observable<LocalBusStopModel> getLocalBusStop(@Query("lat") double lat, @Query("lon") double lon, @Query("app_id") String appid, @Query("app_key") String apiKey);

    @GET(API_Constants.ATCOCOD_API)
    io.reactivex.Observable<AtcoCodeBusStopModel> getAtCoCodeBusStop(@Query("app_id") String appid, @Query("app_key") String apiKey);
}
