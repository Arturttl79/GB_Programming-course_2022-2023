package Model;

public class User {
    private String firstName;
    private String lastName;
    private int age;

    /* Конструктор */
    public User(String firstName, String lastName, int age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    /* Геттер - имя */
    public String getFirstName() {
        return firstName;
    }

    /* Сеттер - имя */
    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    /* Геттер - фамилия */
    public String getLastName() {
        return lastName;
    }

    /* Сеттер - фамилия */
    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    /* Геттер - возраст */
    public int getAge() {
        return age;
    }

    /* Сеттер - возраст */
    public void setAge(int age) {
        this.age = age;
    }

    /* Переопределяем метод вывода информации о юзере */
    @Override
    public String toString() {
        return "User (firstName = " + firstName + ", lastName = " + lastName + ", age = " + age + ")";
    }
}
