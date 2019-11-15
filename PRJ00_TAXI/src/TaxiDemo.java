
import javax.swing.JOptionPane;
public class TaxiDemo {

    
    public static void main(String[] args) {
        String km = JOptionPane.showInputDialog("Zadej počet km");
        int kmint = Integer.parseInt(km);
        int nastupniSazba = 40;
        if (kmint <= 29) {
            int vysledek = 25*kmint+nastupniSazba;
            JOptionPane.showMessageDialog(null,"Cena za "+kmint+" km je "+ vysledek+" kč.");
        
        }
        else if (kmint >= 30 && kmint<= 49) {
            int vysledek = 20*kmint+nastupniSazba;
             JOptionPane.showMessageDialog(null,"Cena za "+kmint+" km je "+ vysledek+" kč.");
        }
        else{
            int vysledek = 15*kmint+nastupniSazba;
             JOptionPane.showMessageDialog(null,"Cena za "+kmint+" km je "+ vysledek+" kč.");
        }
    }
    
}
