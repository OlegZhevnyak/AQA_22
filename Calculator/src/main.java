import java.util.Scanner;

public class main {
    public static void main(String[] args) {

        double result = 0;

        Scanner input = new Scanner(System.in);

        while (true) {
            System.out.println("Select a mathematical operation by typing one of the symbols: \"+ - * /\".");
            char operator = input.next().charAt(0);

            if ((operator == '+') || (operator == '-') || (operator == '*')) {
                double firstValue = userInput("Insert first value.");
                double secondValue = userInput("Insert second value.");

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
                System.out.println("Operation: " + numerator + " " + operator + " " + denominator);
                System.out.println("Result: " + result);
                break;
            } else {
                System.out.println("You insert invalid operation.");
            }
        }
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
    //Rty to do pull-request to git
}
