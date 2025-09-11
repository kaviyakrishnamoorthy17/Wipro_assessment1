package list;

import java.util.ArrayList;

public class EmployeeManagement {
    
    // Inner Employee class
    static class Employee {
        int empId;
        String empName;
        String email;
        String gender;
        float salary;

        Employee(int id, String name, String email, String gender, float salary) {
            this.empId = id;
            this.empName = name;
            this.email = email;
            this.gender = gender;
            this.salary = salary;
        }

        void getEmployeeDetails() {
            System.out.println(empId + " " + empName + " " + email + " " + gender + " " + salary);
        }
    }
    
    // List to store Employee objects
    private ArrayList<Employee> list = new ArrayList<>();

    // Add Employee
    public boolean addEmployee(Employee e) {
        return list.add(e);
    }

    // Delete Employee by empId
    public boolean deleteEmployee(int empId) {
        return list.removeIf(emp -> emp.empId == empId);
    }

    // Show PaySlip for given empId
    public String showPaySlip(int empId) {
        for (Employee emp : list) {
            if (emp.empId == empId) {
                return "PaySlip for " + emp.empName + ": " + emp.salary;
            }
        }
        return "Employee not found";
    }

    // Print details of all employees
    public void printAllEmployeeDetails() {
        for (Employee emp : list) {
            emp.getEmployeeDetails();
        }
    }

    // Main method to test the program
    public static void main(String[] args) {
        EmployeeManagement db = new EmployeeManagement();

        db.addEmployee(new Employee(101, "Alice", "alice@mail.com", "F", 50000));
        db.addEmployee(new Employee(102, "Bob", "bob@mail.com", "M", 55000));

        System.out.println("All Employees:");
        db.printAllEmployeeDetails();

        System.out.println(db.showPaySlip(101));

        db.deleteEmployee(101);

        System.out.println("After deletion:");
        db.printAllEmployeeDetails();
    }
}
