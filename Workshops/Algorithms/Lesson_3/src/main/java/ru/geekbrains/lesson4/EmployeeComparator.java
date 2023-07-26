package ru.geekbrains.lesson4;

import java.util.Comparator;

public class EmployeeComparator implements Comparator<Employee> {

    private SortDirect sortDirect;

    public EmployeeComparator(SortDirect sortDirect) {
        this.sortDirect = sortDirect;
    }

    @Override
    public int compare(Employee o1, Employee o2) {
        int res = sortDirect == SortDirect.Ascending ? o1.getName().compareTo(o2.getName()) :
                o2.getName().compareTo(o1.getName());
        if (res == 0){
           return sortDirect == SortDirect.Ascending ? Integer.compare(o1.getAge(), o2.getAge()) :
                   Integer.compare(o2.getAge(), o1.getAge());
        }
        return res;
    }

}
