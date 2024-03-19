package pl.pp;
import java.util.Scanner;
public class mojaCzwartaAplikacja {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        /*while (true) {
            System.out.println("Enter lower and upper integer limits: ");
            int input1 = scanner.nextInt();
            int input2 = scanner.nextInt();
            if (input1 >= input2) {
                System.out.println("Done...");
                break;
            }
            int sum = 0;
            for (int i = input1; i <= input2; i++){
                sum += i*i;
            }
            System.out.println("The sums of the squares from " + input1 + " to " + input2 + " is " + sum);
        }*/
        System.out.println("Calculator");
        //https://www.w3schools.com/java/java_try_catch.asp
        //https://www.w3schools.com/java/java_switch.asp

        while (true) {

            System.out.print("Enter numbers: (type 'q' to quit)");
            String input = scanner.next();

            if (input.equalsIgnoreCase("q")) {
                System.out.println("Done!");
                break;
            }

            double num1;
            try {
                num1 = Double.parseDouble(input);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input!");
                continue;
            }

            double num2;
            try {
                num2 = scanner.nextDouble();
            } catch (Exception e) {
                System.out.println("Invalid input!");
                scanner.next();
                continue;
            }

            System.out.print("Choose operation (+, -, *, /): ");
            char operation = scanner.next().charAt(0);

            double result;

            switch (operation) {
                case '+':
                    result = num1 + num2;
                    break;
                case '-':
                    result = num1 - num2;
                    break;
                case '*':
                    result = num1 * num2;
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("Division by zero is not allowed.");
                        continue;
                    }
                    result = num1 / num2;
                    break;
                default:
                    System.out.println("Error!");
                    continue;
            }
            System.out.println("Result: " + result);
        }

        scanner.close();
    }
}