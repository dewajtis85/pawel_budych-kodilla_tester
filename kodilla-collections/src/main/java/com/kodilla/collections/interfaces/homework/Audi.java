package com.kodilla.collections.interfaces.homework;

public class Audi implements Car {

    private int speed;

    public Audi(int speed) {
        this.speed = speed;
    }

    @Override
    public void increaseSpeed() {
        speed = speed + 20;

    }

    @Override
    public void decreaseSpeed() {
        speed = speed - 20;

    }

    @Override
    public int getSpeed() {
        return speed;

    }
}
