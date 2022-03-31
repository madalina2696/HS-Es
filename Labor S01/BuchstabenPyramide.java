import java.util.Scanner;

public class BuchstabenPyramide {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Buchstabe: ");
        String letter = sc.next().toUpperCase();

        pyramid(letter);

        sc.close();

    }

    private static void pyramid(String letter) {

        String alphabet = "ABCDEFGHIJKALMNOPQRSTUVWXYZ";

        int row = alphabet.indexOf(letter);

        if (row < 11) {
            row += 1;
        } else {
            row = alphabet.indexOf(letter);
        }

        for (int i = 1; i <= row; i++) { //Zeilen
            for (int j = 1; j <= row - i; j++) {
                System.out.print(" ");
            }
            for (int j = 1; j <= i; j++) { //linke Hälfte
                System.out.print((char) (j + 64));
            }
            for (int j = i - 1; j >= 1; j--) { //rechte Hälfte
                System.out.print((char) (j + 64));
            }
            System.out.println(); //Reihen
        }
    }
}