package optionalclass;

import java.util.Optional;

public class Main2{
    public static void main(String[] args) {
        String address = null; // or some value
        System.out.println(Optional.ofNullable(address).orElse("India"));
    }
}
