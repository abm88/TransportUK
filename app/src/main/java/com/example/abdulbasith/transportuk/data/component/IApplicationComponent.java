package com.example.abdulbasith.transportuk.data.component;

import android.app.Application;

import com.example.abdulbasith.transportuk.MyApp;

/**
 * Created by Abdul Basith on 15/11/2017.
 */

public interface IApplicationComponent {
    void inject(MyApp myApp);

    Application getApplication();

}
