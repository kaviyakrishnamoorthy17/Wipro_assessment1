package interfaces.demo;

public class Car implements Vehicle, FourWheeler {
    @Override
    public void message() {
        Vehicle.super.message(); // call Vehicle's default method
    }

    public static void main(String[] args) {
        Car c = new Car();
        c.message();
    }
}