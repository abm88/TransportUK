package com.example.abdulbasith.transportuk.ui.busStopPresenter;

import android.util.Log;

import com.example.abdulbasith.transportuk.data.network.AppDataManager;
import com.example.abdulbasith.transportuk.data.network.model.busStopModels.LocalBusStopModel;
import com.example.abdulbasith.transportuk.ui.base.BasePresenter;
import com.example.abdulbasith.transportuk.ui.util.rx.SchedulerProvider;


import javax.annotation.Nonnull;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Abdul Basith on 17/11/2017.
 */

public class BustStopDataPresenter <V extends IBusStopDataMVPView> extends BasePresenter<V> implements IBusStopDataMVPPresenter<V> {
    public BustStopDataPresenter(AppDataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onViewPrepared(double lat, double lon) {

        getCompositeDisposable()
                .add(getDataManager().getLocalBusStop(lat, lon)
                        .subscribeOn(getSchedulerProvider().io())
                        .observeOn(getSchedulerProvider().ui())
                        .subscribe(new Consumer<LocalBusStopModel>() {
                                       @Override
                                       public void accept(@Nonnull LocalBusStopModel localBusStopModel) throws Exception {
                                           getMvpView().onFetchDataCompleted(localBusStopModel);
                                       }
                                   },
                                new Consumer<Throwable>() {
                                    @Override
                                    public void accept(Throwable throwable) throws Exception {
                                        getMvpView().onError(throwable.getMessage());
                                        Log.i("Error on Consumer -- >", (throwable.getMessage()));
                                    }
                                }));
    }

}

