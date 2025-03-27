package exercises;

public class ex31 {
    public static void main(String[] args) {
        boolean var = true;
        int num1 = 5;
        double num2 = 3.14;
        long num3 = 5;
        char ch1 = 'A';
        String str1 = "abc";

        // BOOLEAN COMPARISONS
        System.out.println(var == var);
        /// System.out.println(var == num1);
        System.out.println(num1 == num2);
        System.out.println(num3 == num3);
        System.out.println(ch1 == ch1);
        /// System.out.println(var == str1);

        // NUM COMPARISONS
        /// System.out.println(num1 == var);
        System.out.println(num1 == num2);
        System.out.println(num3 == num2);
        System.out.println(num2 == ch1);
        /// System.out.println(num3 == str1);

        // CHAR COMPARISONS
        /// System.out.println(ch1 == var);
        System.out.println(ch1 == num1);
        System.out.println(ch1 == num2);
        System.out.println(ch1 == num3);
        /// System.out.println(ch1 == str1);

        // STRING COMPARISONS
        /// System.out.println(str1 == var);
        /// System.out.println(str1 == num1);
        /// System.out.println(str1 == num2);
        /// System.out.println(str1 == num3);
        /// System.out.println(str1 == ch1);
        System.out.println(str1 == str1);
    }
}
