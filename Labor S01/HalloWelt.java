import java.util.Scanner;

public class HalloWelt {

    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);

        System.out.println("Geben Sie den Namen ein: ");
        String eingabe = scanner.next();
        System.out.println("Hallo, " + eingabe + "!");

        scanner.close();
    }
}