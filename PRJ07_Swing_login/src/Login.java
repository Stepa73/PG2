
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import wokna.Kalkulacka;
import wokna.LoginDialog;
//import wokna.zaokrouhlovani; //importuje zaokrouhlovani které je zakomentované

public class Login {
        private static String jmeno;
        private static char[] heslo;
 
    public static void main(String[] args) {
        // TODO code application logic here
        
        System.out.println("Start programu");
        
        LoginDialog dialog = new LoginDialog(new JFrame(), true);
        dialog.setTitle("Login");
        
        dialog.setLocationRelativeTo(null);
        dialog.setVisible(true);
        
        
        System.out.println("Běží hlavní porgram");
        
        
//zpracování a test na jméno a heslo nastudovat design
        
       jmeno= dialog.getLoginName().getText();
       heslo = dialog.getLoginPsw().getPassword();
       
        if (jmeno.equals("Stepa") && jeSpravneHeslo(heslo) ) {   //nesmí se porovnávat == protože jsou to adresy nikdy nebude stejné používá se equals
//zde spustíme nějakou app
            System.out.println("... SYMULACE PROGRAMU...");
//                zaokrouhlovani wokno = new zaokrouhlovani();
//                wokno.setTitle("zaokrouhlovani");
//                wokno.setLocationRelativeTo(null);
//                wokno.setVisible(true);
//                tohle bylo zaokrouhleni 
               
                Kalkulacka okno = new Kalkulacka();
                okno.setTitle("Calculator");
                okno.setLocationRelativeTo(null);
                okno.setVisible(true);
                okno.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        } 
        else {
            JOptionPane.showMessageDialog(null, "Nesprávné heslo");
            System.exit(0);
        }
        
    }

    private static boolean jeSpravneHeslo(char[] vstup) {
       boolean jeSpravne = true;
       char[] spravneHeslo = {'S','t','e','p','a'};
        if (vstup.length != spravneHeslo.length ) {
            jeSpravne = false;
        } else {
              for   (int i = 0 ; i < spravneHeslo.length; i++) {
                  if (vstup[i] != spravneHeslo[i]){
                      jeSpravne = false;
                  }
              }
        }
        for (int i = 0; i < spravneHeslo.length; i++) {
            spravneHeslo[i]=0;
        }
       System.out.println(jeSpravne);
        return jeSpravne;
        
    }
    
}
