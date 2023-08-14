/* Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку. 
Пользователю должно показаться сообщение, что пустые строки вводить нельзя. */

package Homeworks.Exceptions.Seminar_2;

import java.util.Scanner;

public class Task_4 {

    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        enterText();
    }

    public static void enterText() {
        System.out.println("Enter any text: ");
        String input = scanner.nextLine();
        if (input.isBlank())
            System.err.println("You entered empty text!");
        else {
            System.out.printf("You entered '%s'", input);
        }
    }
}
