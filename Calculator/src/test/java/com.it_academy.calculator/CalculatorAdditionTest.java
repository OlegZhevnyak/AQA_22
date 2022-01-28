package com.it_academy.calculator;

import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorAdditionTest {

    public double expectedResult = 3;

    @Test
    public void additionTest() {
        CalculatorUtilities.setFirstValue(9);
        CalculatorUtilities.setSecondValue(-6);
        CalculatorUtilities.setOperator('+');
        CalculatorUtilities.doMathematicalOperation();
        assertEquals("Test failed for operation: " + CalculatorUtilities.getFirstValue() + " " +
                        CalculatorUtilities.getOperator() + " " + CalculatorUtilities.getSecondValue() +
                        ", Expected: " + expectedResult + ", Actual: " + CalculatorUtilities.getResult() + ".",
                expectedResult, CalculatorUtilities.getResult(), 3);
    }
}
