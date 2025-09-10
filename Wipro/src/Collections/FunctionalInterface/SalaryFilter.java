package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Predicate;

class Employee2 {
    private int id;
    private String name;
    private double salary;
    Employee2(int id, String name, double salary) {
        this.id = id; this.name = name; this.salary = salary;
    }
    public double getSalary() { return salary; }
    public String getName() { return name; }
}

public class SalaryFilter {
    public static void main(String[] args) {
        ArrayList<Employee2> list = new ArrayList<>();
        list.add(new Employee2(1, "Amit", 8000));
        list.add(new Employee2(2, "Nita", 12000));
        list.add(new Employee2(3, "Raju", 9500));
        list.add(new Employee2(4, "Sara", 30000));
        list.add(new Employee2(5, "Bob", 7000));

        Predicate<Employee2> salaryLess = e -> e.getSalary() < 10000;

        for (Employee2 e : list) {
            if (salaryLess.test(e)) {
                System.out.println(e.getName() + " has salary less than 10000");
            }
        }
    }
}
