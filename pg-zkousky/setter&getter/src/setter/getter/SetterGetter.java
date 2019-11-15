
package setter.getter;
import java.util.*;

public class SetterGetter {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner sc = new Scanner (System.in);
        Bejvalka bejvObjekt = new Bejvalka();
        System.out.println("Napiš zde jméno tvé přítelkině: ");
        
        String PRACOVNIK = sc.nextLine();
        bejvObjekt.setJmeno(PRACOVNIK);
        
        bejvObjekt.vyrok();
    }
    
}
