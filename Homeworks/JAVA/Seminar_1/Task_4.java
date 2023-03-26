// * Задано уравнение вида q + w = e, q, w, e >= 0. Некоторые цифры могут быть заменены знаком вопроса, например, 
// 2? + ?5 = 69. Требуется восстановить выражение до верного равенства. Предложить хотя бы одно решение или сообщить, 
// что его нет.

package Homeworks.JAVA.Seminar_1;

import java.util.Scanner;

public class Task_4 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (true) {
            System.out.printf("Vvedite pervoe chislo dvuhznachnogo chisla q: ");
            int q1 = scanner.nextInt();
            System.out.printf("Vvedite vtoroe chislo dvuhznachnogo chisla w: ");
            int w2 = scanner.nextInt();
            System.out.printf("Vvedite summu dvuh chisel e: ");
            int e = scanner.nextInt();
            if (q1 <= e / 10 % 10 && w2 <= e % 10) {
                int w1 = e / 10 % 10 - q1;
                System.out.println(w1);
                int q2 = e % 10 - w2;
                System.out.println(q2);
                System.out.printf("%d%d + %d%d = %d", q1, q2, w1, w2, e);
                break;
            } else
                System.out.println("Resheniya net. Povtorite vvod.");
        }
        scanner.close();

    }
}
