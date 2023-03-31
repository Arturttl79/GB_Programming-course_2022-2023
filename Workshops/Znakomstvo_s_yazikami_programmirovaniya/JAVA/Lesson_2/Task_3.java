// Для того чтобы выходить в Интернет, каждому компьютеру присваивается так называемый IP-адрес. 
// Он состоит из четырех целых чисел в диапазоне от 0 до 255, разделенных точками. 
// В следующих трех строках показаны три правильных IP-адреса:

// 127.0.0.0
// 192.168.0.01
// 255.00.255.255
// Напишите программу, которая определяет, является ли заданная строка правильным IP-адресом.
// Входные данные
// На вход программе подается строка длиной не более 15 символов, которая включает цифры и точки.

// Выходные данные
// Если строка является правильным IP-адресом, необходимо вывести YES, иначе NO.

// Примечание:
// У вас не получится просто так взять и создать строку, которая содержит точку. Иначе говоря строчка кода:

// String s = ".";
// просто на просто не сработает. Точнее сработает неверно. Для корректного создания строки, содержащей точку используйте 
// экранирование.

// String s = "\\.";
// Sample Input 1:

// 192.168.1.2
// Sample Output 1:

// YES
// Sample Input 2:

// 192.11.690.0
// Sample Output 2:

// NO
// Sample Input 3:

// 67.67.67
// Sample Output 3:

// NO

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_2;

import java.util.Scanner;

public class Task_3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String ipAdress = sc.next();
        Boolean flag = true;
        String[] nums = ipAdress.split("\\.");
        if (nums.length != 4) flag = false;
        for (int i = 0; i < nums.length; i++) {
            int num = Integer.parseInt(nums[i]);
            if (num < 0 || num > 255) flag = false;
        }
        System.out.println(flag ? "YES" : "NO");
        sc.close();    
        }
}

// public class java3 {

//     public static boolean validate(final String ip) {
//         String PATTERN = "^((0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)\\.){3}(0|1\\d?\\d?|2[0-4]?\\d?|25[0-5]?|[3-9]\\d?)$";
//         return ip.matches(PATTERN);
//     }

//     private static Scanner scan = new Scanner(System.in);
//     public static void main(String[] args) {
//         System.out.println("enter IP-address:");
//         String ip = scan.nextLine();
        
//         if (validate(ip)) {
//             System.out.println("YES");
//         } else {
//             System.out.println("NO");
//         }
//     }
// }