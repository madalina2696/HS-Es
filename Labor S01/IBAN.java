import java.math.BigInteger;
import java.util.Scanner;

public class IBAN {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Kontonummer: ");
        String kontonummer = sc.next();

        System.out.print("BLZ: ");
        String blz = sc.next();

        System.out.print("IBAN: ");

        int lengthKN = kontonummer.length();
        if (lengthKN != 10) {
            int diff = 10 - lengthKN;
            String nulls = "";
            for (int i = 0; i < diff; i++) {
                nulls += 0;
            }
            String IBAN = "DE" + pruefzifferCalc(kontonummer, blz) + blz + nulls + kontonummer;

            for (int i = 0; i < IBAN.length(); i++) {
                if (i % 4 == 0 && i != 0) {
                    System.out.print(" ");
                }
                System.out.print(IBAN.charAt(i));
            }
        } else {
            String IBAN1 = "DE" + pruefzifferCalc(kontonummer, blz) + blz + kontonummer;

            for (int i = 0; i < IBAN1.length(); i++) {
                if (i % 4 == 0 && i != 0) {
                    System.out.print(" ");
                }
                System.out.print(IBAN1.charAt(i));
            }
        }
        sc.close();
    }

    public static BigInteger pruefzifferCalc(String kontonummer, String blz) {

        BigInteger w10P1 = BigInteger.valueOf(10);
        BigInteger w10P2 = BigInteger.valueOf(10);
        for (int i = 0; i < 9; i++) {
            w10P2 = w10P2.multiply(w10P1);
        }

        BigInteger a = BigInteger.valueOf(Integer.parseInt(blz));
        BigInteger b = BigInteger.valueOf(1000000);
        BigInteger c = BigInteger.valueOf(Integer.parseInt(kontonummer));
        BigInteger d = BigInteger.valueOf(131400); // DEpp
        BigInteger f = BigInteger.valueOf(97);
        BigInteger g = b.multiply(w10P2);
        BigInteger h = BigInteger.valueOf(98);

        BigInteger summe = h.subtract(d.add(c.multiply(b).add(a.multiply(g))).mod(f));

        return summe;
    }
}