package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_5;
import java.util.*;
public class Task_4 {
    public static void main(String[] args) {
        HashMap<String, String> map = new HashMap<>(Map.of(
            "Penza", "Murmansk",    
            "Moskva", "Samara",
            "Samara", "Kursk",
            "Kursk", "Penza"
        ));
        for (Map.Entry<String, String> item : map.entrySet()) {
            if(map.containsKey(item.getValue())) {
                continue;
            } else System.out.println(item.getValue());
        }
    }
}
