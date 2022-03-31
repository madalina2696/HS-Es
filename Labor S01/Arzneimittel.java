import java.util.Scanner;

public class Arzneimittel {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        double konzentration = sc.nextDouble();
        double untergrenze = sc.nextDouble();
        double abnahme = sc.nextDouble();

        System.out.println("Konzentration (mg): " + konzentration);
        System.out.println("Untergrenze (mg): " + untergrenze);
        System.out.println("Abnahme (%/Monat): " + abnahme);

        haltbarkeit(konzentration, untergrenze, abnahme);

        sc.close();
    }

    private static void haltbarkeit(double konzentration, double untergrenze, double abnahme) {

        int monate = 0; //initialisiert
        double n; //deklariert

        while (konzentration >= untergrenze) {
            n = konzentration * (abnahme / 100);
            konzentration -= n;
            monate += 1;
        }
        System.out.println("Haltbarkeit: " + monate + " Monate");
    }
}