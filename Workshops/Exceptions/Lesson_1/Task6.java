package Workshops.Exceptions.Lesson_1;

import java.util.Scanner;

/**
 * Создайте boolean метод, который запросит у пользователя поля: login, password и confirm password
 * Логин должен содержать только символы: a, b, c, d, e, 0,1, _,
 * если это не так нужно бросить RuntimeException с соответствующим сообщением.
 * Логин должен быть не меньше 4 и не больше 8 символов, если это не так нужно бросить RuntimeException
 * с соответствующим сообщением.
 * Пароль должен быть не меньше 4 и не больше 8 символов и состоять только из цифр,
 * если это не так нужно бросить RuntimeException с соответствующим сообщением.
 * Пароль и его повтор должны совпадать, если это не так нужно
 * бросить RuntimeException с соответствующим сообщением.
 */
public class Task6 {
    public static void main(String[] args) {
        enterData();
    }

    private static void enterData() {
        System.out.println("Введите логин (только a, b, c, d, e, 0,1, _, и не менее 4 и не более 8 символов): ");
        String login = prompt();
        System.out.println("Введите пароль (от 4 до 8 символов и только цифры): ");
        String password = prompt();
        System.out.println("Повторите пароль: ");
        String confirm = prompt();
        UserData data = new UserData(login, password, confirm);
        if (isDataValid(data)) {
            System.out.println("Вы успешно зарегистрированы!");
        }
    }

    private static boolean isDataValid(UserData data) {
        if (!data.getLogin().matches("[abcde01_]{4,8}")) {
            throw new RuntimeException("Логин должен содержать только символы: a, b, c, d, e, 0, 1, _ и быть длиной от 4 до 8 символов!");
        }
        if (!data.getPassword().matches("\\d{4,8}")) {
            throw new RuntimeException("Пароль должен состоять только из цифр и быть длиной от 4 до 8 символов!");
        }
        if (!data.getPassword().equals(data.getConfirm())) {
            throw new RuntimeException("Логин и пароль должны совпадать!");
        }
        return true;
    }

    private static String prompt() {
        Scanner scanner = new Scanner(System.in);
        return scanner.next();
    }
    
}