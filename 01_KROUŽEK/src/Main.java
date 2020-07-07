
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Zadej číslo a :");
        String a = sc.nextLine();

        System.out.println("Zadej číslo b :");
        String b = sc.nextLine();

        //boolean jeBCislo = b.matches("[0-9.]");

        if (a.matches("[0-9.]") == true) {
            if (b.matches("[0-9.]") == true) {
                int numberA = Integer.parseInt(a);
                int numberB = Integer.parseInt(b);
                int vysledek = numberA + numberB;
                System.out.println("Výsledek je: " + vysledek);
            } else {
                System.out.println("Neplatná hodnota B");
            }
        } else {
            System.out.println("Neplatná hodnota A");
        }


    }

}