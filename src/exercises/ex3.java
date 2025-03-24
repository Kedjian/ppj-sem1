package exercises;

public class ex3 {
    public static void main(String[] args) {
        boolean var = true;
        var = false;

        byte byteMaxVal = 127;
        byte byteMinVal = -128;

        short shortMaxVal = 32767;
        short shortMinVal = -32768;

        long longMaxVal = 9223372036854775807L;
        long longMinVal = -9223372036854775807L - 1;

        float floatMaxVal = 3.14159265f;
        float floatMinVal = -3.14159265f;

        double doubleMaxVal = 3.14159265;
        double doubleMinVal = -3.14159265;

        char aChar = 'a';

        // binary min and max values for int
        int valBinaryMax = 0b1111111111111111111111111111111;
        System.out.println(valBinaryMax);
        int valBinaryMin = -0b10000000000000000000000000000000;
        System.out.println(valBinaryMin);

        // hexadecimal min and max values for int
        int valHexMax = 0x7FFFFFFF;
        System.out.println(valHexMax);
        int valHexMin = -0x80000000;
        System.out.println(valHexMin);

        // octal min and max values for int
        int valOctalMax = 017777777777;
        System.out.println(valOctalMax);
        int valOctalMin = -020000000000;
        System.out.println(valOctalMin);
    }
}
