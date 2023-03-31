// Вам дается строка S и целочисленный массив индексов int index[s.length].
// Напишите программу, которая перетасует символы в S таким образом,
// что символ c i-й позиции переместится на индекс index[i] в результирующей строке.
//
// Пример: s = “cba”, index = [3,2,1] result “abc”

package Homeworks.JAVA.Seminar_2;
import java.util.*;
public class Task_1 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String s = sc.nextLine();
        int[] index = new int[s.length()];
        for (int i = 0; i < index.length; i++) {
            index[i] = sc.nextInt();
        }
        System.out.println(shuffle(s, index));
    }

    public static String shuffle(final String s, final int[] index) {
        StringBuilder str = new StringBuilder();
        for (int item : index) {
            str.append(s.charAt(item - 1));
        }
        return String.valueOf(str);
    }
}
