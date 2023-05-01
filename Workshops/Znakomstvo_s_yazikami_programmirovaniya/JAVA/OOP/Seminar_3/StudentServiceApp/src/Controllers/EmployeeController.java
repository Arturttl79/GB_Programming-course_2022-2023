package Controllers;

import StudentDomain.Employee;
import StudentDomain.User;
import StudentService.EmployeeService;

public class EmployeeController implements iUserController<Employee> {

    private final EmployeeService empService = new EmployeeService();

    @Override
    public void create(String firstName, String lastName, int age) {
        empService.create(firstName, lastName, age);
    }

    static public <T extends Employee> void paySalary(T person) {
        System.out.println(((User) person).getFirstName() + " зп 10000р ");
    }

    static public <T extends Number> Double mean(T[] num) {
        double sum = 0.0;
        for (int i = 0; i < num.length; i++) {
            sum += num[i].doubleValue();
        }
        sum = sum / num.length;
        return sum;
    }
}
