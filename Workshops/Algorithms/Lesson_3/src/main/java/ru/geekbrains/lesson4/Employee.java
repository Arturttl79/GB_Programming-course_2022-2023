package ru.geekbrains.lesson4;

public class Employee {

    private String name;
    private int age;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public Employee(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " - " + age;
    }

    @Override
    public boolean equals(Object obj) {
        if(this == obj)
            return true;
        if (obj instanceof Employee){
            Employee employee = (Employee) obj;
            if (name.equals(employee.name) && age == employee.age)
                return true;
        }
        return false;
    }
}
