// Дан список с десятью случайными числами, нужно отсортировать

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_3;
import java.util.*;;
public class Task_3 {
    public static List<Integer> sortByCollections(List<Integer> list){
        list.sort(null);
        return list;
    }

    public static List<Integer> sortByComparator(List<Integer> list){
        list.sort(Collections.reverseOrder());
        return list;
    }
    
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>(Arrays.asList(1, 9, 2, 6, 4, 3, 5, 7, 8, 0));
        System.out.println(sortByCollections(list));
        System.out.println(sortByComparator(list));
    }
}
