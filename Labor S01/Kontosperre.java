import java.util.Scanner;

public class Kontosperre {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int counter = 0;
        int versuch;

        while (counter < 3) {
            switch (counter) {
                case 0:
                    System.out.print("PIN: ");
                    versuch = sc.nextInt();
                    if (pin(versuch)) {
                        System.out.println("Erfolgreich");
                        counter = 3;
                    } else {
                        counter += 1;
                        System.out.println(counter + " Versuch fehlgeschlagen");
                    }
                    break;
                case 1:
                    System.out.print("PIN: ");
                    versuch = sc.nextInt();
                    if (pin(versuch)) {
                        System.out.println("Erfolgreich");
                        counter = 3;
                    } else {
                        counter += 1;
                        System.out.println(counter + " Versuch fehlgeschlagen");
                    }
                    break;
                case 2:
                    System.out.print("PIN: ");
                    versuch = sc.nextInt();
                    if (pin(versuch)) {
                        System.out.println("Erfolgreich");
                        counter = 3;
                    } else {
                        counter += 1;
                        System.out.println("Konto gesperrt. Bitte am Bankschalter melden.");
                    }
                    break;
            }
        }
    sc.close();
    }

    private static boolean pin(int n) {
        boolean pinBoolean = false;
        int correctPin = 1234;

        if (n == correctPin) {
            pinBoolean = true;
        }

        return pinBoolean;
    }
}