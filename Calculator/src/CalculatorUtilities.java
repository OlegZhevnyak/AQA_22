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
        double d;
        while (true) {
            System.out.println(message);
            try {
                d = Double.parseDouble(input.next());
                break;
            } catch (NumberFormatException e) {
                System.out.println("You can only insert numbers and \".\". Please, repeat.");
            }
        }
        return d;
    }

    public static void doMathematicalOperation(){
        
        double result = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Select a mathematical operation by typing one of the symbols: \"+ - * /\".");
            char operator = input.next().charAt(0);
            CalculatorUtilities.setOperator(operator);

            if ((operator == '+') || (operator == '-') || (operator == '*')) {
                double firstValue = userInput("Insert first value.");
                setFirstValue(firstValue);
                double secondValue = userInput("Insert second value.");
                setSecondValue(secondValue);

                switch (operator) {
                    case '+':
                        result = firstValue + secondValue;
                        break;
                    case '-':
                        result = firstValue - secondValue;
                        break;
                    case '*':
                        result = firstValue * secondValue;
                        break;
                }
                setResult(result);
                System.out.println("Operation: " + firstValue + " " + operator + " " + secondValue);
                System.out.println("Result: " + result);
                break;
            }
            if (operator == '/') {
                double numerator = userInput("Insert numerator.");
                double denominator = userInput("Insert denominator.");
                if (denominator == 0) {
                    System.out.println("Division by zero is not available. Please, repeat.");
                    break;
                }
                result = numerator / denominator;
                setResult(result);
                System.out.println("Operation: " + numerator + " " + operator + " " + denominator);
                System.out.println("Result: " + result);
                break;
            } else {
                System.out.println("You insert invalid operation.");
            }
        }
    }
}