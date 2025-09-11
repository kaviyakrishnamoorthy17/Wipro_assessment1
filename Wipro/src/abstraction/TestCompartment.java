package abstraction;

import java.util.Random;

//Abstract class
abstract class Compartment {
 public abstract String notice();
}

//Derived classes
class FirstClass extends Compartment {
 public String notice() {
     return "This is First Class compartment.";
 }
}

class Ladies extends Compartment {
 public String notice() {
     return "This is Ladies compartment.";
 }
}

class General extends Compartment {
 public String notice() {
     return "This is General compartment.";
 }
}

class Luggage extends Compartment {
 public String notice() {
     return "This is Luggage compartment.";
 }
}

//Test class
public class TestCompartment {
 public static void main(String[] args) {
     Compartment[] compartments = new Compartment[10];
     Random rand = new Random();

     // Create random compartments
     for (int i = 0; i < compartments.length; i++) {
         int n = rand.nextInt(4) + 1; // random 1-4
         switch (n) {
             case 1: compartments[i] = new FirstClass(); break;
             case 2: compartments[i] = new Ladies(); break;
             case 3: compartments[i] = new General(); break;
             case 4: compartments[i] = new Luggage(); break;
         }
     }

     // Display notices (polymorphism)
     for (Compartment c : compartments) {
         System.out.println(c.notice());
     }
 }
}
