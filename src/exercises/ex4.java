package exercises;

public class ex4 {
    public static void main(String[] args) {
        int i = 10;
        i = i++; // i equals to 10
        System.out.println(i);
        i = ++i; // i equals to 11
        System.out.println(i);
        i = i++ + ++i; // i equals (11 + 1) + (11 + 1)
        System.out.println(i);
    }
}
