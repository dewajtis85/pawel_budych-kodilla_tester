package com.kodilla.collections.lists.homework;

import com.kodilla.collections.arrays.homework.CarUtils;
import com.kodilla.collections.interfaces.homework.Mercedes;

import java.util.ArrayList;
import java.util.List;

public class CarsListApplication {

    public static void main(String[] args) {
        List<Mercedes> cars = new ArrayList<>();
        cars.add(new Mercedes(13));
        cars.add(new Mercedes(10));
        cars.add(new Mercedes(3));
        cars.add(new Mercedes(8));
        cars.add(new Mercedes(7));

        for (Mercedes mercedes : cars)
            CarUtils.describeCar(mercedes);

        cars.remove(2);


        Mercedes mercedesSl = new Mercedes(9);
        cars.add(mercedesSl);
        cars.remove(mercedesSl);


        System.out.println(cars.size());
        for (Mercedes mercedes : cars)
            CarUtils.describeCar(mercedes);


    }
}
