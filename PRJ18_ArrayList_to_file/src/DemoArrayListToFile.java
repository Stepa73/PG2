
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;


/**
 *
 * @author stopk
 */
public class DemoArrayListToFile {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) throws IOException {
        // TODO code application logic here
        
        List<String>als1 = new ArrayList<>();
        
        als1.add("basketbal");
        als1.add("volejbal");
        als1.add("fotbal");
        als1.add("biatlon");
        als1.add("lukostřelba");
        
        System.out.println(als1);
        //zapis kolekce do souboru
        PrintWriter zapis ;
        Iterator it1 = als1.iterator();
        
        try{
            zapis = new PrintWriter(new FileOutputStream("sporty.txt"));
            
            while (it1.hasNext()) {
                zapis.write((String) it1.next());
                zapis.write("\n");
                
            }
            zapis.close();
            System.out.println("Zapis OK....");
            
            
            
        } catch (FileNotFoundException ex) {
        }    
            
            FileInputStream cteni;
            Scanner sc;
            List<String> als2 = new ArrayList<>();
            
        try {
            cteni = new FileInputStream("sporty.txt");
            sc = new Scanner(cteni);
            
            while (sc.hasNext()) {
                als2.add(sc.nextLine());
                
            }
            cteni.close();
            System.out.println("Čtení OK ...");
            System.out.println("Naše načtená als2 = " +als2);
            
        } catch (FileNotFoundException ex) {
            System.out.println("Soubor se nepodařilo otevřít.");
            System.exit(-1);
        }
        System.out.println("");
        // práce s kolekcí 
        // vypis pomocí iteratoru
         Iterator it2 = als2.iterator();
         while (it2.hasNext()){
             System.out.println(it2.next());
         }
         System.out.println("");
         
         System.out.println("První prvek: " + als2.get(0));
         System.out.println("Počet prvků: " + als2.size());
         System.out.println("Poslední prvek: " + als2.get(als2.size()-1));
        
         System.err.println("Setřízená kolekce");
         
         
         Collections.sort(als2);
         
         for(String retez: als2){
	System.out.println(retez);
		}
    }
    
}
