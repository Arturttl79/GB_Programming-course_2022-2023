package StudentService;

import java.util.*;

import StudentDomain.Student;
import StudentDomain.StudentGroup;
import StudentDomain.UserComparator;

public class StudentGroupService {
    
    private List<StudentGroup> groups;

    public StudentGroupService() {
        this.groups = new ArrayList<>();
    }
    
    public List<StudentGroup> getAll() {
        return this.groups;
    }

    public List<Student> getSortedByFIStudentGroup(int numberGroup) {
        List<Student> students = new ArrayList<>(groups.get(numberGroup).getStudents());
        students.sort(new UserComparator<>());
        return students;
    }
}
