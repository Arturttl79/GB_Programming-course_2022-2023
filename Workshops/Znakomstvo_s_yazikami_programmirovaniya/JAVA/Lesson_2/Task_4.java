// Вводится строчка текста, затем, на следующей строке, одна буква латинского алфавита. 
// Найдите, сколько раз в тексте встречается введённый символ в любом регистре. 
// Учтите, что цифры не имеют разницы в записи нижнего и верхнего регистров.

// Sample Input:
// Good morning my dear friend. My fish.
// m
// Sample Output:
// 3


package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_2;
import java.util.Scanner;
public class Task_4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine().toLowerCase();
        String letter = sc.nextLine().toLowerCase();
        int cnt = 0;
        String[] words = text.split(" ");
        for (int i = 0; i < words.length; i++) {
            if (words[i].indexOf(letter) != -1) {
                cnt ++;
            }
        }
        System.out.println(cnt);
        sc.close();
    }
}
