package View;

import java.util.*;
import java.util.Scanner;

import Controller.iGetView;
import Model.Student;

/* Считывает с консоли команды от пользователя. Выводит список всех студентов в консоль */
public class View implements iGetView {
    
    // public void printAllStudents(List<Student> students) {
    //     System.out.println("---Вывод списка студентов---");
    //     for (Student student : students) {
    //         System.out.println(student);
    //     }
    //     System.out.println("---Конец списка---");
    // }

    /* Вывод в консоль */
    public void printAllStudent(HashMap<Long, Student> students) {
        System.out.println("---Вывод списка студентов---");
        students.forEach((number, student) -> {
            System.out.println("Номер студента: " + number + ", студент: " + student + ";");
        });
        System.out.println("---Конец списка---");
    }

    /* Считывание данных с консоли */
    public String prompt(String message) {
        Scanner in = new Scanner(System.in);
        System.out.println(message);
        return in.nextLine();
    }
}
