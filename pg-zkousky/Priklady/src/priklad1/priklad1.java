
package priklad1;

import javax.swing.JOptionPane;


public class priklad1 {

   
    public static void main(String[] args) {
       String cislo = JOptionPane.showInputDialog("Zadejte útratu v Kč");
         int cisloint = Integer.parseInt(cislo);
         if (cisloint<10000){
         JOptionPane.showMessageDialog(null,"Není nárok na slevu.");
         }
         else if (cisloint>= 10000 && cisloint <50000){
            double vysledek = (cisloint - (cisloint/100*5));
            JOptionPane.showMessageDialog(null,"Cena je "+ vysledek+" kč.");
         }
         else if (cisloint>= 50000 && cisloint <100000){
         double vysledek = (cisloint - (cisloint/100*7));
            JOptionPane.showMessageDialog(null,"Cena je "+ vysledek+" kč.");
         }
         else{
         double vysledek = (cisloint - (cisloint/100*10));
            JOptionPane.showMessageDialog(null,"Cena je "+ vysledek+" kč.");
         }
    }
    
}
