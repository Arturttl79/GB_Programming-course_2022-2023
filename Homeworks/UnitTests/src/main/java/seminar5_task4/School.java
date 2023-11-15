package seminar5_task4;

import java.util.ArrayList;
import java.util.List;

public class School {

    private List<Person> people = new ArrayList<>();

    public void addPerson(Person person) {
        people.add(person);
    }

    public boolean isTeacherInSchool(String teacherName) {
        for (Person person : people) {
            if (person.isTeacher() && person.getName().equals(teacherName)) {
                return true;
            }
        }
        return false;
    }

    public boolean isStudentInSchool(String studentName) {
        for (Person person : people) {
            if (!person.isTeacher() && person.getName().equals(studentName)) {
                return true;
            }
        }
        return false;
    }
}