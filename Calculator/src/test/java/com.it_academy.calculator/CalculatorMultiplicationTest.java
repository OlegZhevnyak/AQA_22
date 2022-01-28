package com.it_academy.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorMultiplicationTest {

    public double expectedResult = 30;

    @Test
    public void multiplicationTest() {
        CalculatorUtilities.setFirstValue(5);
        CalculatorUtilities.setSecondValue(6);
        CalculatorUtilities.setOperator('*');
        CalculatorUtilities.doMathematicalOperation();
        assertEquals("Test failed for operation: " + CalculatorUtilities.getFirstValue() + " " +
                        CalculatorUtilities.getOperator() + " " + CalculatorUtilities.getSecondValue() +
                        ", Expected: " + expectedResult + ", Actual: " + CalculatorUtilities.getResult() + ".",
                expectedResult, CalculatorUtilities.getResult(), 3);
    }
}
