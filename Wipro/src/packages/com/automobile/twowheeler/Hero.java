package packages.com.automobile.twowheeler;

import packages.com.automobile.Vehicle;


public class Hero extends Vehicle {
    public String getModelName() { return "Hero Bike"; }
    public String getRegistrationNumber() { return "TN01AB1234"; }
    public String getOwnerName() { return "Ravi"; }
    public int getSpeed() { return 80; }
    public void radio() { System.out.println("Radio is ON"); }
}