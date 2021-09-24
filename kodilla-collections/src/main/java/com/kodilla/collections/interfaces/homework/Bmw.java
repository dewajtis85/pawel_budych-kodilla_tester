package com.kodilla.collections.interfaces.homework;

public class Bmw implements Car {

    private int speed;

    public Bmw(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {

        speed = speed + 25;
    }

    @Override
    public void decreaseSpeed() {

        speed = speed - 15;
    }
    @Override
    public int getSpeed() {
        return speed;
    }
}
