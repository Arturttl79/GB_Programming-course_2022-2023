package StudentService;

import java.util.*;

import StudentDomain.MeanAgeUser;
import StudentDomain.Student;
import StudentDomain.User;
import StudentDomain.UserComparator;

public class StudentService extends MeanAgeUser implements iUserService<Student> {
    private int count;
    private List<Student> students;
    
    public StudentService() {
        this.students = new ArrayList<>();
    }

    @Override
    public List<Student> getAll() {
        return students;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Student per = new Student(firstName, lastName, age, count);
        count++;
        students.add(per); 
    }

    @Override
    public <T extends User> Double meanAge(T[] users) {
        return super.meanAge(users);
    }

    public List<Student> getSortedByFIStudentGroup(List<Student> students) {
        List<Student> studs = new ArrayList<>(students);
        studs.sort(new UserComparator<>());
        return studs;
    }
}
