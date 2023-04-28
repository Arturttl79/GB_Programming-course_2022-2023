package StudentDomain;

public class Teacher extends User {
    
    private String subject;
    private long teacherID;

    public Teacher(String fName, String lName, int age, String subject, long ID) {
        super(fName, lName, age);
        this.subject = subject;
        this.teacherID = ID;
    }

    public String getSubject() {
        return subject;
    }

    public long getTeacherID() {
        return teacherID;
    }

    public void setSubject(String subject) {
        this.subject = subject;
    }

    public void setTeacherID(long teacherID) {
        this.teacherID = teacherID;
    }

    @Override
    public String toString() {
        return "Teacher (firstName = " + super.getFirstName() + ", lastName = " + super.getLastName() + 
        ", age = " + super.getAge() + ", subject = " + subject + ", teacherID = " + teacherID + ")";
    }   
}
