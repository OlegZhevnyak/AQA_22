package com.it_academy.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorSubtractionTest {

    public double expectedResult = -5;

    @Test
    public void subtractionTest() {
        CalculatorUtilities.setFirstValue(-5);
        CalculatorUtilities.setSecondValue(-0);
        CalculatorUtilities.setOperator('-');
        CalculatorUtilities.doMathematicalOperation();
        assertEquals("Test failed for operation: " + CalculatorUtilities.getFirstValue() + " " +
                        CalculatorUtilities.getOperator() + " " + CalculatorUtilities.getSecondValue() +
                        ", Expected: " + expectedResult + ", Actual: " + CalculatorUtilities.getResult() + ".",
                expectedResult, CalculatorUtilities.getResult(), 3);
    }
}
