package inheritance;

class Animal {
    void eat() {
        System.out.println("Animal is eating...");
    }
    void sleep() {
        System.out.println("Animal is sleeping...");
    }
}

class Bird extends Animal {
    @Override
    void eat() {
        System.out.println("Bird is pecking food...");
    }
    @Override
    void sleep() {
        System.out.println("Bird is sleeping in the nest...");
    }
    void fly() {
        System.out.println("Bird is flying...");
    }
}

public class Main {
    public static void main(String[] args) {
        // Animal object
        Animal a = new Animal();
        a.eat();
        a.sleep();

        System.out.println();

        // Bird object
        Bird b = new Bird();
        b.eat();
        b.sleep();
        b.fly();
    }
}
