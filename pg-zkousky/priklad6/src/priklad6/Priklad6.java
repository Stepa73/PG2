
package priklad6;

import java.util.*;


public class Priklad6 {

    
    public static void main(String[] args) {
       // objekt //void nevrací žádnou hodnotu // pokud ano musíme int
    NovaTrida nasObjekt = new NovaTrida();
    nasObjekt.vytiskniZpravu();
    //metoda č 2 od honzi
    NovaTrida skenObjekt = new NovaTrida();
    skenObjekt.honzuvSkener();
    //metoda č 3 od marie
    Marie kalObjekt = new Marie();
    kalObjekt.kalkulackaOdMarie();
    //metoda č 4
    Scanner sc = new Scanner(System.in);
    VedlejsiTrida vObjekt = new VedlejsiTrida();
    
        System.out.println("Jak se jmenuješ ? ");
        String jmeno = sc.nextLine();
        vObjekt.jednoduchaZprava(jmeno);
    }
    
}
