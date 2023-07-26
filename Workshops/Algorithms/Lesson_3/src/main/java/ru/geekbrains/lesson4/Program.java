package ru.geekbrains.lesson4;

public class Program {

    public static void main(String[] args) {

        LinkedList<Employee> linkedList = new LinkedList<>();
        linkedList.addFirst(new Employee("FFFF", 34));
        linkedList.addFirst(new Employee("AAAAA", 45));
        linkedList.addFirst(new Employee("CCCCC", 44));
        linkedList.addFirst(new Employee("AAAAA", 22));
        linkedList.addFirst(new Employee("MMMMMM", 18));
        linkedList.addFirst(new Employee("AAAAA", 55));

        // System.out.println();
        // System.out.println(linkedList);

        // linkedList.sort(new EmployeeComparator(SortDirect.Ascending));
        // System.out.println();
        // System.out.println(linkedList);

        // linkedList.sort(new EmployeeComparator(SortDirect.Descending));
        // System.out.println();
        // System.out.println(linkedList);

        // linkedList.removeFirst();
        // linkedList.removeLast();
        System.out.println();
        System.out.println("List of employees:");
        System.out.println(linkedList);

        System.out.println();
        System.out.println("Reverted list of employees:");
        linkedList.revertList();
        System.out.println(linkedList);

        LinkedList<Employee> invertedList = linkedList.revertListAlternative();
        System.out.println("Reverted list of employees with alternative method:");
        System.out.println(invertedList);

        linkedList = invertedList.revertListAlternative();
        System.out.println("Back to previous list of employees from alternative method:");
        System.out.println(linkedList);
    }

}
