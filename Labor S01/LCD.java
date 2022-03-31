public class LCD {

    public static void main(String[] args) {

        String numbers = "0";
        int size = 0;

        if (args.length > 1) {
            if (args[1].equalsIgnoreCase("-s")) {
                numbers = args[0];
                size = Integer.parseInt(args[2]);
            } else if (args[0].equalsIgnoreCase("-s")) {
                numbers = args[2];
                size = Integer.parseInt(args[1]);
            }
        } else {
            numbers = args[0];
            size = 1;
        }

        String[] numbersArr = numbers.split("");

        System.out.println(topPart(numbersArr));
        for (int i = 1; i < size; i++) {
            System.out.println(midSize01(numbersArr));
        }
        System.out.println(midPart(numbersArr));
        for (int i = 1; i < size; i++) {
            System.out.println(midSize02(numbersArr));
        }
        System.out.println(bottomPart(numbersArr));
    }

    private static String topPart(String[] input) {

        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case "0":
                    System.out.print(" _  ");
                    break;
                case "1":
                    System.out.print("    ");
                    break;
                case "2":
                    System.out.print(" _  ");
                    break;
                case "3":
                    System.out.print(" _  ");
                    break;
                case "4":
                    System.out.print("    ");
                    break;
                case "5":
                    System.out.print(" _  ");
                    break;
                case "6":
                    System.out.print(" _  ");
                    break;
                case "7":
                    System.out.print(" _  ");
                    break;
                case "8":
                    System.out.print(" _  ");
                    break;
                case "9":
                    System.out.print(" _  ");
                    break;

                default:
                    break;
            }
        }
        return "";
    }

    private static String midPart(String[] input) {

        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case "0":
                    System.out.print("| | ");
                    break;
                case "1":
                    System.out.print("  | ");
                    break;
                case "2":
                    System.out.print(" _| ");
                    break;
                case "3":
                    System.out.print(" _| ");
                    break;
                case "4":
                    System.out.print("|_| ");
                    break;
                case "5":
                    System.out.print("|_  ");
                    break;
                case "6":
                    System.out.print("|_  ");
                    break;
                case "7":
                    System.out.print("  | ");
                    break;
                case "8":
                    System.out.print("|_| ");
                    break;
                case "9":
                    System.out.print("|_| ");
                    break;
                default:
                    break;
            }
        }
        return "";
    }

    private static String bottomPart(String[] input) {

        for (int i = 0; i < input.length; i++) {
            switch (input[i]) {
                case "0":
                    System.out.print("|_| ");
                    break;
                case "1":
                    System.out.print("  | ");
                    break;
                case "2":
                    System.out.print("|_  ");
                    break;
                case "3":
                    System.out.print(" _| ");
                    break;
                case "4":
                    System.out.print("  | ");
                    break;
                case "5":
                    System.out.print(" _| ");
                    break;
                case "6":
                    System.out.print("|_| ");
                    break;
                case "7":
                    System.out.print("  | ");
                    break;
                case "8":
                    System.out.print("|_| ");
                    break;
                case "9":
                    System.out.print("  | ");
                    break;
                default:
                    break;
            }
        }
        return "";
    }

    private static String midSize01(String[] input) {

        for (int i = 0; i < input.length; i++) {

            switch (input[i]) {
                case "0":
                    System.out.print("| | ");
                    break;
                case "1":
                    System.out.print("  | ");
                    break;
                case "2":
                    System.out.print("  | ");
                    break;
                case "3":
                    System.out.print("  | ");
                    break;
                case "4":
                    System.out.print("| | ");
                    break;
                case "5":
                    System.out.print("|   ");
                    break;
                case "6":
                    System.out.print("|   ");
                    break;
                case "7":
                    System.out.print("  | ");
                    break;
                case "8":
                    System.out.print("| | ");
                    break;
                case "9":
                    System.out.print("| | ");
                    break;
                default:
                    break;

            }
        }

        return "";
    }

    private static String midSize02(String[] input) {

        for (int i = 0; i < input.length; i++) {

            switch (input[i]) {
                case "0":
                    System.out.print("| | ");
                    break;
                case "1":
                    System.out.print("  | ");
                    break;
                case "2":
                    System.out.print("|   ");
                    break;
                case "3":
                    System.out.print("  | ");
                    break;
                case "4":
                    System.out.print("  | ");
                    break;
                case "5":
                    System.out.print("  | ");
                    break;
                case "6":
                    System.out.print("| | ");
                    break;
                case "7":
                    System.out.print("  | ");
                    break;
                case "8":
                    System.out.print("| | ");
                    break;
                case "9":
                    System.out.print("  | ");
                    break;
                default:
                    break;
            }
        }
        return "";
    }
}