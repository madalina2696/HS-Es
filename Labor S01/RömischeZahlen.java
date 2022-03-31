import java.util.Scanner;

public class RömischeZahlen {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        System.out.print("Zahl: ");
        int input = sc.nextInt();
        dezToRom(input);

        sc.close();
    }

    public static void dezToRom(int num) {

        int[] dez = { 1000, 900, 500, 400, 100, 90, 50, 40, 10, 9, 5, 4, 1 };
        String[] rom = { "M", "CM", "D", "CD", "C", "XC", "L", "XL", "X", "IX", "V", "IV", "I" };

        StringBuilder roman = new StringBuilder();

        for (int i = 0; i < dez.length; i++) {
            while (num >= dez[i]) {
                num -= dez[i];
                roman.append(rom[i]);
            }
        }
        System.out.println(roman.toString());
    }
    
}