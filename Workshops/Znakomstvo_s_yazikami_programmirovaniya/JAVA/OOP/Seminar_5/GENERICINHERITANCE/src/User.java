public class User<T, V> {
    private T firstName;
    private T lastName;
    private V age;

    public User(T firstName, T lastName, V age) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
    }

    public T getFirstName() {
        return firstName;
    }

    public void setFirstName(T firstName) {
        this.firstName = firstName;
    }

    public T getLastName() {
        return lastName;
    }

    public void setLastName(T lastName) {
        this.lastName = lastName;
    }

    public V getAge() {
        return age;
    }

    public void setAge(V age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User (firstName = " + firstName + ", lastName = " + lastName + ", age = " + age + ")";
    }
}
