package optionalclass;


import java.util.Optional;

//User-defined exception
class InvalidEmployeeException extends Exception {
 public InvalidEmployeeException(String message) {
     super(message);
 }
}

//Employee class
class Employee {
 String name;
 Employee(String name) { this.name = name; }
}

public class Main3 {
 public static void main(String[] args) throws InvalidEmployeeException {
     Employee emp = null; // could be null

     // Using Optional to check and throw exception
     Employee validEmp = Optional.ofNullable(emp)
                                 .orElseThrow(() -> new InvalidEmployeeException("Employee is invalid"));

     System.out.println("Employee is valid: " + validEmp.name);
 }
}
