package packages.test;

public class AccessTest {
    public static void main(String[] args) {
        foundation f = new foundation();
        // System.out.println(f.var1); // private - not accessible
        // System.out.println(f.var2); // default - accessible only within same package
        System.out.println(f.var3);    // protected - accessible (same package)
        System.out.println(f.var4);    // public - accessible
    }
}