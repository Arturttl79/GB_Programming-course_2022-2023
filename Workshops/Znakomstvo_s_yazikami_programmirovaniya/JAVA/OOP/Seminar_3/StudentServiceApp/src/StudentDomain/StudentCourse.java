package StudentDomain;

import java.util.*;
/** Класс потока студентов. Имплементирует интерфейс Iterable*/
public class StudentCourse implements Iterable<StudentGroup> {
    
    /** Название списка групп студентов. Поле инкапсулировано. */
    private List<StudentGroup> groups;

    /**
     * Базовый конструктор класса "Поток студентов".
     * @param groups Название списка групп студентов
     */
    public StudentCourse(List<StudentGroup> groups) {
        this.groups = groups;
    }

    /** Геттер для получения списка групп студентов */
    public List<StudentGroup> getGroups() {
        return groups;
    }

    /** Сеттер для списка групп студентов */
    public void setGroups(List<StudentGroup> groups) {
        this.groups = groups;
    }

    /** Метод для итерирования групп студентов с анонимными функциями
     * hasNext() и next(). Переопределение метода: итератор.
     * Метод итератор нужен для использования методов foreach,
     * for в клиентском коде.
     */
    @Override
    public Iterator<StudentGroup> iterator() {
        return new Iterator<StudentGroup>() {
            private int index = 0;
            @Override
            public boolean hasNext() {
                return index < groups.size();
            }
            @Override
            public StudentGroup next() {
            if (!hasNext()) {
                return null;
            }
            return groups.get(index++);
            }
        };
    }
}
