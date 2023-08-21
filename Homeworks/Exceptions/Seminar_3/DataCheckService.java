package Homeworks.Exceptions.Seminar_3;

import java.util.Scanner;

public class DataCheckService {

    private static Scanner scanner = new Scanner(System.in);

    public static String[] dataCheck() {

        System.out.println(
                "Введите ФАМИЛИЮ, ИМЯ, ОТЧЕСТВО, ДАТУ РОЖДЕНИЯ(дд.мм.гггг), НОМЕР ТЕЛЕФОНА(целое беззнаковое число без форматирования), ПОЛ (М/Ж), разделяя пробелом.");

        String input = scanner.nextLine();
        String[] data = input.split(" ");

        System.out.println("Идет проверка данных, введенных пользователем...");

        /* Проверка количества введенных данных */
        if (data.length != 6) {
            throw new DataException("Введено неверное количество данных пользователя.");
        }

        /* Проверка поля 'ФАМИЛИЯ' на присутствие только букв (отсутствие недопустимых символов) */
        if (isAlpha(data[0])) {
            throw new DataException("В поле 'ФАМИЛИЯ' присутствует(ют) недопустимые символы.");
        }

        /* Проверка поля 'ИМЯ' на присутствие только букв (отсутствие недопустимых символов) */
        if (isAlpha(data[1])) {
            throw new DataException("В поле 'ИМЯ' присутствует(ют) недопустимые символы.");
        }

        /* Проверка поля 'ОТЧЕСТВО' на присутствие только букв (отсутствие недопустимых символов) */
        if (isAlpha(data[2])) {
            throw new DataException("В поле 'ОТЧЕСТВО' присутствует(ют) недопустимые символы.");
        }

        /* Проверка поля 'ДАТА РОЖДЕНИЯ' на корректный формат 'дд.мм.гггг'
         * дд - не больше 31
         * мм - не больше 12
         * гггг - не больше текущего года (2023)
         */
        if (data[3].matches("([0-9]{2}).([0-9]{2}).([0-9]{4})")) {
            String[] birthDate = data[3].split("\\.");
            if (Integer.parseInt(birthDate[0]) > 31)
                throw new DataException("В поле 'ДАТА РОЖДЕНИЯ' задан неверно 'день'.");
            if (Integer.parseInt(birthDate[1]) > 12)
                throw new DataException("В поле 'ДАТА РОЖДЕНИЯ' задан неверно 'месяц'.");
            if (Integer.parseInt(birthDate[2]) > 2023)
                throw new DataException("В поле 'ДАТА РОЖДЕНИЯ' задан неверно 'год'.");
        } else {
            throw new DataException("Поле 'ДАТА РОЖДЕНИЯ' задана в неверном формате 'дд.мм.гггг'.");
        }

        /* Проверка поля 'НОМЕР ТЕЛЕФОНА' на присутствие только цифр */
        if (isDigit(data[4])) {
            throw new DataException(
                    "Поле 'НОМЕР ТЕЛЕФОНА' задано в неверном формате (допускается только целое беззнаковое число)");
        }

        /* Проверка поля 'ПОЛ' на присутствие только буквы 'М' или 'Ж' вне зависимости от регистра */
        if (!data[5].toLowerCase().equals("м") && !data[5].toLowerCase().equals("ж")) {
            throw new DataException("Поле 'ПОЛ' задан в неверном формате (М/Ж).");
        }

        System.out.println("Проверка данных прошла успешно!");

        return data;
    }

    /* Метод для проверки присутствия в строке только букв */
    public static boolean isAlpha(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if (!Character.isLetter(c)) {
                return true;
            }
        }
        return false;
    }

    /* Метод для проверки присутствия в строке только цифр */
    public static boolean isDigit(String name) {
        char[] chars = name.toCharArray();

        for (char c : chars) {
            if (!Character.isDigit(c)) {
                return true;
            }
        }
        return false;
    }
}
