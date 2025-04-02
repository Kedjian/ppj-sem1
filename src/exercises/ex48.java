package exercises;

public class ex48 {
    public static void main(String[] args) {
        double inf = Double.POSITIVE_INFINITY;
        double negInf = (inf * -1);
        int var = -11;

        boolean check1 = false;
        boolean check2 = false;

        if (var > -15 && var < -10) {
            check1 = true;
        }

        if (var > negInf && var < -13) {
            check2 = true;
        }

        if (check1 && !check2) {
            System.out.println("Check 1 true.");
        }

        if (check2 && !check1) {
            System.out.println("Check 2 true.");
        }
    }
}
