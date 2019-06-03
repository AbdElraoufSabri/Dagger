package io.abdelraouf.learn.dagger;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import io.abdelraouf.learn.dagger.car.Car;
import io.abdelraouf.learn.dagger.di.CarComponent;
import io.abdelraouf.learn.dagger.di.DaggerCarComponent;
import io.abdelraouf.learn.dagger.di.DieselEngineModule;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car1, car2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.builder()
                .horsePower(200)
                .engineCapacity(1400)
                .build();

        carComponent.inject(this);

        car1.drive();
        car2.drive();
    }
}
