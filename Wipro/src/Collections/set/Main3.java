package Collections.set;

import java.util.HashSet;
import java.util.Iterator;

public class Main3 {
    public static void main(String[] args) {
        // Create a HashSet to store employee names
        HashSet<String> employeeSet = new HashSet<>();

        // Add employee names
        employeeSet.add("Anitha");
        employeeSet.add("Manoj");
        employeeSet.add("Harish");
        employeeSet.add("Sureka");
        employeeSet.add("Janani");
        employeeSet.add("Katari");

        // Retrieve elements using Iterator
        System.out.println("Employee names:");
        Iterator<String> itr = employeeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
