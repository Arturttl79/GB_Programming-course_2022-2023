// Вьюшка

import java.util.Scanner;

public class ViewCalculator {

    // Добавляем объект - "фабрику", экземпляр которой создаём в клиентском коде (класс App).
    // Эта "фабрика" создаёт декоратор калькулятора LogCalculator, с подключенным логгером.
    private iCalculableFactory calculableFactory;

    public ViewCalculator(iCalculableFactory calculableFactory) {
        this.calculableFactory = calculableFactory;
    }

    public static Scanner in = new Scanner(System.in);

    public void run() {

        // Запускаем бесконечный цикл для возможности вводить несколько примеров.
        // Ввод команды "N" (на самом деле любых символов, отличных от "Y" и "y") на предложение продолжить прекращает этот цикл.
        while (true) {
            
            // Запрашиваем через консоль элементы комплексного числа
            double primaryReal = promptDouble("Введите действительную часть комплексного числа: ");
            double primaryImaginary = promptDouble("Введите мнимую часть комплексного числа: ");

            // Создаём калькулятор (точнее декоратор LogCalculator)
            iCalculable calculator = calculableFactory.create(primaryReal, primaryImaginary);

            // Запускаем бесконечный цикл для возможности производить несколько операций.
            // Ввод команды "=" (показать результат) прекращает этот цикл.
            while (true) {

                String cmd = prompt("Введите команду (+, *, /, =): ");
                
                // Если пользователь хочет завершить пример
                if (cmd.equals("=")) {
                    
                    // запрашиваем получившиеся дейсвительную и мнимую части комплексного числа
                    double[] result = calculator.getResult();
                    
                    // и форматируем вывод комплесного числа из его действительной и мнимой частей
                    String output;
                    if (result[0] == 0) {
                        output = String.format("%.2f", result[1]);
                    } else if (result[1] == 0) {
                        output = String.format("%.2fi", result[0]);
                    } else if (result[1] < 0) {
                        output = String.format("%.2f - %.2fi", result[0], Math.abs(result[1]));
                    } else {
                        output = String.format("%.2f + %.2fi", result[0], result[1]);
                    }
                    System.out.println("Результат: "+output);
                    break;
                }
                else {
                    // Если выбрана дальнейшая операция (не "равно"), запрашиваем элементы второго комплексного числа
                    double argReal = promptDouble("Введите действительную часть следующего комплексного числа: ");
                    double argImaginary = promptDouble("Введите мнимую часть следующего комплексного числа: ");

                    if (cmd.equals("+")) {
                        calculator.sum(argReal, argImaginary);
                        continue;
                    }
                    if (cmd.equals("*")) {
                        calculator.multi(argReal, argImaginary);
                        continue;
                    }
                    if (cmd.equals("/")) {
                        calculator.devide(argReal, argImaginary);
                        continue;
                    }
                }
            }

            // Предусматриваем ввод большой и маленькой буквы.
            String cmd = prompt("Еще посчитать (Y/N)?");
            if (cmd.equals("Y") || cmd.equals("y")) {
                continue;
            }

            break;
        }
    }

    private String prompt(String message) {
        System.out.print(message);
        return in.nextLine();
    }

    private double promptDouble(String message) {
        System.out.print(message);
        return Double.parseDouble(in.nextLine());
    }
}