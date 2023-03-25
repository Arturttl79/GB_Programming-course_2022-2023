// Дан список. Выведите те его элементы, которые встречаются в списке только один раз. Элементы нужно выводить в том порядке, 
// в котором они встречаются в списке.

// Входные данные
// Вводится список чисел. Все числа списка находятся на одной строке.

// Выходные данные
// Выведите ответ на задачу.

// Sample Input:

// 6
// 1
// 2
// 2
// 3
// 3
// 3
// Sample Output:

// 1

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_1;

import java.util.Scanner;

public class Task_7 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vvedite kol-vo elementov massiva: ");
        int massiv = scanner.nextInt();
        int[] arr = new int[massiv];

        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Vvedite %d-iy element massiva: ", (i + 1));
            arr[i] = scanner.nextInt();
        }

        for (int i = 0; i < arr.length; i++) {
            int cnt = 0;
            for (int j = 0; j < arr.length; j++) {
                if (arr[i] == arr[j])
                    cnt++;
            }
            if (cnt == 1)
                System.out.println(arr[i]);
        }
        scanner.close();
    }
}
