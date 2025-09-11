package Collections.map;

import java.util.*;

public class ContactList {
    public static void main(String[] args) {
        HashMap<String, Integer> contacts = new HashMap<>();
        contacts.put("Alice", 1234567890);
        contacts.put("Bob", 987654321);

        // a) Check key
        System.out.println("Contains key 'Alice'? " + contacts.containsKey("Alice"));

        // b) Check value
        System.out.println("Contains value 987654321? " + contacts.containsValue(987654321));

        // c) Use Iterator
        Iterator<Map.Entry<String, Integer>> it = contacts.entrySet().iterator();
        while (it.hasNext()) {
            Map.Entry<String, Integer> entry = it.next();
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }
}
