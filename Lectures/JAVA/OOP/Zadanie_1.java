package Lectures.JAVA.OOP;

import java.util.Scanner;
public class Zadanie_1 {
    static public Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        System.out.println("Vvedite chislo a: ");
        Double a = sc.nextDouble();
        System.out.println("Vvedite chislo b: ");
        Double b = sc.nextDouble();
        Double c = a + b;
        System.out.printf("a + b = %.1f", c);
    }
}
