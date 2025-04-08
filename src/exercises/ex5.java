package exercises;

public class ex5 {
    public static void main(String[] args) {
        int K = 987654321;
        String s = "";
        while (K != 0) {
            int cyfra = K % 10;
            s = s + cyfra;
            K = K / 10;
        }
        System.out.println(s);

        // the algorithm above reverses the K integer
        // and puts it into the s String

        // I tested it for different integer values, and it
        // works well with any positive numbers, but gets
        // clunky with negative values

        // the attempt to reverse: -987654321 prints out s: -1-2-3-4-5-6-7-8-9
    }
}
