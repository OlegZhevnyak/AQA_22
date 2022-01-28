package com.it_academy.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorDivisionTest {

    public double expectedResult = 1000;

    @Test
    public void divisionTest() {
        CalculatorUtilities.setFirstValue(100);
        CalculatorUtilities.setSecondValue(0.1);
        CalculatorUtilities.setOperator('/');
        CalculatorUtilities.doMathematicalOperation();
        assertEquals("Test failed for operation: " + CalculatorUtilities.getFirstValue() + " " +
                        CalculatorUtilities.getOperator() + " " + CalculatorUtilities.getSecondValue() +
                        ", Expected: " + expectedResult + ", Actual: " + CalculatorUtilities.getResult() + ".",
                expectedResult, CalculatorUtilities.getResult(), 3);
    }
}
