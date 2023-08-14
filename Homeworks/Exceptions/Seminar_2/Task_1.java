/*Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float), и возвращает введенное значение. 
Ввод текста вместо числа не должно приводить к падению приложения, вместо этого, необходимо повторно запросить 
у пользователя ввод данных. */

package Homeworks.Exceptions.Seminar_2;

import java.util.Scanner;

public class Task_1 {
    
    private static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        enterFloatNumber();
    }

    public static void enterFloatNumber() {
        while (true) {
            System.out.println("Enter float type number: ");
            String input = scanner.nextLine();
            try {
                Float number = Float.parseFloat(input);
                System.out.printf("You entered %f number", number);
                break;
            } catch (NumberFormatException e) {
                System.err.println("You entered text instead of floating number. Try again!\n");
            }
        }
    }
}
