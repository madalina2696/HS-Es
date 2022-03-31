public class Primfaktoren {

    public static void main(String[] args) {

        int n = Integer.parseInt(args[0]);
        zahl(n);

    }

    private static void zahl(int zahl) {

        if (primeTest(zahl) == true) {
            System.out.println("prime");

        } else if (zahl > 9 && zahl % 2 != 0) {
            System.out.println("composite");

        } else {
            System.out.println(zahl);

        }

    }

    private static boolean primeTest(int x) {

        int j = 2;
        int result = 0;
        int n = x;
        boolean isPrime = true;

        while (j <= n / 2) {
            if (n == 1) {
                isPrime = false;
            }
            if (n % j == 0) {
                result = 1;
            }
            j++;
        }
        if (result == 1 || n == 1) {
            isPrime = false;
        } else {
            isPrime = true;
        }

        return isPrime;
    }
}