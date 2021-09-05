package com.kodilla.abstracts.homework;

public class Square extends Shape {
    private int bok;

    public Square(int bok) {
        super();
        this.bok = bok;
    }

    public int getBok() {
        return bok;
    }

    @Override
    public void circumference() {
        int obwod = 4 * getBok();
        System.out.println("Obwód kwadratu wynosi " + obwod + " cm.");


    }

    @Override
    public void area() {
        int pole = getBok() * getBok();
        System.out.println("Pole powierzchni kwadratu wynosi " + pole + " cm2.");


    }
}




