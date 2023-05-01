package StudentService;

import java.util.*;

import StudentDomain.Employee;
import StudentDomain.MeanAgeUser;
import StudentDomain.User;
import StudentDomain.UserComparator;

public class EmployeeService extends MeanAgeUser implements iUserService<Employee> {
    
    private int count;
    private List<Employee> employees;
    
    public EmployeeService() {
        this.employees = new ArrayList<>();
    }

    @Override
    public List<Employee> getAll() {
        return employees;
    }

    @Override
    public void create(String firstName, String lastName, int age) {
        Employee per = new Employee(firstName, lastName, age, count);
        count++;
        employees.add(per);
    }

    public List<Employee> getSortedByFIEmployeeGroup(List<Employee> employees) {
        List<Employee> emps = new ArrayList<>(employees);
        emps.sort(new UserComparator<>());
        return emps;
    }

    @Override
    public <T extends User> Double meanAge(T[] users) {
        return super.meanAge(users);
    }

    
}
