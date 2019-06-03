package io.abdelraouf.learn.dagger.di;

import dagger.Module;
import dagger.Provides;
import io.abdelraouf.learn.dagger.car.DieselEngine;
import io.abdelraouf.learn.dagger.car.Engine;

@Module
public class DieselEngineModule {
    private int horsePower;

    public DieselEngineModule(int horsePower) {
        this.horsePower = horsePower;
    }

    @Provides
    int provideHorsePower() {
        return horsePower;
    }

    @Provides
    Engine provideEngine(DieselEngine engine) {
        return engine;
    }
}
