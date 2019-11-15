
import java.util.Scanner;
import java.util.TreeMap;

public class DemoTreeMap {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        TreeMap<String, Integer> tm = new TreeMap<>();
        
        //realizace telefoního seznamu Klíč: jméno   Hodnota: telefoní číslo
        
        tm.put("Jakub", 722123123);
        tm.put("Anička", 607000111);
        tm.put("Franta", 721222222);
        tm.put("Luboš", 123123123);
        tm.put("Igor", 777777777);
        
        System.out.println("Telefoní seznam "+tm.size()+" "+tm);
        
        String jmeno = "Anička";
        System.out.println(jmeno + " má telefon: "+ tm.get(jmeno) );
        
        
        for (String klic : tm.keySet()) {
            System.out.println(klic+" : "+ tm.get(klic));   
        }
        Scanner sc = new Scanner (System.in, "Windows-1250");
        
        System.out.println("Zadejte jméno pro změnu čísla ");
        String jm = sc.next();
        
        if (tm.containsKey(jm)) {
            System.out.println("Zadejte nové číslo");
            Integer csl = sc.nextInt();
            tm.put(jm, csl); //přepisuje metoda 
        } else {
            System.out.println("Zadané Jméno neexistuje je neplatné");
            System.exit(0);
        }
         
        for (String klic : tm.keySet()) {
            System.out.println(klic+" : "+ tm.get(klic));   
        }
        
    }
    
}
