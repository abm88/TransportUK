package com.example.abdulbasith.transportuk.ui.atcoCodeBusStop;

import com.example.abdulbasith.transportuk.data.network.model.busStopModels.AtcoCodeBusStopModel;
import com.example.abdulbasith.transportuk.ui.base.MvpView;

/**
 * Created by Abdul Basith on 05/12/2017.
 */

public interface IAtcoCodeBusStopDataMVPView extends MvpView {
    void  onFetchDataCompleted(AtcoCodeBusStopModel atcoCodeBusStopModel);
}
