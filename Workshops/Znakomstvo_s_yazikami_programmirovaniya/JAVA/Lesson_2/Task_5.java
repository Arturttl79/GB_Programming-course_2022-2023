// Вводится строка, определите, каких символов в ней больше: цифр или букв? 
// Напоминаю, что знаки препинания и пробелы, например. не являются ни тем ни другим. 
// Если в строчке больше цифр, то выведите на экран слово "Digit", иначе выведите "Letter". 
// Если же их равное количество, то выведите слово "Equal".

// Sample Input:

// 34Hi56
// Sample Output:

// Digit

package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_2;
import java.util.Scanner;

public class Task_5 {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String text = scanner.nextLine();
        int digitCount = 0;
        int letterCount = 0;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isDigit(c)) {
                digitCount++;
            } else if (Character.isLetter(c)) {
                letterCount++;
            }
        }
        if (digitCount > letterCount) {
            System.out.println("Digit");
        } else if (letterCount > digitCount) {
            System.out.println("Letter");
        } else {
            System.out.println("Equal");
        }
        scanner.close();
    }
}

    // public static void main(String[] args) {
    //     char[] text = scanner.nextLine().toCharArray();
    //     int digits = 0;
    //     int letters = 0;
    //     for (int i = 0; i < text.length; i++) {
    //         if (Character.isDigit(text[i]) == true) digits++;
    //         if (Character.isLetter(text[i]) == true) letters++;
    //     }
    //     if (digits > letters) System.out.println("Digit");
    //     if (digits < letters) System.out.println("Letter");
    //     if (digits == letters) System.out.println("Equal");
    // }
