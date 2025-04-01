package exercises;

public class ex43 {
    public static void main(String[] args) {
        // simplify (!(a < b) && !(a > b))

        int a = 2;
        int b = 2;

        if (a == b) {
            System.out.println("See? That's easier!");
        }

        // !(x < y) translates to: IT IS NOT true that x is less than y
        // mathematically speaking, that's like saying x >= y

        // !(x > y) translates to: IT IS NOT true that x is greater than y
        // mathematically speaking, that's like saying x <= y

        // if both conditions need to be true then
        ///     x cannot be less than y
        // while at the same time
        ///     x cannot be greater than y
        // which translates to their equality
    }
}
