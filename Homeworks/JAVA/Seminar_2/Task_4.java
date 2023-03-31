// К калькулятору из предыдущего дз добавить логирование.

package Homeworks.JAVA.Seminar_2;

import java.io.*;
import java.util.Scanner;
import java.util.logging.*;

public class Task_4 {
    public static Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        try {
            Logger log = Logger.getLogger(Task_4.class.getName());
            log.setLevel(Level.INFO);
            // ConsoleHandler ch = new ConsoleHandler();
            // log.addHandler(ch);
            // SimpleFormatter sFormat = new SimpleFormatter();
            // XMLFormatter xml = new XMLFormatter();
            // ch.setFormatter(sFormat);
            System.out.print("Введите ваше имя: ");
            String name = scanner.nextLine();
            log.info("Пользователь " + name + " вошёл в калькулятор");
            String pathProject = System.getProperty("user.dir");
            String pathFile = pathProject.concat("/Homeworks/JAVA/Seminar_2/calc_logs.txt");
            File calc_logs = new File(pathFile);
            FileWriter fw = new FileWriter(calc_logs, true);
            fw.append("Пользователь " + name + " вошёл в калькулятор\n");
            if (calc_logs.createNewFile()) log.info("File created");
            else log.warning("File already existing.");
            // ch.setFormatter(xml);

            while (true) {
                System.out.printf("Vvedite pervoe chislo: ");
                Float x = scanner.nextFloat();
                System.out.printf("Vvedite arifmeticheskuyu operaciyu (1: '+', 2: '-', 3: '/', 4: '*'): ");
                int operation = scanner.nextInt();
                System.out.printf("Vvedite vtoroe chislo: ");
                Float y = scanner.nextFloat();
                switch (operation) {
                    case 1:
                        log.info("Rezul`tat slozheniya " + String.valueOf(x + " + " + y + " = " + (x + y)) + "\n");
                        fw.append("Rezul`tat slozheniya " + String.valueOf(x + " + " + y + " = " + (x + y)) + "\n");
                        break;
                    case 2:
                        log.info("Rezul`tat vychitaniya " + String.valueOf(x + " - " + y + " = " + (x - y)) + "\n");
                        fw.append("Rezul`tat vychitaniya " + String.valueOf(x + " - " + y + " = " + (x - y)) + "\n");
                        break;
                    case 3:
                        log.info("Rezul`tat deleniya " + String.valueOf(x + " / " + y + " = " + (x / y)) + "\n");
                        fw.append("Rezul`tat deleniya " + String.valueOf(x + " / " + y + " = " + (x / y)) + "\n");
                        break;
                    case 4:
                        log.info("Rezul`tat umnozheniya " + String.valueOf(x + " * " + y + " = " + (x * y)) + "\n");
                        fw.append("Rezul`tat umnozheniya " + String.valueOf(x + " * " + y + " = " + (x * y)) + "\n");
                        break;
                    default:
                        log.warning("Введены некорректные данные!");
                        System.out.println("Vy vveli nevernye danniye. Vvedite korrektnye dannye.");
                        break;
                }
                System.out.printf("Vybirete dal`neyshee deystvie(0: 'Zakonchit`, 1: 'Prodolzhit'): ");
                int repeat = scanner.nextInt();
                if (repeat == 0) {
                    break;
                }
            }
            log.info("Пользователь вышел из калькулятора");
            fw.append("Пользователь " + name + " вошёл в калькулятор\n");
            fw.close();
        } catch (Exception e) {
            System.out.println("Mistake occured.");
        }
    }
}
