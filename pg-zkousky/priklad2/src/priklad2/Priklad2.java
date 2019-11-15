
package priklad2;

import javax.swing.JOptionPane;


public class Priklad2 {

  
    
       public static void main(String[] args) {
       String cislo = JOptionPane.showInputDialog("Zadejte 4místné číslo.");
        int cisloint = Integer.parseInt(cislo);
        int c1 = cisloint%10;
        int c2 =cisloint%100/10;
        int c3 = cisloint%1000/100;
        int c4 = cisloint%10000/1000;
      
        int vysledek = c1 + c2 + c3 + c4;
        if(vysledek >=1 && vysledek <= 20){
            JOptionPane.showMessageDialog(null,"Ciferný součet je v intervalu <1, 20>. Ciferný součet je: " + vysledek);
        }
        else {
            System.out.println("Ciferný součet je: " + vysledek);
             JOptionPane.showMessageDialog(null,"Ciferný součet není v intervalu <1, 20>. Ciferný součet je: " + vysledek);
        }
  }
 
    
}
