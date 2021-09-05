package com.kodilla.inheritance.homework;

public class Application {
    public static void main(String[] args) {
        Windows95 windows95 = new Windows95(1995);
        windows95.turnOn();
        windows95.turnOff();

        Windows98 windows98 = new Windows98(1998);
        windows98.turnOn();
        windows98.turnOff();
    }
}

