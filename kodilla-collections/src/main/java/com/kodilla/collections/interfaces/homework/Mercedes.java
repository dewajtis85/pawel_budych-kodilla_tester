package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {

    private int speed;

    public Mercedes (int speed){
        this.speed = speed;

    }

    @Override
    public int increaseSpeed() {

        return speed + 30;
    }

    @Override
    public int decreaseSpeed() {

        return speed - 20;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
}
