package com.junit.testing;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class CalculatorTest {

    Calculator calculator = new Calculator();

    @Test
    void testAddition() {
        assertEquals(5, calculator.add(2, 3), "2 + 3 should be 5");
    }

    @Test
    void testSubtraction() {
        assertEquals(2, calculator.subtract(5, 3), "5 - 3 should be 2");
    }

    @Test
    void testMultiplication() {
        assertEquals(15, calculator.multiply(3, 5), "3 * 5 should be 15");
    }

    @Test
    void testDivision() {
        assertEquals(2, calculator.divide(10, 5), "10 / 5 should be 2");
    }

    @Test
    void testDivisionByZero() {
        Exception exception = assertThrows(IllegalArgumentException.class, () -> {
            calculator.divide(10, 0);
        });
        assertEquals("Division by zero is not allowed", exception.getMessage());
    }
}
