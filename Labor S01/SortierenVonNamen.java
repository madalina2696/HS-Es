import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class SortierenVonNamen {

    public static void main(String[] args) {

        String path = args[0];

        compare(path);

    }

    public static void compare(String path) {

        ArrayList<String> names = new ArrayList<>();

        ArrayList<String> lastname = new ArrayList<>();

        try {
            Scanner sc = new Scanner(new FileReader(path));

            while (sc.hasNextLine()) {
                names.add(sc.nextLine());
            }

            for (int i = 0; i < names.size(); i++) {

                lastname.add(names.get(i).substring(names.get(i).lastIndexOf(" ") + 1));

            }

            Collections.sort(lastname);

            for (int i = 0; i < names.size(); i++) {
                for (int j = 0; j < lastname.size(); j++) {

                    if (names.get(j).substring(names.get(j).lastIndexOf(" ") + 1).equals(lastname.get(i))) {
                        Collections.swap(names, i, j);
                    }
                }
            }

            for (int i = 0; i < names.size(); i++) {
                System.out.println(names.get(i));
            }

        } catch (FileNotFoundException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
    }
}