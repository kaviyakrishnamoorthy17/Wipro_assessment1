package array_programs;
public class OnlyOneOrFour {
    public static void main(String[] args) {
        int[] arr = {1, 4, 1, 4};
        boolean only = true;

        for (int num : arr) {
            if (num != 1 && num != 4) {
                only = false;
                break;
            }
        }

        System.out.println(only);
    }
}
