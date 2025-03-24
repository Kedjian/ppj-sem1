package exercises;

public class ex22 {
    public static void main(String[] args) {
        int val = 14;

        System.out.println("After shifting 0 positions to the right: " + val + ".");

        int twoLeftShift = val << 2;
        System.out.println("After shifting 2 positions to the left: " + twoLeftShift + ".");

        int fourRightShift = val >> 4;
        System.out.println("After shifting 4 positions to the right: " + fourRightShift + ".");
    }
}
