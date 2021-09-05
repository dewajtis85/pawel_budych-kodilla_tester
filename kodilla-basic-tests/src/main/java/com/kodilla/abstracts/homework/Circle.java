package com.kodilla.abstracts.homework;

public class Circle extends Shape {
    private static double PI = 3.1415927;
    private double r;

    public Circle(double PI, double r){
        this.PI = PI;
        this.r = r;
    }

    public static double getPI() {
        return PI;
    }

    public double getR(){
        return r;
    }

    @Override
    public void circumference() {
        double obwod = 2 * PI * r;
        System.out.println("Obwód koła wynosi " + obwod + " cm.");

    }

    @Override
    public void area() {
        double pole = PI * r * r;
        System.out.println("Pole powierzchni koła wynosi " + pole + " cm2.");

    }
}
