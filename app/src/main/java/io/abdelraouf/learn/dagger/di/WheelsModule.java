package io.abdelraouf.learn.dagger.di;

import dagger.Module;
import dagger.Provides;
import io.abdelraouf.learn.dagger.car.Rims;
import io.abdelraouf.learn.dagger.car.Tires;
import io.abdelraouf.learn.dagger.car.Wheels;

@Module
public abstract class WheelsModule {

    // State-free
    @Provides
    static Rims provideRims() {
        return new Rims();
    }

    // State-free
    @Provides
    static Tires provideTires() {
        Tires tires = new Tires();
        tires.inflate();
        return tires;
    }

    // State-free
    @Provides
    static Wheels provideWheels(Rims rims, Tires tires) {
        return new Wheels(rims, tires);
    }
}
