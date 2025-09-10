package iostream;

import java.io.*;
import java.util.Date;

class Employee implements Serializable {
    private String name;
    private Date dateOfBirth;
    private String department;
    private String designation;
    private double salary;

    // No-arg constructor
    public Employee() {}

    // Parameterized constructor
    public Employee(String name, Date dob, String dept, String desg, double salary) {
        this.name = name;
        this.dateOfBirth = dob;
        this.department = dept;
        this.designation = desg;
        this.salary = salary;
    }

    // Getters
    public String getName() { return name; }
    public Date getDateOfBirth() { return dateOfBirth; }
    public String getDepartment() { return department; }
    public String getDesignation() { return designation; }
    public double getSalary() { return salary; }
}

public class Main4 {
    public static void main(String[] args) {
        String file = "data";

        // Create an Employee object
        Employee emp = new Employee("Anitha", new Date(100, 4, 15), "IT", "Engineer", 60000);

        // Serialize (write to file)
        try (ObjectOutputStream out = new ObjectOutputStream(new FileOutputStream(file))) {
            out.writeObject(emp);
            System.out.println("Employee object saved in file.");
        } catch (Exception e) { e.printStackTrace(); }

        // Deserialize (read from file)
        try (ObjectInputStream in = new ObjectInputStream(new FileInputStream(file))) {
            Employee e = (Employee) in.readObject();
            System.out.println("Name: " + e.getName());
            System.out.println("DOB: " + e.getDateOfBirth());
            System.out.println("Department: " + e.getDepartment());
            System.out.println("Designation: " + e.getDesignation());
            System.out.println("Salary: " + e.getSalary());
        } catch (Exception e) { e.printStackTrace(); }
    }
}

