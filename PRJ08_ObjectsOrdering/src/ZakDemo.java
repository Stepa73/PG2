
import java.util.Arrays;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author stopk
 */
public class ZakDemo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Zak[] zaci = new Zak[3];
        
        zaci[0] = new Zak("Štěpán", " 2.F", 2.0 );
        zaci[1] = new Zak("Adam", " 2.F", 1.1 );
        zaci[2] = new Zak("Pavel", " 2.F", 3.1 );
        
        for (Zak z : zaci) {
            System.out.println(z);
        }
        Arrays.sort(zaci);
        System.out.println("");
        
        for (Zak z : zaci) {
            System.out.println(z);
        }
        
       
    }
    
}
