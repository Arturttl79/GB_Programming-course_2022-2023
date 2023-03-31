// Дана строка, в которой через пробел перечислены цифры. На следующей строке вводится цифра. 
// Определите индексы первого и последнего её вхождения.

// Sample Input:

// 4 5 3 5 2 6 4 6 6 8 1 2 3 8 4 0 9 7
// 4
// Sample Output:

// 0
// 28

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_2;
import java.util.Scanner;
public class Task_1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String str = sc.nextLine();
        int n = sc.nextInt();
        System.out.print(str.indexOf(String.valueOf(n)) + " " + str.lastIndexOf(String.valueOf(n)));
        sc.close();
    }
}
