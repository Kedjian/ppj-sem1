package exercises;

public class ex61 {
    public static void main(String[] args) {
        int[] variables = new int[10];

        for (int i = 0; i < variables.length; i++) {
            double randomNumber = Math.random() < 0.5 ? 0 : 1;
            variables[i] = (int) randomNumber;
        }

        for (int variable : variables) {
            System.out.print(" " + variable);
        }
    }
}
