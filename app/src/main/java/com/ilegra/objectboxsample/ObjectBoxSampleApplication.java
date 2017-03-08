package com.ilegra.objectboxsample;

import android.app.Application;
import android.content.Context;
import android.util.Log;

import io.objectbox.BoxStore;

/**
 * Created by Home on 30/01/2017.
 */

public class ObjectBoxSampleApplication extends Application {
    @Override
    public void onCreate(){
        super.onCreate();
        Log.i("Bicca", ObjectBoxSampleApplication.class.getSimpleName() + " - onCreate()");
    }

    @Override
    protected void attachBaseContext(Context base){
        super.attachBaseContext(base);
        Log.i("Bicca", ObjectBoxSampleApplication.class.getSimpleName() + " - attachBaseContext()");
    }

    @Override
    public void onTerminate(){
        super.onTerminate();
        Log.i("Bicca", ObjectBoxSampleApplication.class.getSimpleName() + " - onTerminate()");
    }

    public BoxStore getBoxStore(){
        BoxStore boxStore = MyObjectBox.builder().androidContext(this).build();
        Log.i("Bicca", ObjectBoxSampleApplication.class.getSimpleName() + " - initObjectBox()");
        return boxStore;
    }
}
