package Controllers;

import StudentDomain.Student;
// import StudentService.StudentGroupService;
import StudentService.StudentService;

public class StudentController implements iUserController<Student> {

    private final StudentService studentDataService = new StudentService();
    // private final StudentGroupService groupService = new StudentGroupService();

    @Override
    public void create(String firstName, String lastName, int age) {
        studentDataService.create(firstName, lastName, age);
    }
    
}
