package optionalclass;

import java.util.Optional;

public class Main1 {
    public static void main(String[] args) {
        String[] names = new String[5];
        int length = Optional.ofNullable(names[0]).map(String::length).orElse(0);
        System.out.println(length);
    }
}
