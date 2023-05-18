package Controller;

import java.util.*;
import Model.Student;

public interface iGetModel {
    /* Геттер. Получить всех студентов */
    public HashMap<Long, Student> getAllStudent();
    /* Удалить студента по номеру */
    public void removeStudentByNumber(Long numberOfStud);
}
