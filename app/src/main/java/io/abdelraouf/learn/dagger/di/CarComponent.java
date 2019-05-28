package io.abdelraouf.learn.dagger.di;

import dagger.Component;
import io.abdelraouf.learn.dagger.MainActivity;
import io.abdelraouf.learn.dagger.car.Car;

@Component(modules = {WheelsModule.class, DieselEngineModule.class})
public interface CarComponent {

    Car getCar();

    void inject(MainActivity activity);
}
