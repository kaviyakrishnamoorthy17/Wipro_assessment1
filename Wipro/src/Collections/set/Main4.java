package Collections.set;

import java.util.*;

public class Main4
{
    public static void main(String[] args) {
        // Create a TreeSet to store String objects
        TreeSet<String> ts = new TreeSet<>();

        // Add some elements
        ts.add("Apple");
        ts.add("Orange");
        ts.add("Banana");
        ts.add("Grapes");
        ts.add("Mango");

        // a) Reverse the elements of the Collection
        System.out.println("TreeSet in reverse order:");
        Iterator<String> revItr = ts.descendingIterator();
        while (revItr.hasNext()) {
            System.out.println(revItr.next());
        }

        // b) Iterate the elements of the TreeSet using Iterator
        System.out.println("\nTreeSet in natural (sorted) order:");
        Iterator<String> itr = ts.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next());
        }

        // c) Check if a particular element exists
        String search = "Mango";
        if (ts.contains(search)) {
            System.out.println("\nElement '" + search + "' exists in the TreeSet.");
        } else {
            System.out.println("\nElement '" + search + "' does not exist in the TreeSet.");
        }
    }
}
