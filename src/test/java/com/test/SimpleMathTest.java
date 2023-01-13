package com.test;

import operations.SimpleMath;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;
import static org.testng.Assert.assertEquals;

public class SimpleMathTest {

    @DataProvider
    private Object[][] getAdditionParameters() {
        return new Object[][] {
            {5, 8, 13},
            {-5, 8, 3},
            {0, 18, 18}
        };
    }

    @DataProvider
    private Object[][] getSubtractionParameters() {
        return new Object[][] {
            {5, 8, -3},
            {-15, 8, -23},
            {30, 18, 12}
        };
    }

    @DataProvider
    private Object[][] getMultiplicationParameters() {
        return new Object[][] {
            {13, 11, 143},
            {7, 8, 56},
            {0, 12, 0}
        };
    }

 @DataProvider
    private Object[][] getDivisionParameters() {
        return new Object[][] {
            {20, 5, 4},
            {42, 7, 6},
            {100, 10, 10}
        };
    }

    @Test(dataProvider = "getAdditionParameters")
    public void testAddition(int num1, int num2, int result) {
        assertEquals(SimpleMath.add(num1, num2), result);
    }

    @Test(dataProvider = "getSubtractionParameters")
    public void testSubtraction(int num1, int num2, int result) {
        assertEquals(SimpleMath.subtraction(num1, num2), result);
    }

    @Test(dataProvider = "getMultiplicationParameters")
    public void testMultiplication(int num1, int num2, int result) {
        assertEquals(SimpleMath.multiply(num1, num2), result);
    }

    @Test(dataProvider = "getDivisionParameters")
    public void testDivision(int num1, int num2, int result) {
        assertEquals(SimpleMath.divide(num1, num2), result);
    }

    @Test (expectedExceptions = ArithmeticException.class)
    public void testDividedByZero() {
        SimpleMath.divide(0, 30);
    }
}
