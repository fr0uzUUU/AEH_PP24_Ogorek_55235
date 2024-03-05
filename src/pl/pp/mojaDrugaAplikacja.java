package pl.pp;

import java.util.Scanner;

public class mojaDrugaAplikacja {
    public static void main(String[] args){

        int x = 10;
        var result = x;
        System.out.println("x = " + result);
        result = 2 * x;
        System.out.println("2 * x = " + result);
        result = x * x;
        System.out.println("x ^ 2 = " + result);

        Scanner scanner = new Scanner(System.in);
        System.out.println("Podaj swój wiek w latach a ja przeliczę go na sekundy");
        long  age = scanner.nextLong();
        age = age * 31556926;
        System.out.println("Żyjesz już " + age  + " sekund");
        scanner.close();
    }
}
