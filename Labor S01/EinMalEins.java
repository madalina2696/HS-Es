import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EinMalEins {
    public static void main(String[] args) {

        int input = Integer.parseInt(args[0]);
        creatAndWrite(input);

    }

    public static void creatAndWrite(int n) {

        try {
            File myObj = new File("EinMalEins.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        try {
            FileWriter myWriter = new FileWriter("EinMalEins.txt");
            PrintWriter printWriter = new PrintWriter(myWriter);

            for (int i = 1; i <= n; i++) { //Reihe
                for (int j = 1; j <= n; j++) { //Spalte

                    int res = i * j;

                    printWriter.print(res + "\t");

                }
                printWriter.println();
            }
            printWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}