package overriding;

class Fruit {
    String name, taste, size;

    Fruit(String name, String taste, String size) {
        this.name = name;
        this.taste = taste;
        this.size = size;
    }

    void eat() {
        System.out.println("Eating " + name + " which tastes " + taste);
    }
}

class Apple extends Fruit {
    Apple(String size) {
        super("Apple", "sweet", size);
    }

    @Override
    void eat() {
        System.out.println("Eating an apple. It is " + taste + " and juicy!");
    }
}

class Orange extends Fruit {
    Orange(String size) {
        super("Orange", "sour", size);
    }

    @Override
    void eat() {
        System.out.println("Eating an orange. It is " + taste + " and refreshing!");
    }
}

public class Main {
    public static void main(String[] args) {
        Fruit f = new Fruit("Mango", "sweet", "medium");
        f.eat();

        Apple a = new Apple("small");
        a.eat();

        Orange o = new Orange("medium");
        o.eat();
    }
}

