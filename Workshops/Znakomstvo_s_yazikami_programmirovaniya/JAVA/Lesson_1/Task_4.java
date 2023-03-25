// Вводится натуральное число n. Вычислите n! ("эн-факториал") – произведение всех натуральных чисел от 1 до n 

// n! = 1∙2∙3∙…∙ n.

// Sample Input:

// 5
// Sample Output:

// 120

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_1;

import java.util.Scanner;

public class Task_4 {
    static double factor(int n) {
        if(n==1) {
            return 1;
        }
        else {
            return n*factor(n-1);
        }
    }
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        double result = factor(n);
        System.out.println(result);
        scanner.close();
    }
}
