package Collections.map;

import java.util.*;

public class PropertiesExample {
    public static void main(String[] args) {
        Properties props = new Properties();
        props.setProperty("Maharashtra", "Mumbai");
        props.setProperty("Karnataka", "Bengaluru");
        props.setProperty("Tamil Nadu", "Chennai");

        // Use Iterator
        Set<Object> keys = props.keySet();
        Iterator<Object> it = keys.iterator();
        while (it.hasNext()) {
            String state = (String) it.next();
            System.out.println("State: " + state + ", Capital: " + props.getProperty(state));
        }
    }
}
