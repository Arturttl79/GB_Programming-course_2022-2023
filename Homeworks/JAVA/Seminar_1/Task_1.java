// Создайте массив, в котором будут храниться кубы чисел от 1 до 1000. Затем вводятся 2 числа из этого диапазона. 
// Используя данные из массива найдите их кубы.
// Sample Input:
// 8
// 11
// Sample Output:
// 512
// 1331

package Homeworks.JAVA.Seminar_1;
import java.util.Scanner;;
public class Task_1 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int[] arr = new int[1000];
        for (int i = 0; i < arr.length; i++) {
            arr[i] = (i + 1) * (i + 1) * (i + 1);
        }
        int first_number = scanner.nextInt();
        int second_number = scanner.nextInt();
        System.out.printf("%d\n%d", arr[first_number - 1], arr[second_number - 1]);
        scanner.close();
    }
}
