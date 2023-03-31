// Дан список содержащий строки и числа в строковом формате.
// C помощью итератора пройти по списку и вывести в консоль что является строкой, а что числом

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_3;
import java.util.*;;
public class Task_4 {
    public static void printResultOfCheck(List<String> list){
        for (String element : list) {
            try {
                Integer.parseInt(element);
                System.out.println(element + " int");
            } catch (NumberFormatException e) {
                System.out.println(element + " String");
            }
        }
    }
    public static void main(String[] args) {
        List<String> list = new ArrayList<>(Arrays.asList("a", "2", "b", "3", "c", "4"));
        printResultOfCheck(list);
    }
}
