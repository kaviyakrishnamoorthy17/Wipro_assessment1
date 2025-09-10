package inheritance;

class Person {
    String name;
    Person(String name) { this.name = name; }
}

class Employee extends Person {
    double annualSalary;
    int yearStartedWork;
    String nationalInsuranceNumber;

    Employee(String name, double annualSalary, int yearStartedWork, String nationalInsuranceNumber) {
        super(name);
        this.annualSalary = annualSalary;
        this.yearStartedWork = yearStartedWork;
        this.nationalInsuranceNumber = nationalInsuranceNumber;
    }
}

public class Main2 {
    public static void main(String[] args) {
        Employee emp = new Employee("Alice", 60000, 2020, "AB123456C");

        System.out.println("Name: " + emp.name);
        System.out.println("Annual Salary: $" + emp.annualSalary);
        System.out.println("Year Started Work: " + emp.yearStartedWork);
        System.out.println("National Insurance Number: " + emp.nationalInsuranceNumber);
    }
}
