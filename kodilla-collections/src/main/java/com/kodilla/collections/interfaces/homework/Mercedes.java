package com.kodilla.collections.interfaces.homework;

public class Mercedes implements Car {

    private int speed;

    public Mercedes (int speed){
        this.speed = speed;

    }

    @Override
    public void increaseSpeed() {

        speed = speed + 30;
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
