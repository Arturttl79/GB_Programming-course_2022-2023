// Формат входных данных:
// На первой строке вводится любимая буква Маши, на второй - Олега. Затем вводится строка, 
// в которой перечислены слова, которые написаны в газете.

// Формат выходных данных:
// На первой строчке выведите, сколько слов выписала Маша, а на второй - сколько слов выписал Олег.  

// Sample Input:

// а
// в
// Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда
// Sample Output:

// 7
// 5

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_2;
import java.util.Scanner;
public class Task_2 {
    public static void main(String[] args) {
        String str = "Автокатастрофа анклав вилка Ванна Шкаф Вагон Азов веранда";
        Scanner sc = new Scanner(System.in);
        String masha = sc.next();
        String oleg = sc.next();
        String[] arr = str.split(" ");
        int mashaCnt = 0;
        int olegCnt = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i].indexOf(masha) != -1) {
                mashaCnt ++;
            }
            if (arr[i].indexOf(oleg) != -1) {
                olegCnt ++;
            }
        }
        System.out.println(mashaCnt + " " + olegCnt);
        sc.close();
    }
}
