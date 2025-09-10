package collections.set;

import java.util.Iterator;
import java.util.TreeSet;

public class Main5
{
    public static void main(String[] args) {
        // Create a TreeSet to store employee names (sorted automatically)
        TreeSet<String> employeeSet = new TreeSet<>();

        // Add employee names
        employeeSet.add("Anitha");
        employeeSet.add("Manoj");
        employeeSet.add("Harish");
        employeeSet.add("Sureka");
        employeeSet.add("Janani");
        employeeSet.add("Katari");

        // Retrieve elements one by one using Iterator
        System.out.println("Employee names (sorted):");
        Iterator<String> itr = employeeSet.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }
    }
}
