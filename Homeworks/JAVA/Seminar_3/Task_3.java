// Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.

package Homeworks.JAVA.Seminar_3;
import java.util.*;
public class Task_3 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(list.stream().mapToInt(Integer::intValue).average());
    }
}
