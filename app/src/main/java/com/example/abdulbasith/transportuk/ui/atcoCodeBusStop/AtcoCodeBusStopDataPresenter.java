package com.example.abdulbasith.transportuk.ui.atcoCodeBusStop;

import android.annotation.SuppressLint;
import android.util.Log;

import com.example.abdulbasith.transportuk.data.network.AppDataManager;
import com.example.abdulbasith.transportuk.data.network.model.busStopModels.AtcoCodeBusStopModel;
import com.example.abdulbasith.transportuk.ui.base.BasePresenter;
import com.example.abdulbasith.transportuk.ui.util.rx.SchedulerProvider;

import javax.annotation.Nonnull;

import io.reactivex.disposables.CompositeDisposable;
import io.reactivex.functions.Consumer;

/**
 * Created by Abdul Basith on 06/12/2017.
 */

public class AtcoCodeBusStopDataPresenter <V extends IAtcoCodeBusStopDataMVPView> extends BasePresenter<V> implements IAtcoCodeBusStopDataMVPPresenter <V>{

    public AtcoCodeBusStopDataPresenter(AppDataManager dataManager, SchedulerProvider schedulerProvider, CompositeDisposable compositeDisposable) {
        super(dataManager, schedulerProvider, compositeDisposable);
    }

    @Override
    public void onViewPrepared() {
        getCompositeDisposable()
                .add(getDataManager().getAtCoCodeBusStop()
                .subscribeOn(getSchedulerProvider().io())
                        .observeOn(getSchedulerProvider().ui())
                       .subscribe(new Consumer<AtcoCodeBusStopModel>() {
                                      @Override
                                      public void accept(@Nonnull AtcoCodeBusStopModel atcoCodeBusStopModel) throws Exception {
                                          getMvpView().onFetchDataCompleted(atcoCodeBusStopModel);
                                      }
                                  },
                               new Consumer<Throwable>() {
                                   @SuppressLint("LongLogTag")
                                   @Override
                                   public void accept(Throwable throwable) throws Exception {
                                       getMvpView().onError(throwable.getMessage());
                                       Log.i("This Error AtcoCodeBusStoper on Consumer", (throwable.getMessage()));

                               }

    }));

    }
}
