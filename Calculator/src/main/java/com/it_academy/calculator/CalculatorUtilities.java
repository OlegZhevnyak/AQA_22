package com.it_academy.calculator;

import java.util.Scanner;

public class CalculatorUtilities {

    private static double firstValue = 0;
    private static double secondValue = 0;
    private static char operator = '\u0000';
    private static double result = 0;

    public static double getFirstValue() {
        return firstValue;
    }

    public static void setFirstValue(double firstValue) {
        CalculatorUtilities.firstValue = firstValue;
    }

    public static double getSecondValue() {
        return secondValue;
    }

    public static void setSecondValue(double secondValue) {
        CalculatorUtilities.secondValue = secondValue;
    }

    public static char getOperator() {
        return operator;
    }

    public static void setOperator(char operator) {
        CalculatorUtilities.operator = operator;
    }

    public static double getResult() {
        return result;
    }

    public static void setResult(double result) {
        CalculatorUtilities.result = result;
    }

    public static double userInput(String message) {
        Scanner input = new Scanner(System.in);
        double doubleValue;
        while (true) {
            System.out.println(message);
            try {
                doubleValue = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("You can only insert numbers and \".\". Please, repeat.");
            }
        }
        return doubleValue;
    }

    public static void setValues() {
        Scanner input = new Scanner(System.in);
        System.out.println("Select a mathematical operation by typing one of the symbols: \"+ - * /\".");
        setOperator(input.next().charAt(0));
        setFirstValue(userInput("Insert first value:"));
        setSecondValue(userInput("Insert second value:"));
    }

    public static void reportingOperationAndResult() {
        System.out.println("Operation: " + getFirstValue() + " " + getOperator() + " " + getSecondValue());
        System.out.println("Result: " + getResult());
    }

    public static void doAdditionOrSubtractionOrMultiplication() {
        switch (getOperator()) {
            case '+':
                setResult(getFirstValue() + getSecondValue());
                break;
            case '-':
                setResult(getFirstValue() - getSecondValue());
                break;
            case '*':
                setResult(getFirstValue() * getSecondValue());
                break;
        }
        reportingOperationAndResult();
    }

    public static void doDivision() {
        if (getSecondValue() == 0) {
            System.out.println("Division by zero is not available. Please, repeat.");
        } else {
        setResult(getFirstValue() / getSecondValue());
        reportingOperationAndResult();
        }
    }

    public static void doMathematicalOperation() {
        while (true) {
            if ((getOperator() == '+') || (getOperator() == '-') || (getOperator() == '*')) {
                doAdditionOrSubtractionOrMultiplication();
                break;
            }
            if (getOperator() == '/') {
                doDivision();
                break;
            } else {
                System.out.println("You insert invalid operation. Please, repeat.");
                break;
            }
        }
    }
}