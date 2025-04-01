package exercises;

import java.util.Scanner;

public class ex45 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int M = sc.nextInt();
        int D = sc.nextInt();

        String MO = "null";
        String MD = "null";
        String SE = "null";

        switch (M) {
            case 1 -> MO = "Styczeń";
            case 2 -> MO = "Luty";
            case 3 -> MO = "Marzec";
            case 4 -> MO = "Kwiecień";
            case 5 -> MO = "Maj";
            case 6 -> MO = "Czerwiec";
            case 7 -> MO = "Lipiec";
            case 8 -> MO = "Sierpień";
            case 9 -> MO = "Wrzesień";
            case 10 -> MO = "Październik";
            case 11 -> MO = "Listopad";
            case 12 -> MO = "Grudzień";
        }

        switch (D) {
            case 1 -> MD = "1";
            case 2 -> MD = "2";
            case 3 -> MD = "3";
            case 4 -> MD = "4";
            case 5 -> MD = "5";
            case 6 -> MD = "6";
            case 7 -> MD = "7";
            case 8 -> MD = "8";
            case 9 -> MD = "9";
            case 10 -> MD = "10";
            case 11 -> MD = "11";
            case 12 -> MD = "12";
            case 13 -> MD = "13";
            case 14 -> MD = "14";
            case 15 -> MD = "15";
            case 16 -> MD = "16";
            case 17 -> MD = "17";
            case 18 -> MD = "18";
            case 19 -> MD = "19";
            case 20 -> MD = "20";
            case 21 -> MD = "21";
            case 22 -> MD = "22";
            case 23 -> MD = "23";
            case 24 -> MD = "24";
            case 25 -> MD = "25";
            case 26 -> MD = "26";
            case 27 -> MD = "27";
            case 28 -> MD = "28";
            case 29 -> MD = "29";
            case 30 -> MD = "30";
            case 31 -> MD = "31";
        }

        switch (MO) {
            case "Marzec", "Kwiecień", "Maj", "Czerwiec" -> SE = "Wiosna";
            case "Lipiec", "Sierpień", "Wrzesień" -> SE = "Lato";
            case "Listopad", "Październik", "Grudzień" -> SE = "Jesień";
            case "Styczeń", "Luty" -> SE = "Zima";
        }

        System.out.println(SE + " " + MD + " " + MO);
    }
}
