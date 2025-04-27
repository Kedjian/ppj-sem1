package exercises;

public class ex65 {
    public static void main(String[] args) {
        int[] tab = { 789, 678, 567 };

        for (int i = 0; i < tab.length; i++)
            for (int j = i; i < tab.length; j++)
                System.out.print(tab[i] - tab[j]);

        // out of bounds
    }
}
