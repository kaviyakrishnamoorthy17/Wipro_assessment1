package packages.com.automobile.twowheeler;

import packages.com.automobile.Vehicle;


public class Honda extends Vehicle {
    public String getModelName() { return "Honda Bike"; }
    public String getRegistrationNumber() { return "TN02XY5678"; }
    public String getOwnerName() { return "Kumar"; }
    public int getSpeed() { return 90; }
    public void cdplayer() { System.out.println("CD Player Running"); }
}