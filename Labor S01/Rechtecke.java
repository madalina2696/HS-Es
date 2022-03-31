import java.util.Scanner;

public class Rechtecke {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Breite: ");
        int b = sc.nextInt();
        System.out.print("Höhe: ");
        int h = sc.nextInt();
        System.out.println();

        for (int i = 0; i < b; i++) {
            System.out.print("*");
        }
        System.out.println();
            for (int i = 0; i < h - 2; i++) {
                if (b != 1) {
                    System.out.print("*"); 
                }

                for (int j = 0; j < b - 2; j++) {
                    System.out.print(" ");  
                }
                System.out.print("*\n");
            }

            if (h != 1) {
                for (int i = 0; i < b; i++) {
                    System.out.print("*");
                }
            }
        sc.close(); 
    }
}