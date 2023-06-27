// public class Task_6 {

//     //Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//     //Требуется перехватить все возможные ошибки и вывести их в логгер.
//     //
//     //После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате
//     public static void main(String[] args) {

//     }

//     public String findJewelsInStones(String jewels, String stones){
        
//         return "";
//     }

// }
package Workshops.Znakomstvo_s_yazikami_programmirovaniya.JAVA.Lesson_2;
import java.util.Scanner;
import java.io.*;
public class Task_6 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/file.txt");
        File f3 = new File(pathFile);
        System.out.println(f3.getAbsolutePath());
        byte number = scanner.nextByte();
        try (FileWriter fw = new FileWriter("Workshops/Znakomstvo_s_yazikami_programmirovaniya/JAVA/Lesson_2/result.txt", true)) {
            fw.write(String.valueOf(number) + '\n');
        } catch (IOException ex) {
            System.out.println(ex.getMessage());
        }
        BufferedReader br = new BufferedReader(new FileReader("Workshops/Znakomstvo_s_yazikami_programmirovaniya/JAVA/Lesson_2/result.txt"));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
    }
    
}
