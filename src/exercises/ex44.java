package exercises;

public class ex44 {
    public static void main(String[] args) {
        int a = 2;
        int b = 2;
        int c = 2;

        String msg = (a == b && b == c) ? "Equal integers." : "Not equal integers.";
        System.out.println(msg);
    }
}
