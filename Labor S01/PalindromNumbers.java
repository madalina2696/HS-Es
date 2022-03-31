public class PalindromNumbers {

    public static void main(String[] args) {

        String value = args[0];
        counter(value);

    }

    public static boolean palindromCalc(String number) {
        String reversed = new StringBuilder(number).reverse().toString();

        if (number.equals(reversed)) {
            return true;
        } else {
            return false;
        }
    }

    public static void counter(String input1) {

        int mult = 0;
        String multToString;
        int counter = 0;

        String[] parts = input1.split(",");
        String part1 = parts[0]; 
        String part2 = parts[1]; 

        int number1 = Integer.parseInt(part1);
        int number2  = Integer.parseInt(part2);

        // a x b
        for (int i = number1; i <= number2; i++) { // a
            for (int j = i; j <= number2; j++) { // b
                mult = i * j;
                multToString = Integer.toString(mult);
                if (palindromCalc(multToString)) {
                    counter = counter + 1;
                }
            }
        }
        System.out.println(counter);
    }
}