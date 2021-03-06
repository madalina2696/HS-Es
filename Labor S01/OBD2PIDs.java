import java.util.HashMap;
import java.util.Scanner;

public class OBD2PIDs {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        String input = scanner.nextLine();

        pids(input);

        scanner.close();
    }

    private static void pids(String hexaString) {

        HashMap<String, String> hexMap = new HashMap<>();

        hexMap.put("0", "0000");
        hexMap.put("1", "0001");
        hexMap.put("2", "0010");
        hexMap.put("3", "0011");
        hexMap.put("4", "0100");
        hexMap.put("5", "0101");
        hexMap.put("6", "0110");
        hexMap.put("7", "0111");
        hexMap.put("8", "1000");
        hexMap.put("9", "1001");
        hexMap.put("A", "1010");
        hexMap.put("B", "1011");
        hexMap.put("C", "1100");
        hexMap.put("D", "1101");
        hexMap.put("E", "1110");
        hexMap.put("F", "1111");

        

        char[] hex = hexaString.toUpperCase().toCharArray();

        String binaryString = "";

        for (char h : hex) {
            binaryString = binaryString + hexMap.get(String.valueOf(h));
        }

        char[] bin = binaryString.toCharArray();

        for (int i = 0; i < bin.length; i++) {
            if (bin[i] == '1') {
                System.out.println(i + 1);
            }
        }
    }
}