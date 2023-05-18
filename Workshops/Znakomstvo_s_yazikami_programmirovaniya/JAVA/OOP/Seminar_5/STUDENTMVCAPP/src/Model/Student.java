package Model;

/* Чтобы можно было сортировать студентов, имплементируем к классу  интерфейс Comparable */
public class Student extends User implements Comparable<Student> {
    /* К полям родителя (имя, фамилия, возраст) добавляем id студента */
    private long studID;

    /* Конструктор */
    public Student(String firstName, String lastName, int age, long studID) {
        super(firstName, lastName, age); // Вызываем конструктор родителя для определения значений полей
        this.studID = studID; // ID студента
    }

    /* Геттер. ID студента */
    public long getStudID() {
        return studID;
    }

    /* Сеттер. ID студента */
    public void setStudID(long studID) {
        this.studID = studID;
    }

    /* Переопределяем метод вывода информации о студенте */
    @Override
    public String toString() {
        return "Student (firstName = " + super.getFirstName() + ", lastName = " + super.getLastName() + ", age = " + super.getAge() + ", studID = " + studID + ")";
    }

    /* Переопределяем метод сравнения */
    @Override
    public int compareTo(Student o) {
        if (super.getAge() == o.getAge()) {
            if (this.getStudID() == o.getStudID()) {
                return 0;
            }
            if (this.getStudID() < o.getStudID()) {
                return -1;
            }
            return 1;
        }
        if (super.getAge() < o.getAge()) {
            return -1;
        }
        return 1;
    }
}
