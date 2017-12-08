package com.example.abdulbasith.transportuk.ui.busStopPresenter;

import com.example.abdulbasith.transportuk.data.network.model.busStopModels.LocalBusStopModel;
import com.example.abdulbasith.transportuk.ui.base.MvpView;

/**
 * Created by Abdul Basith on 17/11/2017.
 */

public interface IBusStopDataMVPView extends MvpView {
    void  onFetchDataCompleted(LocalBusStopModel localBusStopModel);
}
