package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_5;

import java.util.*;

public class Task_1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        int n = scanner.nextInt();
        scanner.nextLine();
        String numbers = scanner.nextLine();
        String[] numbersArray = numbers.split(" ");
        List<Integer> list = new ArrayList<>();
        if (n == numbersArray.length) {
            for (int i = 0; i < n; i++) {
                if (list.contains(Integer.parseInt(numbersArray[i]))) {
                    continue;
                } else list.add(Integer.parseInt(numbersArray[i]));
            }
            System.out.println(list.size());
        } else System.out.println("Вы ввели неверное количество чисел");
    }
}
