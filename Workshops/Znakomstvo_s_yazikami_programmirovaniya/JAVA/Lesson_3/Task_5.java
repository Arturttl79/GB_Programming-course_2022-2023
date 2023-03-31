package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_3;
import java.util.*;;
public class Task_5 {
    // Нужно удалить из него четные числа
    public static List<Integer> removeEvenValue(List<Integer> list) {
        List<Integer> list1 = new ArrayList<>();
        for(int i = 0; i < list.size(); i++){
            if(list.get(i) % 2 != 0) {
                list1.add(list.get(i));
            }
        }
        return list1;
    }
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(Collections.max(list));
        System.out.println(Collections.min(list));
        System.out.println(list.stream().mapToInt(Integer::intValue).average());
        System.out.println(removeEvenValue(list));
    }
}
