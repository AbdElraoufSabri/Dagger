package io.abdelraouf.learn.dagger;

import dagger.Module;
import dagger.Provides;

@Module
public class WheelsModule {

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
