package Collection.streamAPI;

import java.util.ArrayList;

class Employee {
    int empNo;
    String name;
    int age;
    String location;

    Employee(int empNo, String name, int age, String location) {
        this.empNo = empNo;
        this.name = name;
        this.age = age;
        this.location = location;
    }
    void printDetails() {
        System.out.println(empNo + " " + name + " " + age + " " + location);
    }
}

public class EmployeeFilter {
    public static void main(String[] args) {
        ArrayList<Employee> empList = new ArrayList<>();
        empList.add(new Employee(1, "Ram", 25, "Pune"));
        empList.add(new Employee(2, "Shyam", 32, "Mumbai"));
        empList.add(new Employee(3, "Geeta", 28, "Pune"));
        empList.add(new Employee(4, "Ravi", 30, "Delhi"));
        empList.add(new Employee(5, "Meena", 27, "Pune"));

        ArrayList<Employee> puneEmp = new ArrayList<>();
        for (Employee e : empList) {
            if (e.location.equals("Pune")) {
                puneEmp.add(e);
            }
        }

        System.out.println("Employees in Pune:");
        for (Employee e : puneEmp) {
            e.printDetails();
        }
    }
}
