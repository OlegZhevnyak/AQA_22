package com.it_academy.calculator;

import org.junit.Test;
import org.junit.jupiter.api.BeforeEach;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.util.Arrays;
import java.util.Collection;

import static org.junit.Assert.assertEquals;

@RunWith(Parameterized.class)
public class CalculatorTests {

    private double firstValue;
    private double secondValue;
    private double expectedResult;
    private CalculatorRunner calculatorRunner;

    public CalculatorTests(double firstValue, double secondValue, double expectedResult) {
        this.firstValue = firstValue;
        this.secondValue = secondValue;
        this.expectedResult = expectedResult;
    }

    @Parameterized.Parameters
    public static Collection<Object[]> data(){
        Object[][] data = new Object[][]{{1, 1, 2},{1, 1, 0},{2, 2, 4},{9, 3, 3}};
        return Arrays.asList(data);
    }

    @BeforeEach
    public void initialisationTests(){
        calculatorRunner = new CalculatorRunner();
    }

    @Test
    public void tesMultiplication(){
        assertEquals("Message", calculatorRunner);
    }

}
