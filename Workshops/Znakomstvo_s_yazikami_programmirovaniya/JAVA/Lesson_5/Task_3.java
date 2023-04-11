package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_5;
import java.util.*;
public class Task_3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        String numbers = scanner.nextLine();
        String[] numbersArray = numbers.split(" ");
        int count = 0;
        for (int i = 0; i < numbersArray.length - 1; i++) {
            for (int j = i + 1; j < numbersArray.length; j++) {
                if (numbersArray[i].equals(numbersArray[j])) count++;
            }
        }
        System.out.println(count);
    }
}
