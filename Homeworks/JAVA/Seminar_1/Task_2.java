// Вводится число n, затем n чисел целых, по одному на каждой строке. Затем вводится число, на которое нужно умножить все 
// введённые выше числа. Выведите на экран результат умножения построчно.
// Sample Input:
// 4
// 1
// 2
// 3
// 5
// 2
// Sample Output:
// 2
// 4
// 6
// 10

package Homeworks.JAVA.Seminar_1;

import java.util.Scanner;;

public class Task_2 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int massiv = scanner.nextInt();
        int[] arr = new int[massiv];

        for (int i = 0; i < arr.length; i++) {
            arr[i] = scanner.nextInt();
        }

        int multiplier = scanner.nextInt();
        System.out.print("\033\143");
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i] * multiplier);
        }
        scanner.close();
    }
}
