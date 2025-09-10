package wrapperclass;

class Employee implements Cloneable {
    int id;
    String name;
    double salary;

    Employee(int id, String name, double salary) {
        this.id = id;
        this.name = name;
        this.salary = salary;
    }

    @Override
    public String toString() {
        return "Employee [ID=" + id + ", Name=" + name + ", Salary=" + salary + "]";
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }
}

public class EmployeeClone {
    public static void main(String[] args) {
        try {
            Employee emp1 = new Employee(101, "Harini", 50000);
            Employee emp2 = (Employee) emp1.clone();

            System.out.println("Before Modification:");
            System.out.println("Original: " + emp1);
            System.out.println("Clone: " + emp2);

            // Modify original object
            emp1.name = "Sri Harini";
            emp1.salary = 60000;

            System.out.println("\nAfter Modification:");
            System.out.println("Original: " + emp1);
            System.out.println("Clone: " + emp2);
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
    }
}
