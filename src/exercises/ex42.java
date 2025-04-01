package exercises;

public class ex42 {
    public static void main(String[] args) {
        int varInt = 4;
        double varDouble = -1.0;
        if (varInt > 0)
            if (varDouble > 0)
                System.out.println("Here I am!");
            else
                System.out.println("No, I am here!!");
        System.out.println("No, actually, I am here!!");

        // first of all, this code is barely readable.
        // we should use parentheses when programming in java.

        // since varInt is bigger than 0, we follow to the second if.
        // the second if goes to else, because varDouble is of a negative value.
        // as a result we get "No, I am here!!" message from the 9th line.
        // after that, we get "No, actually, I am here!!" from the 10th line.
    }
}
