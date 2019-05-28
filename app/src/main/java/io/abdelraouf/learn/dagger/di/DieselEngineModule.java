package io.abdelraouf.learn.dagger.di;

import dagger.Binds;
import dagger.Module;
import io.abdelraouf.learn.dagger.car.DieselEngine;
import io.abdelraouf.learn.dagger.car.Engine;

@Module
public abstract class DieselEngineModule {

    @Binds
    abstract Engine bindEngine(DieselEngine engine);
}
