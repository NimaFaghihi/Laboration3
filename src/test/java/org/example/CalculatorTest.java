package org.example;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator;

    @BeforeEach
    public void beforeEachTest(){
        calculator = new Calculator();
    }

    @Test
    @DisplayName("Addition")
    public void testAddNumber(){
        int actual = calculator.add(2,5); //FAILED TEST
        assertEquals(6,actual);
    }

    @Test
    @DisplayName("Subtraction")
    public void testSubtractNumber(){
        int actual = calculator.subtract(8,4);
        assertEquals(4,actual);
    }

    @Test
    @DisplayName("Multiplication")
    public void testMultiplicationNumber(){
        int actual = calculator.multiply(6,6);
        assertEquals(36,actual);
    }

    @Test
    @DisplayName("Divide")
    public void testDividedNumber() {
        double actual = calculator.divide(10,5);
        assertEquals(2,actual);
    }

    @Test
    @DisplayName("squareRootOf")
    public void testSquareRootOf() {
        double actual = calculator.squareRootOf(64);
        assertEquals(8, actual);
    }

    @Test
    @DisplayName("GetArea")
    public void testGetArea() {
        double actual = calculator.getArea(5);
        assertEquals(78.54,actual);
    }

    @Test
    @DisplayName("GetCircumference")
    public void testGetCircumference(){
        double actual = calculator.getCircumference(2);
        assertEquals(12.57, actual);
    }

}