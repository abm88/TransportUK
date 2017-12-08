package com.example.abdulbasith.transportuk.ui.busStopPresenter;

/**
 * Created by Abdul Basith on 17/11/2017.
 */

public interface IBusStopDataMVPPresenter <V extends IBusStopDataMVPView> {

    void onViewPrepared(double lat, double lon);
}
