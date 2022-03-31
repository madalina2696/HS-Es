import java.util.Scanner;

public class Primzahl {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Welche Zahl prüfen? ");
        int isPrime = sc.nextInt();

        if (primeTest(isPrime)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }
        sc.close();
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
