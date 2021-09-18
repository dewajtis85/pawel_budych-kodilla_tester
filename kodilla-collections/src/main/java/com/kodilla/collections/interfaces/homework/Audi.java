package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {

    private int speed;

    public Audi(int speed) {
        this.speed = speed;
    }

    @Override
    public int increaseSpeed() {
        return speed + 20;

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
