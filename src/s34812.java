import java.util.Scanner;

public class s34812 {
    public static void main(String[] args) {
        int[] variablesex62 = new int[10];

        for (int i = 0; i < variablesex62.length; i++) {
            double randomNumber = Math.random() < 0.5 ? 0 : 1;
            variablesex62[i] = (int) randomNumber;
        }

        int zeroAmount = 0;
        int oneAmount = 0;

        for (int variable : variablesex62) {
            if (variable == 0) {
                zeroAmount++;
            } else {
                oneAmount++;
            }
            System.out.print(" " + variable);
        }
    }
}
