package com.kodilla.collections.interfaces.homework;


public class CarRace {
    public static void main(String[] args) {

        Audi audi = new Audi(0);
        doRace(audi);
        Bmw bmw = new Bmw(0);
        doRace(bmw);
        Mercedes mercedes = new Mercedes(0);
        doRace(mercedes);



    }
    private static void doRace(Car car){
        car.increaseSpeed();
        car.increaseSpeed();
        car.increaseSpeed();
        car.decreaseSpeed();
        car.decreaseSpeed();
        System.out.println(car.getSpeed());

    }

}
