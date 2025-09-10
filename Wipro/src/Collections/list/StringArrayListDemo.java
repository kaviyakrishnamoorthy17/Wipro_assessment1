package Collections.list;

import java.util.ArrayList;
import java.util.Iterator;

public class StringArrayListDemo {
    public static void main(String[] args) {
        ArrayList<String> strList = new ArrayList<>();
        strList.add("Apple");
        strList.add("Banana");
        strList.add("Mango");

        printAll(strList);
    }

    public static void printAll(ArrayList<String> list) {
        Iterator<String> it = list.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}
