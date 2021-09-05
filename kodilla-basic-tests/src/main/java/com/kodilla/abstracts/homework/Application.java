package com.kodilla.abstracts.homework;

public class Application {
    public static void main(String[] args) {
        Square square = new Square(5);
        square.circumference();
        square.area();

        Rectangle rectangle = new Rectangle(5, 10);
        rectangle.circumference();
        rectangle.area();

        Circle circle = new Circle(3.1415927, 10);
        circle.circumference();
        circle.area();

    }
}
