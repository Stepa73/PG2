
package priklad6;

import java.util.*;


public class Marie {
   
    public void kalkulackaOdMarie(){
            
            int pcislo, dcislo, vysledek;
            Scanner sc = new Scanner (System.in);
            
            System.out.println("Zadej prvni cislo: ");
            pcislo = sc.nextInt();
            System.out.println("Zadej druhe cislo: ");
            dcislo = sc.nextInt();
            vysledek = pcislo + dcislo;
            System.out.print("Vysledek je: "+ vysledek);
    }
    
}
