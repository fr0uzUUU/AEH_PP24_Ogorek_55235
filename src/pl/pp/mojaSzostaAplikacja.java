package pl.pp;
import java.util.Scanner;

public class mojaSzostaAplikacja {

    public static long factorialIterative(int n) {
        if (n < 0) {
            //Illegal Arg https://rollbar.com/blog/how-to-throw-illegalargumentexception-in-java/
            throw new IllegalArgumentException("Number > 0");
        }
        long result = 1;
        for (int i = 2; i <= n; i++) {
            result *= i;
        }
        return result;
    }
    public static long factorialRecursive(int n) {
        if (n < 0) {
            throw new IllegalArgumentException("Number > 0");
        }
        if (n == 0 || n == 1) {
            return 1;
        }
        return n * factorialRecursive(n - 1);
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter number");
        int number = scanner.nextInt();

        long startTimeIterative = System.nanoTime();
        long factorialIterative = factorialIterative(number);
        long endTimeIterative = System.nanoTime();
        long durationIterative = (endTimeIterative - startTimeIterative);
        System.out.println("Iterative Factorial " + number + " equals: " + factorialIterative);
        System.out.println("Time: " + durationIterative + " ns");
        System.out.println("------------------------------");
        long startTimeRecursive = System.nanoTime();
        long factorialRecursive = factorialRecursive(number);
        long endTimeRecursive = System.nanoTime();
        long durationRecursive = (endTimeRecursive - startTimeRecursive);
        System.out.println("Recursive Factorial " + number + " equals: " + factorialRecursive);
        System.out.println("Time: " + durationRecursive + " ns");

        scanner.close();
    }
}