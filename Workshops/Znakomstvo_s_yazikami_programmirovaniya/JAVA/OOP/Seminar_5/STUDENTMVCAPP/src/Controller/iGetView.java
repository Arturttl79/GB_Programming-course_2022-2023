package Controller;

import java.util.*;
import Model.Student;

public interface iGetView {
    //void printAllStudent(List<Student> students);
    /* Отобразить студентов */
    void printAllStudent(HashMap<Long, Student> students);
    /* Считывание данных с консоли */
    String prompt(String message);
}
