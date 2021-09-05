package com.kodilla.abstracts.homework;

public class Rectangle extends Shape {
    private int bok;
    private int bok2;

    public Rectangle(int bok, int bok2) {
        super();
        this.bok = bok;
        this.bok2 = bok2;
    }

    public int getBok() {
        return bok;
    }

    public int getBok2() {
        return bok2;
    }


    @Override
    public void circumference() {
        int obwod = 2 * getBok() + 2 * getBok2();
        System.out.println("Obwód prostokąta wynosi " + obwod + " cm.");


    }

    @Override
    public void area() {
        int pole = getBok() * getBok2();
        System.out.println("Pole powierzchni prostokąta wynosi " + pole + " cm2.");

    }
}
