package packages.com.automobile.twowheeler;

public class TestTwoWheeler {
    public static void main(String[] args) {
        Hero h = new Hero();
        System.out.println(h.getModelName() + " owned by " + h.getOwnerName() + ", Speed: " + h.getSpeed());
        h.radio();

        Honda ho = new Honda();
        System.out.println(ho.getModelName() + " owned by " + ho.getOwnerName() + ", Speed: " + ho.getSpeed());
        ho.cdplayer();
    }
}