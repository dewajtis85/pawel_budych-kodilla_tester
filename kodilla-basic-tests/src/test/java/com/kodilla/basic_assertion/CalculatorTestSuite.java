package com.kodilla.basic_assertion;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculatorTestSuite {


    @Test
    public void testSum() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int sumResult = calculator.sum(a, b);
        assertEquals(13, sumResult, 0.1);
    }

    @Test
    public void testSub() {
        Calculator calculator = new Calculator();
        int a = 5;
        int b = 8;
        int subResult = calculator.subtract(a, b);
        assertEquals(-3, subResult, 0.1);
    }


    @Test
    public void testSquare() {
        Calculator calculator = new Calculator();
        int a = 5;
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult, 0.1);
    }


    @Test
    public void testSquareZero() {
        Calculator calculator = new Calculator();
        int a = 0;
        int squareResult = calculator.square(a);
        assertEquals(0, squareResult, 0.1);
    }


    @Test
    public void testSquareMinus() {
        Calculator calculator = new Calculator();
        int a = -5;
        int squareResult = calculator.square(a);
        assertEquals(25, squareResult, 0.1);
    }

}
