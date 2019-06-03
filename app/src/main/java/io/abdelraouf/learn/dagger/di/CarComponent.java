package io.abdelraouf.learn.dagger.di;

import javax.inject.Singleton;

import dagger.BindsInstance;
import dagger.Component;
import io.abdelraouf.learn.dagger.MainActivity;
import io.abdelraouf.learn.dagger.car.Car;
import io.abdelraouf.learn.dagger.car.Naming;

@Singleton
@Component(modules = {WheelsModule.class, PetrolEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity activity);

    @Component.Builder
    interface Builder{

        @BindsInstance
        Builder horsePower(@Naming.engineHorsePower int horsePower);

        @BindsInstance
        Builder engineCapacity(@Naming.engineCapacity int engineCapacity);

        CarComponent build();
    }
}
