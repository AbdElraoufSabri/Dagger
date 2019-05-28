package io.abdelraouf.learn.dagger;

import android.os.Bundle;

import androidx.appcompat.app.AppCompatActivity;

import javax.inject.Inject;

import io.abdelraouf.learn.dagger.car.Car;
import io.abdelraouf.learn.dagger.di.CarComponent;
import io.abdelraouf.learn.dagger.di.DaggerCarComponent;

public class MainActivity extends AppCompatActivity {

    @Inject
    Car car;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        CarComponent carComponent = DaggerCarComponent.create();
        carComponent.inject(this);

        car.drive();
    }
}
