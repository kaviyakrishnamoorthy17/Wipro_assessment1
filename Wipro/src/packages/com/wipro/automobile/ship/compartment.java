package packages.com.wipro.automobile.ship;

public class compartment {
    int height, width, breadth;

    public compartment(int h, int w, int b) {
        height = h;
        width = w;
        breadth = b;
    }

    public void display() {
        System.out.println("Height: " + height + ", Width: " + width + ", Breadth: " + breadth);
    }
}