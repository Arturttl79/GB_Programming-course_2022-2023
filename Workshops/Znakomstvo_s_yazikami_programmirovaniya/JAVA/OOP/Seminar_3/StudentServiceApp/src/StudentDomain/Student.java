package StudentDomain;

public class Student extends User implements Comparable<Student> {
    
    private long studID;

    public Student(String firstName, String lastName, int age, long studID) {
        super(firstName, lastName, age);
        this.studID = studID;
    }

    public long getStudID() {
        return studID;
    }

    public void setStudID(long studID) {
        this.studID = studID;
    }

    @Override
    public String toString() {
        return "Student (firstName = " + super.getFirstName() + ", lastName = " + super.getLastName() + ", age = " + super.getAge() + ", studID = " + studID + ")";
    }

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
