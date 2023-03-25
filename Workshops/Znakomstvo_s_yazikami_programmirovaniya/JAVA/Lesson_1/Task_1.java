// Task_1
// Улитка ползёт по вертикальному шесту высотой h метров, поднимаясь за день на a метров, а за ночь спускаясь на b метров. 
// На какой день улитка доползёт до вершины шеста?

// Программа получает на вход натуральные числа h, a, b. Гарантируется, что a>b.

// Программа должна вывести одно натуральное число.

// Sample Input 1:

// 10
// 3
// 2

// Sample Output 1:

// 8


package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_1;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int h = scanner.nextInt();
        int a = scanner.nextInt();
        int b = scanner.nextInt();
        int days = (h - a)/(a - b) + 1;
        System.out.println(days);
        scanner.close();
    }
}
