// Требуется определить, можно ли от шоколадки размером n × m долек отломить k долек, если разрешается сделать один разлом по 
// прямой между дольками (то есть разломить шоколадку на два прямоугольника).

// Входные данные
// Вводятся 3 числа: n, m и k; k не равно n × m. Гарантируется, что количество долек в шоколадке не превосходит 30000.

// Выходные данные
// Программа должна вывести слово YES, если возможно отломить указанное число долек, в противном случае вывести слово NO.

// Sample Input 1:

// 3 2 4
// Sample Output 1:

// YES

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_1;

import java.util.Scanner;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int m = scanner.nextInt();
        int n = scanner.nextInt();
        int k = scanner.nextInt();
        if ((k % n == 0 || k % m == 0) && k < m * n) {
            System.out.println("Yes");
        }
        else System.out.println("No");
        scanner.close();
    }
}
