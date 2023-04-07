package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_4;
import java.util.*;
public class Task_3 {
    // Дан Deque состоящий из последовательности цифр.
    // Необходимо проверить, что последовательность цифр является палиндромом
    public static void main(String[] args) {
        Deque<Integer> deque = new ArrayDeque<>(Arrays.asList(6,5,4,3,4,5,6));
        boolean res = true;
        for (int i = 0; i < deque.size() / 2; i ++) {
            int f = deque.pollFirst();
            int l = deque.pollLast();
            if (f != l) {
                res = false;
                break;
            }
        }
        System.out.println(res ? "Палиндром" : "Не палиндром");
    }
}
