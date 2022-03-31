import java.util.Scanner;

public class Integrieren {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Eingabe: ");
        String nr = sc.next();

        String[] numbers = nr.split(",");
        int counter = numbers.length;

        if (numbers.length == 1) {
            System.out.println(numbers[0] + ",C");

        } else {

            for (int i = 0; i < numbers.length; i++) {
                int zahl = Integer.parseInt(numbers[i]);
                System.out.print(zahl / counter);
                counter--;

                if (counter != 0) {
                    System.out.print(",");
                }

                if (counter == 0) {
                    System.out.print(",C");

                }
            }
        } 
        sc.close();
    }
    
}