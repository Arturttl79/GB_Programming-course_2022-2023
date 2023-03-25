// В первый день спортсмен пробежал x километров, а затем он каждый день увеличивал пробег на 10% от предыдущего значения. 
// По данному числу y определите номер дня, на который пробег спортсмена составит не менее y километров.
// Входные данные
// Программа получает на вход действительные числа x и y

// Выходные данные
// Программа должна вывести одно натуральное число.

// Sample Input:

// 10
// 20
// Sample Output:

// 9

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_1;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double x = scanner.nextDouble();
        double y = scanner.nextDouble();
        int counter = 1;
        while (x < y) {
            x = x * 1.1;
            counter++;
        }
        System.out.printf("Sportsman probezhal %d dney.", counter);
        scanner.close();
    }
}
