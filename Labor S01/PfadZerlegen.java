import java.util.Scanner;

public class PfadZerlegen {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Dateipfad: ");
        String Dateipfad = scanner.nextLine();

        String DateipfadConverted = Dateipfad.replace("\\", "/");
        String[] Split = DateipfadConverted.split("/");

        Integer NumberOfParts = Split.length;
        Integer i;

        scanner.close();
        System.out.print("Verzeichnis: ");
        
        for (i = 0; i < NumberOfParts - 2; i++) {
            System.out.print(Split[i] + "\\"); 
        }

        System.out.print(Split[i]);

        i++;
        String End = Split[i];
        String[] SplitEnd = End.split("\\.");

        System.out.println();
        System.out.print("Dateiname: " + SplitEnd[0]);
        System.out.println();
        System.out.print("Erweiterung: " + SplitEnd[1]);
        
    }  
}