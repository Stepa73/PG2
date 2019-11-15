
package firma;
//import java.util.*;

public class DemoAbstrack {

  
    public static void main(String[] args) {
//            Scanner sc = new Scanner(System.in);
//            System.out.println("Zadej počet dělníků");
//            int pocet = sc.nextInt();
//            for (int i = 0; i < pocet; i++) {
//                System.out.println("Zadej jméno dělníka");
//                String jmeno = sc.nextLine();
//                System.out.println("Zadej věk dělníka");
//                int vek = sc.nextInt();
//                
//        }


            //pole delniku
            AZamestnanec del1 = new Delnik("Jan Šroub", 33); 
            AZamestnanec del2 = new Delnik("Tom Buk", 25);
            AZamestnanec del3 = new Delnik("Jiří Kot", 55);
            
            AZamestnanec[] delnici = {del1, del2, del3};
            // 1 reditele
            AZamestnanec red = new Reditel("Ruda Veliký", 42, delnici);
            
            //pole všech zaměstnanců
            AZamestnanec[] zamestnanci = {del1, del2, del3, red};
            
            //tisk všech zamestnancu
            
            for (AZamestnanec zam : zamestnanci) {
                zam.hlaska();
                //využití polyformizmu
                zam.cinnost();
        
            
        }
    }}
    

