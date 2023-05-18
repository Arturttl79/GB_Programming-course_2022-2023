import java.util.*;

/** Класс группы студентов. Имплементирует интерфейсы Iterable и Comparable */
public class StudentGroup<T,V,S extends Comparable<S>> implements Iterable<Student<T,V,S>> {
    
    /** Название списка студентов. Поле инкапсулировано. */
    private List<Student<T,V,S>> students;
    public static int count = 1;

    /**
     * Базовый конструктор класса "Группа студентов".
     * @param students Название списка студентов в группе
     */
    public StudentGroup(List<Student<T,V,S>> students) {
        this.students = students;
    }

    /** Геттер для получения списка студентов */
    public List<Student<T,V,S>> getStudents() {
        return students;
    }

    /** Сеттер для списка студентов */
    public void setStudents(List<Student<T,V,S>> students) {
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
    public Iterator<Student<T,V,S>> iterator() {
        return new Iterator<Student<T,V,S>>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < students.size();
            }
            @Override
            public Student<T,V,S> next() {
            if (!hasNext()) {
                return null;
            }
            return students.get(index++);
            }
        };
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
