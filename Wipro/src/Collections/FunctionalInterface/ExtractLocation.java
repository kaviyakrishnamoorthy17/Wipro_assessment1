package Collections.FunctionalInterface;

import java.util.*;
import java.util.function.Function;

class Employee {
    int id;
    String name, location;
    double salary;
    Employee(int id, String name, String location, double salary) {
        this.id = id;
        this.name = name;
        this.location = location;
        this.salary = salary;
    }
}

public class ExtractLocation {
    public static void main(String[] args) {
        ArrayList<Employee> list = new ArrayList<>();
        list.add(new Employee(1, "Ram", "Pune", 50000));
        list.add(new Employee(2, "Shyam", "Mumbai", 70000));
        list.add(new Employee(3, "Geeta", "Delhi", 65000));
        list.add(new Employee(4, "Ravi", "Pune", 55000));
        list.add(new Employee(5, "Meena", "Chennai", 48000));

        Function<Employee, String> getLocation = e -> e.location;

        ArrayList<String> locations = new ArrayList<>();
        for (Employee e : list) {
            locations.add(getLocation.apply(e));
        }
        System.out.println("Locations: " + locations);
    }
}
