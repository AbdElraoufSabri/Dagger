package io.abdelraouf.learn.dagger;

import android.util.Log;

import javax.inject.Inject;

public class Car {
    private static final String TAG = "Car_XManoO";
    @Inject Engine engine;
    private Wheels wheels;

    @Inject
    public Car( Wheels wheels) {
        this.wheels = wheels;
    }

    @Inject
    public void enableRemote(Remote remote){
        remote.setListener(this);
    }

    public void drive(){
        Log.d(TAG, "driving ...vroom vrom");
    }
}
