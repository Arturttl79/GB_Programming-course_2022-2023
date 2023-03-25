// Напишите программу, которая выводит в столбик целые числа от a до b (a >= b) с шагом c. Границы включаются.

// Входные данные
// Заданы три целых числа а, b, с, где a > b

// Выходные данные
// Выведите единственное число - ответ на задачу.

// Sample Input:

// 20
// 1
// 2
// Sample Output:

// 20
// 18
// 16
// 14
// 12
// 10
// 8
// 6
// 4
// 2

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_1;
import java.util.Scanner;
public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int c = scanner.nextInt();
        for (int i = a; i >= b; i-=c) {
            System.out.println(i);
        }
        scanner.close();
    }
}
