import java.util.ArrayList;
import java.util.Scanner;

public class FröhlicheZahlen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Geben Sie eine Zahl ein: ");
        int input = scanner.nextInt();
        System.out.println(isHappy(input));

        scanner.close();
    }

        public static boolean isHappy(int input) {

            ArrayList<Integer> numberList = new ArrayList<>();
    
            while (input != 1) {
                int temp = input;
                int sum = 0;
                while (temp != 0) {
                    int rest = temp % 10;
                    sum += Math.pow(rest, 2);
                    temp /= 10;
                }
    
                if (numberList.contains(sum)) {
                    return false;
                }
                input = sum;
                numberList.add(input);
            }
    
            return true;
        }
}