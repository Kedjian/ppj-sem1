package exercises;

public class ex23 {
    public static void main(String[] args) {
        int var = 0x12345678;
        System.out.println("A num: " + var);

        int last5Bites = var & 0b11111;
        System.out.println("Last 5 bites: " + last5Bites);

        int seventhBit = (var >> 6) & 1;
        System.out.println("7 bit: " + seventhBit);

        int bit1 = (var >> 24) & 0xFF;
        int bit2 = (var >> 16) & 0xFF;
        int bit3 = (var >> 8) & 0xFF;
        int bit4 = var & 0xFF;
        System.out.println("Bits: " + bit1 + " " + bit2 + " " + bit3 + " " + bit4);
    }
}
