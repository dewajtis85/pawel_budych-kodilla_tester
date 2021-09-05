package com.kodilla.inheritance.homework;

public class Windows95 extends OperatingSystem {

    public Windows95(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println("Trwa uruchamianie systemu Microsoft Windows 95...");
    }

    @Override
    public void turnOff() {
        System.out.println("Można teraz bezpiecznie wyłączyć komputer.");
    }
}
