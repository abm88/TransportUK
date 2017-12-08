package com.example.abdulbasith.transportuk;

import android.app.Application;
import android.content.Context;

import com.example.abdulbasith.transportuk.data.component.IApplicationComponent;

import io.realm.Realm;
import io.realm.RealmConfiguration;

/**
 * Created by Abdul Basith on 15/11/2017.
 */

public class MyApp extends Application{
    public static Application sApplication;
    IApplicationComponent iApplicationComponent;

    public static Application getsApplication() {
        return sApplication;
    }

    public static void setsApplication(Application sApplication) {
        MyApp.sApplication = sApplication;
    }

    public IApplicationComponent getiApplicationComponent() {
        return iApplicationComponent;
    }

    public void setiApplicationComponent(IApplicationComponent iApplicationComponent) {
        this.iApplicationComponent = iApplicationComponent;
    }

    public static Context getContext(){
        return getsApplication().getApplicationContext();
    }

    @Override
    public void onCreate() {
        super.onCreate();
        sApplication = this;

        Realm.init(getApplicationContext());

        RealmConfiguration realmConfiguration = new RealmConfiguration.Builder()
                .name(Realm.DEFAULT_REALM_NAME)
                .schemaVersion(1)
                .deleteRealmIfMigrationNeeded()
                .build();
        Realm.setDefaultConfiguration(realmConfiguration);

    }

    @Override
    public void onTerminate() {
        super.onTerminate();
    }
}
