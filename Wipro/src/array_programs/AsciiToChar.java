package array_programs;

public class AsciiToChar {
	public static void main(String[] args) {
        int[] ascii = {72, 97, 114, 105, 110, 105}; // H a r i n i

        for (int val : ascii) {
            System.out.print((char) val);
        }
    }
}
