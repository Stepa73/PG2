
package pkg01_kroužek;

import java.util.*;
import java.util.Scanner;


public class Main {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Scanner sc = new Scanner(System.in);
        
      
        System.out.println("Zadej číslo a :");
        String a = sc.nextLine();
        
        System.out.println("Zadej číslo b :");
        String b = sc.nextLine();
        boolean jeBCislo = b.matches("[0-9.]");
        if(a.matches("[0-9.]") == true){
            if(b.matches("[0-9.]") == true){
                int aString = a.toString();
                String vysledek = a+b;
                System.out.println("Výsledek je:"+vysledek);
            }
            else{
            System.out.println("Neplatná hodnota B");
            }
        } else{
            System.out.println("Neplatná hodnota A");
            }
        
        
        
        
        
    }

}