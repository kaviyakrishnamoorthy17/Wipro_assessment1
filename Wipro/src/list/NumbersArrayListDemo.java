package list;

import java.util.ArrayList;

public class NumbersArrayListDemo {
    public static void main(String[] args) {
        ArrayList<Integer> numList = new ArrayList<Integer>();
        numList.add(10);
        numList.add(20);
        numList.add(30);
        for (int num : numList) {
            System.out.println(num);
        }
    }
}
