package exercises;

public class ex46 {
    public static void main(String[] args) {
        double myVar = 5.27;
        double inf = Double.POSITIVE_INFINITY;
        double negInf = (inf * -1);

        if (myVar > 0 && myVar < 1) {
            System.out.println("C");
        } else if (myVar > 0 && myVar < inf) {
            System.out.println("A");
        } else {
            System.out.println("B");
        }
    }
}
