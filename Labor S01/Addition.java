import java.util.Scanner;

public class Addition {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl 1: ");
        int eingabe1 = scanner.nextInt();
        System.out.println("Zahl 2: ");
        int eingabe2 = scanner.nextInt();

        System.out.println(eingabe1  + eingabe2);

        scanner.close();
    }
}