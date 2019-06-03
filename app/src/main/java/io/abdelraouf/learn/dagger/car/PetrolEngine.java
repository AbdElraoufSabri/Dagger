package io.abdelraouf.learn.dagger.car;

import android.util.Log;

import javax.inject.Inject;

import static io.abdelraouf.learn.dagger.car.Naming.*;


public class PetrolEngine implements Engine {
    private static final String TAG = "PetrolEngine_XManoO";

    private int horsePower;
    private int engineCapacity;

    @Inject
    public PetrolEngine(@engineHorsePower int horsePower, @engineCapacity int engineCapacity) {
        this.horsePower = horsePower;
        this.engineCapacity = engineCapacity;
    }

    @Override
    public void start() {
        Log.d(TAG, "Petrol engine started. " +
                "\nHorsepower: " + horsePower +
                "\nEngine Capacity: "+ engineCapacity);
    }
}
