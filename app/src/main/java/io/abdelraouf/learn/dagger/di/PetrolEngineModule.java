package io.abdelraouf.learn.dagger.di;

import dagger.Binds;
import dagger.Module;
import io.abdelraouf.learn.dagger.car.Engine;
import io.abdelraouf.learn.dagger.car.PetrolEngine;

@Module
public abstract class PetrolEngineModule {

    @Binds
    abstract Engine bindEngine(PetrolEngine engine);
}
