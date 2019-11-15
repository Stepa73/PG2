
package priklad3;

import javax.swing.JOptionPane;


public class Priklad3 {

   
    public static void main(String[] args) {
         String ks = JOptionPane.showInputDialog("Zadejte pošet ks: ");
         int ksint = Integer.parseInt(ks);
         double cena = ksint * 150;
         double cenatr = ksint * 150;
         if (ksint<3){
         JOptionPane.showMessageDialog(null,"Není nárok na slevu. Celková cena se slevou je: "+cena+  "Celková cena bez slevy je: "+cenatr +" kč.");
          
         }
         else if (ksint>= 3 && ksint <=5){
            double vysledek = (cena - (cena/100*5));
          
            JOptionPane.showMessageDialog(null,"Celková cena se slevou je "+ vysledek+" kč. Sleva je 5%. Celková cena bez slevy je: "+cenatr +" kč.");
         }
         else if (ksint >= 6 && ksint <= 10){
            double vysledek = (cena - (cena/100*10));
            
            JOptionPane.showMessageDialog(null,"Celková cena se slevou je "+ vysledek+" kč. Sleva je 10%. Celková cena bez slevy je: "+cenatr +" kč.");
         }
         else{
         double vysledek = (cena - (cena/100*15));
        
         JOptionPane.showMessageDialog(null,"Celková cena se slevou je "+ vysledek+" kč. Sleva je 15%. Celková cena bez slevy je: "+cenatr +" kč.");
         }
    }
    
}
