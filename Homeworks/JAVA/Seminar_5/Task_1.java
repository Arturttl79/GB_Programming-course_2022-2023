// Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
package Homeworks.JAVA.Seminar_5;
import java.util.*;
public class Task_1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>();
        boolean flag = true;
        while (flag) {
            System.out.print("Введите ФИО: ");
            String name = scanner.nextLine();
            System.out.print("Введите номера телефонa: ");
            String number = scanner.next();
            map.put(name, number);
            while (true) {
                System.out.print("Желаете добавить дополнительный номер для данного контакта? (1 - Да, 0 - Нет): ");
                if (scanner.next().equals("1")) {
                    System.out.print("Введите номера телефонa: ");
                    map.put(name, map.get(name) + ", " + scanner.next());
                } else break;
            }
            
            System.out.print("Введите 1, чтобы продолжить ввод данных. Введите 0, чтобы посмотреть справочник: ");
            if (scanner.next().equals("0")) flag = false;
            scanner.nextLine();
        }
        for (Map.Entry<String, String> item : map.entrySet()) {
            System.out.printf("ФИО: %s, Номер(-а) телефонa(-ов): %s; \n", item.getKey(), item.getValue());
        }
    }
}