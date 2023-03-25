// Вводится массив (сначала количество элементов, потом сами элементы). Найдите сумму его элементов с чётными индексами и 
// выведите её. А потом выведите числа, которые суммировались.

// Sample Input:

// 4
// 1
// 2
// 3
// 4
// Sample Output:

// 4
// 1
// 3

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_1;

import java.util.Scanner;

public class Task_6 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.printf("Vvedite kol-vo elementov massiva: ");
        int massiv = scanner.nextInt();
        int sum = 0;
        int[] arr = new int[massiv];
        
        for (int i = 0; i < arr.length; i++) {
            System.out.printf("Vvedite %d-iy element massiva: ", (i + 1));
            arr[i] = scanner.nextInt();
            if (i % 2 == 0) {
                sum += arr[i];
            }
        }

        System.out.printf("Summa elementov chetnog indeksa = %d\n", sum);
        
        for (int i = 0; i < arr.length; i++) {
            if (i % 2 == 0) {
                System.out.println(arr[i]);
            }
        }
        scanner.close();
    }
}
