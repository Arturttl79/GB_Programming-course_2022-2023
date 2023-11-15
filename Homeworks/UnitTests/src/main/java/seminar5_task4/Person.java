package seminar5_task4;

public class Person {

    private String name;
    private boolean isTeacher;

    public Person(String name, boolean isTeacher) {
        this.name = name;
        this.isTeacher = isTeacher;
    }

    public String getName() {
        return name;
    }

    public boolean isTeacher() {
        return isTeacher;
    }
}