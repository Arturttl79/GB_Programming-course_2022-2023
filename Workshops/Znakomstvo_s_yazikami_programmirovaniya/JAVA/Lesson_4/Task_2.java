package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_4;
import java.util.*;
public class Task_2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        List<String> playlist = new ArrayList<>();
        for (int i = 0; i < n; i++) { 
            String str = scanner.next();
            if (str.equals("push")) {
                String str1 = scanner.next();
                playlist.add(str1);
            } else if (str.equals("pop")) {
                System.out.println("Петя взял  " + playlist.remove(playlist.size() - 1));
            }
        }
        System.out.println(playlist);
    }
}
