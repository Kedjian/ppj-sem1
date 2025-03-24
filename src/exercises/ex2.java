package exercises;

public class ex2 {
    public static void main(String[] args) {
        int decimalVal = 165;
        int secondDecimalVal = 12;

        String binaryVal = Integer.toBinaryString(decimalVal);
        System.out.println(binaryVal);
        String hexVal = Integer.toHexString(decimalVal);
        System.out.println(hexVal);
        String octalVal = Integer.toOctalString(decimalVal);
        System.out.println(octalVal);

        String secondBinaryVal = Integer.toBinaryString(secondDecimalVal);
        System.out.println(secondBinaryVal);
        String secondHexVal = Integer.toHexString(decimalVal);
        System.out.println(secondHexVal);
        String secondOctalVal = Integer.toOctalString(secondDecimalVal);
        System.out.println(secondOctalVal);
    }
}
