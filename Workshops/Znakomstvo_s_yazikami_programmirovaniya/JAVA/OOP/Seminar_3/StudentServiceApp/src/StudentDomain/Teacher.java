package StudentDomain;

public class Teacher extends User {
    
    private String subject;
    private int teacherId;
    private String academicDegree;

    public Teacher(String fName, String lName, int age, String subject, int teacherId, String academicDegree) {
        super(fName, lName, age);
        this.subject = subject;
        this.teacherId = teacherId;
        this.academicDegree = academicDegree;
    }

    public String getSubject() {
        return subject;
    }

    public int getTeacherId() {
        return teacherId;
    }

    public String getAcademicDegree() {
        return academicDegree;
    }
    
    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTeacherId(int teacherId) {
        this.teacherId = teacherId;
    }

    public void setAcademicDegree(String academicDegree) {
        this.academicDegree = academicDegree;
    }  
    
    @Override
    public String toString() {
        return "Teacher (firstName = " + super.getFirstName() + ", lastName = " + super.getLastName() + 
        ", age = " + super.getAge() + ", subject = " + subject + ", teacherID = " + teacherId + ")";
    } 
}
