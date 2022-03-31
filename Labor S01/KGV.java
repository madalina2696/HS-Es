import java.util.Scanner;

public class KGV {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.print("Zahl 1: ");
        long a = sc.nextLong();

        System.out.print("Zahl 2: ");
        long b = sc.nextLong();
        
        long tempA = a;
        long tempB = b; 

        while (tempA != tempB) {

            if (tempA < tempB) {
                tempA += a;
            } else {
                tempB += b;
            }   
        }
        System.out.println(tempA);    
        
        sc.close();
    } 
    
}