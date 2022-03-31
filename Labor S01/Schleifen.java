import java.util.Scanner;

public class Schleifen {
    
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Zahl: ");
        int eingabe = scanner.nextInt();

            for (int i = 0; i < eingabe; i++)  {
                System.out.println("Wiederholung");
            }

        scanner.close();
    }
}