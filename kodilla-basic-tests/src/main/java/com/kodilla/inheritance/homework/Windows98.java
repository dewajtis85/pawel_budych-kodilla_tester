package com.kodilla.inheritance.homework;

public class Windows98 extends OperatingSystem {

    public Windows98(int year) {
        super(year);
    }

    @Override
    public void turnOn() {
        System.out.println(("Trwa uruchamianie systemu Microsoft Windows 98..."));
    }

    @Override
    public void turnOff() {
        System.out.println("Można teraz bezpiecznie wyłączyć komputer.");
    }
}
