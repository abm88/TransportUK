package com.example.abdulbasith.transportuk.data.network.service;

import com.example.abdulbasith.transportuk.MyApp;
import com.example.abdulbasith.transportuk.data.network.API_Constants;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.jakewharton.retrofit2.adapter.rxjava2.RxJava2CallAdapterFactory;

import java.io.File;

import okhttp3.OkHttpClient;
import okhttp3.logging.HttpLoggingInterceptor;
import retrofit2.Retrofit;
import retrofit2.converter.gson.GsonConverterFactory;

/**
 * Created by Abdul Basith on 15/11/2017.
 */

public class ConnectionService {
    static Retrofit retrofit;
    static OkHttpClient okHttpClient;

    public static IRequestInterface getConnectionService(){
        okHttpClient = buildClient();

        Gson gson = new GsonBuilder()
                .setLenient()
                .create();

        retrofit = new Retrofit.Builder()
                .baseUrl(API_Constants.BASE_URL)
                .addConverterFactory(GsonConverterFactory.create(gson))
                .client(okHttpClient)
                .addCallAdapterFactory(RxJava2CallAdapterFactory.create())
                .build();
        return retrofit.create(IRequestInterface.class);
    }

    public static OkHttpClient buildClient(){
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        HttpLoggingInterceptor interceptor = new HttpLoggingInterceptor();
        interceptor.setLevel(HttpLoggingInterceptor.Level.BODY);
        builder.addInterceptor(interceptor).build();
        builder.interceptors().add(interceptor);


        //builder.addNetworkInterceptor(new Offline_CacheData().Re)
        builder.addNetworkInterceptor(new Offline_CacheData.ResponseCacheInterceptor());
        builder.addInterceptor(new Offline_CacheData.OfflineResponseCacheInterceptor())
        //
        .cache(new okhttp3.Cache(new File(MyApp
                .getContext().getCacheDir(),
                "apiResponses"), 5 * 1024 * 1024));
    return new OkHttpClient();
    }

}
