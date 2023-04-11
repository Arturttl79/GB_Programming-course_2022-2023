// Пусть дан список сотрудников:
// Иван Иванов
// Светлана Петрова
// Кристина Белова
// Анна Мусина
// Анна Крутова
// Иван Юрин
// Петр Лыков
// Павел Чернов
// Петр Чернышов
// Мария Федорова
// Марина Светлова
// Мария Савина
// Мария Рыкова
// Марина Лугова
// Анна Владимирова
// Иван Мечников
// Петр Петин
// Иван Ежов
// Написать программу, которая найдёт и выведет повторяющиеся имена с количеством повторений. 
// Отсортировать по убыванию популярности.
package Homeworks.JAVA.Seminar_5;
import java.util.*;
public class Task_2 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // HashMap<String, List<String>> peopleByName = new HashMap<>();
        // List<String> fullName = new ArrayList<>(Arrays.asList("Иван Иванов", "Светлана Петрова", "Кристина Белова", 
        // "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков", "Павел Чернов", "Петр Чернышов", "Мария Федорова",
        // "Марина Светлова", "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова", "Иван Мечников",
        // "Петр Петин", "Иван Ежов"));
        // fullName.sort();
        // System.out.println(fullName);
        String[] employees = {"Иван Иванов", "Светлана Петрова", "Кристина Белова",
                "Анна Мусина", "Анна Крутова", "Иван Юрин", "Петр Лыков",
                "Павел Чернов", "Петр Чернышов", "Мария Федорова", "Марина Светлова",
                "Мария Савина", "Мария Рыкова", "Марина Лугова", "Анна Владимирова",
                "Иван Мечников", "Петр Петин", "Иван Ежов"};

        Map<String, Integer> countMap = new HashMap<>();
        for (String employee : employees) {
            countMap.put(employee, countMap.getOrDefault(employee, 0) + 1);
        }

        List<Map.Entry<String, Integer>> sortedList = new ArrayList<>(countMap.entrySet());
        sortedList.sort(Collections.reverseOrder(Map.Entry.comparingByValue()));
        System.out.println(sortedList);

        for (Map.Entry<String, Integer> entry : sortedList) {
            if (entry.getValue() > 1) {
                System.out.println(entry.getKey() + " - " + entry.getValue());
            }
        }
    }
}
