package StudentDomain;

import java.util.*;

/** Класс группы студентов. Имплементирует интерфейсы Iterable и Comparable */
public class StudentGroup implements Iterable<Student>, Comparable<StudentGroup> {
    
    /** Название списка студентов. Поле инкапсулировано. */
    private List<Student> students;
    public static int count = 1;

    /**
     * Базовый конструктор класса "Группа студентов".
     * @param students Название списка студентов в группе
     */
    public StudentGroup(List<Student> students) {
        this.students = students;
    }

    /** Геттер для получения списка студентов */
    public List<Student> getStudents() {
        return students;
    }

    /** Сеттер для списка студентов */
    public void setStudents(List<Student> students) {
        this.students = students;
    }

    // @Override
    // public Iterator<Student> iterator() {
    //     return new StudentGroupIterator(students);
    // }

    /** Метод для итерирования студентов с анонимными функциями
     * hasNext() и next(). Переопределение метода: итератор.
     * Метод итератор нужен для использования методов foreach,
     * for в клиентском коде.
     */
    @Override
    public Iterator<Student> iterator() {
        return new Iterator<Student>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < students.size();
            }
            @Override
            public Student next() {
            if (!hasNext()) {
                return null;
            }
            return students.get(index++);
            }
        };
    }

    /** Метод для сравнения по количеству студентов в группе. 
     * Переопределение метода: "сравнение".
     * Метод "сравнение" нужен для использования метода sort в клиентском коде. 
     */
    @Override
    public int compareTo(StudentGroup o) {
        if (this.students.size() == o.getStudents().size()) {
            return 0;
        }
        if (this.students.size() < o.getStudents().size()) {
            return -1;
        }
        return 1;
    }

    /** переопределяем метод toString для группы студентов.
     * students.get(0).getStudID() добавлено для указания 
     * названия группы с помощью ID первого студента в группе.
     */
    @Override
    public String toString() {
        return "\nStudentGroup " + students.get(0).getStudID() + " {" + students + "}";
    }
    
}
