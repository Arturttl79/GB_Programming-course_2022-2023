package StudentDomain;

public class Employee extends User {
    
    private int empId;

    public Employee(String firstName, String lastName, int age, int empId) {
        super(firstName, lastName, age);
        this.empId = empId;
    }

    public int getEmpId() {
        return empId;
    }

    public void setEmpId(int empId) {
        this.empId = empId;
    }
    
}
