package exercises;

public class ex47 {
    public static void main(String[] args) {
        double inf = Double.POSITIVE_INFINITY;
        double negInf = (inf * -1);
        int var = -14;

        boolean check1 = false;
        boolean check2 = false;
        boolean check3 = false;

        if (var > -15 && var <= -10) {
            if (var > -5 && var < 0) {
                if (var > 5 && var < 10) {
                    check1 = true;
                }
            }
        }

        if (var > negInf && var <= -13) {
            if (var > -8 && var < -3) {
                check2 = true;
            }
        }

        if (var >= -4 && var < inf) {
            check3 = true;
        }

        if (check1 && check2 && check3) {
            System.out.println("Var belongs to the intersection of the sets.");
        } else {
            System.out.println("Var does not belong to the intersection of the sets.");
        }
    }
}
