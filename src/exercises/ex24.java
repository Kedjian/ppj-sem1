package exercises;

public class ex24 {
    public static void main(String[] args) {
        int a1 = 0x6D, a2 = (a1 & 0b1111), a = a1 & a2,
                b1 = 0xA, b2 = (b1 | 0b1111), b = b1 | b2,
                c1 = 11 << 2, c2 = (c1 ^ 0b101010), c = c1 ^ c2;

        System.out.println(a); // equals to 13
        System.out.println(b); // equals to 15
        System.out.println(c); // equals to 42
    }
}
