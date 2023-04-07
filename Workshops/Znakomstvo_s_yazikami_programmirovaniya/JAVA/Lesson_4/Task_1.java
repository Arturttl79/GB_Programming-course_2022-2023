// Task_1
// Очередь
// Напишите программу, которая реализует структуру данных очередь, используя список.

// Условие задачи таково: пользователь листает список музыки и добавляет в плейлист 
// понравившиеся ему композиции. Когда песня доигрывает, включается следующая.
//  Вам необходимо вывести на экран через пробел композиции, которые будут играть далее.

// Сначала вводится число n - количество запросов к вашей программе. 
// Каждый из запросов будет иметь один следующих видов:

// push <Название трека> - добавляет трек в плейлист
// pop - удаляет из плейлиста первый трек. При этом на экран выводится запись вида "воспроизводится <название трека>"
// После выполнения всех запросов выведите оставшиеся в очереди треки. Гарантируется, что название трека состоит из одного слова.

// Sample Input:

// 4
// push Трек1
// push Трек3
// pop
// push ТрекТрек
// Sample Output:

// воспроизводится Трек1
// Трек3 ТрекТрек

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_4;
import java.util.*;
public class Task_1 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) {
        // List<String> musicList = new ArrayList<>(Arrays.asList("Трек1", "Трек2", "Трек3", "Трек4", "Трек5", "Трек6"));
        int n = scanner.nextInt();
        List<String> playlist = new ArrayList<>();
        for (int i = 0; i < n; i++) { 
            String str = scanner.next();
            if (str.equals("push")) {
                String str1 = scanner.next();
                playlist.add(str1);
            } else if (str.equals("pop")) {
                System.out.println("Воспроизводится " + playlist.remove(0));
            }
        }
        System.out.println(playlist);
    }
}