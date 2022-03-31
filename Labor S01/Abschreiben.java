import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;

public class Abschreiben {

    public static void main(String[] args) {

        int anzahlschüler = Integer.parseInt(args[0]);
        cheat(anzahlschüler);

    }

    private static void cheat(int anzahlschüler) {

        int[] anzahlschülerArr = new int[anzahlschüler];
        int n = anzahlschüler;

        int simu = 1000000;
        int schnitt = 0;

        for (int i = 0; i < simu; i++) {
            for (int j = 0; j < n; j++) {
                anzahlschülerArr[j] = 0;
            }
            for (int j = 0; j < n; j++) {
                int k = 0;
                if (Math.random() > 0.5) {
                    k = j + 1;
                    if (k > n - 1) {
                        k = 0;
                    }
                } else {
                    k = j - 1;
                    if (k < 0) {
                        k = n - 1;
                    }
                }
                anzahlschülerArr[k]++;
            }
            for (int j = 0; j < n; j++) {
                if (anzahlschülerArr[j] > 0) {
                    schnitt++;
                }
            }
        }

        double newSchnitt = schnitt / (double) simu;
        double roundDouble = Math.round(newSchnitt * 100.00) / 100.00;
        DecimalFormatSymbols symbols = new DecimalFormatSymbols();
        symbols.setDecimalSeparator('.');
        DecimalFormat df = new DecimalFormat("0.00", symbols);

        System.out.println(df.format(roundDouble));
    }
}