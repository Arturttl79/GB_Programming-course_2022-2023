package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_5;
import java.util.*;
public class Task_2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        String numbers = scanner.nextLine();
        String[] numbersArray = numbers.split(" ");
        HashSet<Integer> list = new HashSet<>();
        if (n == numbersArray.length) {
            for (int i = 0; i < n; i++) {
                if (list.add(Integer.parseInt(numbersArray[i])) == true) {
                    list.add(Integer.parseInt(numbersArray[i]));
                    System.out.println("NO");
                } else System.out.println("YES");
            }
        } else System.out.println("Вы ввели неверное количество чисел");
    }
}
