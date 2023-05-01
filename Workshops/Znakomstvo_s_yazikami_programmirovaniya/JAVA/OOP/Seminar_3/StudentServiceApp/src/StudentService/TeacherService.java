package StudentService;

import java.util.*;

import StudentDomain.MeanAgeUser;
import StudentDomain.Teacher;
import StudentDomain.User;
import StudentDomain.UserComparator;

/** Базовый класс TeacherService. Имплементирует интерфейс iUserService */
public class TeacherService extends MeanAgeUser implements iUserService<Teacher> {
    
    /** Поле для подсчета созданных экземпляров класса. Поле инкапсулировано. */
    private int count;
    /** Поле списка учителей */
    private List<Teacher> teachers;

    /** Базовый конструктор класса "TeacherService" */
    public TeacherService() {
        this.teachers = new ArrayList<>();
    }

    /** Переопределенный метод для создания экземпляра класса Teacher */
    @Override
    public void create(String firstName, String lastName, int age) {
        String subject = new String();
        String academicDegree = new String();
        Teacher teacher = new Teacher(firstName, lastName, age, subject, count, academicDegree);
        count++;
        teachers.add(teacher);
    }

    /** Переопределенный метод для получения списка всех учителей */
    @Override
    public List<Teacher> getAll() {
        return teachers;
    }

    /**
     * Метод для сортировки списка учителей по фамилии / имени
     * @param teachers список учителей для сортировки
     * @return получаем новый отсортированный список учителей
     */
    public List<Teacher> getSortedByFITeacherGroup(List<Teacher> teachers) {
        List<Teacher> tcs = new ArrayList<>(teachers);
        tcs.sort(new UserComparator<>());
        return tcs;
    }

    /** Переопределенный метод для вычисления среднего возраста учителей */
    @Override
    public <T extends User> Double meanAge(T[] users) {
        return super.meanAge(users);
    }
}
