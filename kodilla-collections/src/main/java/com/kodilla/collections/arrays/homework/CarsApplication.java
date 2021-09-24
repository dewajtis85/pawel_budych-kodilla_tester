package com.kodilla.collections.arrays.homework;


import com.kodilla.collections.interfaces.homework.Audi;
import com.kodilla.collections.interfaces.homework.Bmw;
import com.kodilla.collections.interfaces.homework.Car;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.Random;

public class CarsApplication {
    public static void main(String[] args) {


        Random r = new Random();
        final int size=r.nextInt(15);
        Car[] cars = new Car[size];
        for (int n = 0; n < cars.length; n++) {
            cars[n] = drawCar();
        }
        for (Car car : cars){
        CarUtils.describeCar(car);
        }

    }

    public static Car drawCar(){
        Random random = new Random();
        int drawnCarKind = random.nextInt(3);
        int randomAcceleration = random.nextInt(12);
        if (drawnCarKind == 0)
            return new Audi(randomAcceleration);
        else if (drawnCarKind == 1)
            return new Bmw(randomAcceleration);
        else
            return new Mercedes(randomAcceleration);


    }
}
