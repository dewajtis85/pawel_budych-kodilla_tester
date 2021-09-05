package com.kodilla.inheritance.homework;

public class OperatingSystem {
    private int year;

    public OperatingSystem(int year) {

        this.year = year;
    }

    public void turnOn() {
        System.out.println("Trwa uruchamianie systemu Microsoft Windows");
    }

    public void turnOff() {
        System.out.println("Można teraz bezpiecznie wyłączyć komputer.");
    }
}