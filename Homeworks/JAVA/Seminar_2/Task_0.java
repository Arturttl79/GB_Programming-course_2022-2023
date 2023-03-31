// Task_0
// public class Task_0 
// Посчитайте сколько драгоценных камней в куче обычных камней
// Пример:
// jewels = “aB”, stones = “aaaAbbbB”
// Результат в консоль ”a3B1”

package Homeworks.JAVA.Seminar_2;
import java.util.*;
public class Task_0 {
    public static Scanner sc = new Scanner(System.in);
    public static void main(String[] args) {
        String jewels = sc.nextLine();
        String stones = sc.nextLine();
        System.out.println(findJewelsInStones(jewels, stones));
    }

    public static String findJewelsInStones(String jewels, String stones) {
        StringBuilder str = new StringBuilder();
        String[] jewelsArr = jewels.split("");
        String[] stonesArr = stones.split("");
        for (int i = 0; i < jewelsArr.length; i++) {
            int jewelsCount = 0;
            for (int j = 0; j < stonesArr.length; j++) {
                if (jewelsArr[i].equals(stonesArr[j])) jewelsCount++;
            }
            str.append(jewelsArr[i] + String.valueOf(jewelsCount));
        }
        return String.valueOf(str);
    }
}
