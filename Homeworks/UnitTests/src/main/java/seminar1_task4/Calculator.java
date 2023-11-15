package seminar1_task4;

public class Calculator {

    // Метод для сложения двух чисел
    public int add(int a, int b) {
        return a + b;
    }

    // Метод для деления двух чисел. Генерирует исключение, если делитель равен нулю.
    public double divide(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Делитель не может быть равен нулю");
        }
        return (double) a / b;
    }

    // Принимает сумму покупки и процент скидки и возвращает сумму с учетом скидки
    public double calculateDiscount(double value, double discount) {

        if (value <= 0) {
            throw new ArithmeticException("По ДЗ в ф-ю передаётся сумма покупки. Значит, это должно быть положительное число.");
        }
        if (discount < 0 || discount > 100) {
            throw new ArithmeticException("Процент скидки не может быть отрицательным и не может превышать 100%");
        }
        return (double) value * (100 - discount) / 100;
    }
}
