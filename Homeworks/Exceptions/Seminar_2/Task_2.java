package Homeworks.Exceptions.Seminar_2;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task_2 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {

        try {
            System.out.println("Enter the size of array:");
            int[] intArray = new int[scanner.nextInt()];
            int d = 0;
            double catchedRes1 = intArray[8] / d;
            System.out.println("catchedRes1 = " + catchedRes1);
        } catch (ArithmeticException e) {
            System.err.println("Catching exception: " + e);
        } catch (IndexOutOfBoundsException e) {
            System.err.println("Catching exception: " + e);
        } catch (InputMismatchException e) {
            System.err.println("Catching exception: " + e);
        } catch (OutOfMemoryError e) {
            System.err.println("Catching exception: " + e);
        }
    }

}