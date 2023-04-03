// Пусть дан произвольный список целых чисел, удалить из него чётные числа

package Homeworks.JAVA.Seminar_3;
import java.util.*;
public class Task_2 {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(removeEvenValue(list));
    }
    public static List<Integer> removeEvenValue(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < list.size(); i++) {
            if(list.get(i) % 2 != 0) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }
}
