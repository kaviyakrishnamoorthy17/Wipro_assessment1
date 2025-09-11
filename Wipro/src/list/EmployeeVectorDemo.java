package list;

import java.util.*;

class Employee {
    int empId;
    String name;
    float salary;

    Employee(int empId, String name, float salary) {
        this.empId = empId;
        this.name = name;
        this.salary = salary;
    }
    public String toString() {
        return empId + " " + name + " " + salary;
    }
}

public class EmployeeVectorDemo {
    public static void main(String[] args) {
        Vector<Employee> vec = new Vector<>();
        vec.add(new Employee(1, "Alice", 50000));
        vec.add(new Employee(2, "Bob", 60000));

        System.out.println("Iterator:");
        Iterator<Employee> it = vec.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }

        System.out.println("Enumeration:");
        Enumeration<Employee> en = vec.elements();
        while (en.hasMoreElements()) {
            System.out.println(en.nextElement());
        }
    }
}
