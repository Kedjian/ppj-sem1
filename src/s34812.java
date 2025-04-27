import java.util.Scanner;

public class s34812 {
    public static void main(String[] args) {
        double[] varArray = {0, 0, 0, 0, 0, 0, 0, 0, 0, 0};

        int max = 10;
        int min = 1;
        int range = max - min + 1;

        for (int i = 0; i < varArray.length; i++) {
            double rand = (Math.random() * range) + min;
            varArray[i] = rand;
        }

        System.out.println(" ");

        for (double v : varArray) {
            System.out.print(v + " ");
        }

        System.out.println(" ");

        for (int i = 0; i < varArray.length; i++) {
            if (checkIfEven(i)) {
                System.out.print(varArray[i] + " ");
            } else {
                System.out.print("");
            }
        }

        System.out.println(" ");

        for (double v : varArray) {
            int iteratedNum = (int) v;
            if (!checkIfEven(iteratedNum)) {
                System.out.print(iteratedNum + " ");
            } else {
                System.out.print("");
            }
        }
    }

    public static boolean checkIfEven(double number) {
        return number % 2 == 0;
    }
}
