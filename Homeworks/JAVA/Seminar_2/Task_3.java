//Напишите программу, которая принимает с консоли число в формате byte и записывает его в файл ”result.txt”.
//Требуется перехватить все возможные ошибки и вывести их в логгер.
//После написания, попробуйте подать на вход числа 100 и 200 и проследите разницу в результате

package Homeworks.JAVA.Seminar_2;
import java.util.Scanner;
import java.io.*;
import java.util.logging.*;
public class Task_3 {
    public static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args) throws Exception {
        Logger log = Logger.getLogger(Task_3.class.getName());
        log.setLevel(Level.INFO);
        log.info("Пользователь выполнил вход.");
        String pathProject = System.getProperty("user.dir");
        String pathFile = pathProject.concat("/Homeworks/JAVA/Seminar_2/file.txt");
        File f3 = new File(pathFile);
        try {
            byte number = scanner.nextByte();
            FileWriter fw = new FileWriter(f3, true);
            fw.write(String.valueOf(number) + '\n');
            fw.close();
        } catch (Exception e) {
            e.printStackTrace(); // TODO: handle exception
            log.info(e.getMessage());
            // fw.append(ex.getMessage());
        }
        BufferedReader br = new BufferedReader(new FileReader(f3));
        String str;
        while ((str = br.readLine()) != null) {
            System.out.printf("== %s ==\n", str);
        }
        br.close();
        log.info("Выход.");
    }
}
