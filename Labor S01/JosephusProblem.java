import java.util.ArrayList;
import java.util.Scanner;

public class JosephusProblem {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Anzahl der Personen: ");
        int personen = sc.nextInt();

        System.out.print("Schrittgröße: ");
        int schritte = sc.nextInt();

        jp(personen, schritte);

        sc.close();
    }

    private static void jp(int personen, int schritte) {

        int pos = schritte - 1;

        ArrayList<Integer> teilnehmerArrayList = new ArrayList<Integer>();

        for (int i = 0; i < personen; i++) {
            teilnehmerArrayList.add(i + 1);
        }

        while (!(teilnehmerArrayList.isEmpty())) {
            System.out.println(teilnehmerArrayList.remove(pos));
            personen = personen - 1;
            if (personen > 0) {
                pos = (pos + schritte - 1) % personen;
            }
        }
    }

}
