public class Konverter {

    public static void main(String[] args) {


        int hourEU = Integer.parseInt(args[0]);
        int hourUS;

        if (hourEU <= 11 && hourEU > 0) {
            hourUS = hourEU;
            System.out.println(hourUS + " a.m.");

        } else if (hourEU >= 13 && hourEU <= 23) {
            hourUS = hourEU - 12;
            System.out.println(hourUS + " p.m.");

        } else if (hourEU == 0) {
            hourUS = 12;
            System.out.println(hourUS + " a.m.");

        } else if (hourEU == 12) {
            hourUS = 12;
            System.out.println(hourUS + " p.m.");

        } else {
            System.out.println("Invalid number!");
        }
    }
}