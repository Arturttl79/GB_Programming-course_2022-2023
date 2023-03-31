// Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором первый и последний 
// элементы будут равны строчке 1, а между ними будет n 0. Выведите список на экран через пробел.  

// Sample Input:

// 3
// Sample Output:

// 1 0 0 0 1

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_3;
import java.util.*;
public class Task_1 {
    public static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = iScanner.nextInt();
        List<Integer> listInt = new ArrayList<>();
        listInt.add(1);
        for (int i = 0; i < n; i++){
            listInt.add(0);
        }
        listInt.add(1);
        System.out.println(listInt);
    }
}
