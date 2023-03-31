// Напишите программу, которая считает натуральное число n c клавиатуры и создаст список, в котором будут хранится 
// строковые представления чисел от 0 до n-1. Затем программа считывает число m (m <= n) и строку s. Вставьте строку s 
// на позицию m. Выведите список на экран через пробел.  

// Sample Input:

// 5
// 2
// Строка
// Sample Output:

// 0 1 Строка 2 3 4


package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_3;
import java.util.*;;
public class Task_2 {
    public static Scanner iScanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = iScanner.nextInt();
        List<String> listInt = new ArrayList<>();
        for (int i = 0; i < n; i++){
            listInt.add(String.valueOf(i));
        }
        System.out.println(listInt);
        int m = iScanner.nextInt();
        String s = iScanner.next();
        listInt.add(m, s);
        System.out.println(listInt);
    }
}
