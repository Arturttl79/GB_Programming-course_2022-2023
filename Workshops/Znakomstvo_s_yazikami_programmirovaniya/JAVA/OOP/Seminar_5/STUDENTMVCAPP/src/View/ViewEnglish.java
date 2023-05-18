package View;

import java.util.*;

import Controller.iGetView;
import Model.Student;

/* Вариант класса View на английском языке. 
- Считывает с консоли команды от пользователя. 
- Выводит список всех студентов в консоль */
public class ViewEnglish implements iGetView {

    /* Вывод в консоль */
    public void printAllStudent(HashMap<Long, Student> students) {
        System.out.println("---The list of students---");
        students.forEach((number, student) -> {
            System.out.println("Number of the student: " + number + ", student: " + student + ";");
        });
        System.out.println("---End of the list---\n");
    }

    /* Считывание данных с консоли */
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
