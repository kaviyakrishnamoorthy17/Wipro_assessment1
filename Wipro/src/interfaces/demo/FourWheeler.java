package interfaces.demo;

public interface FourWheeler {
    default void message() {
        System.out.println("Inside FourWheeler");
    }
}