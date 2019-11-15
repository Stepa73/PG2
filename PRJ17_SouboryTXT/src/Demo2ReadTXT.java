
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.nio.Buffer;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo2ReadTXT {

public static void main(String[] args) throws IOException {
        // TODO code application logic here
        String radek;
        List<String> als = null;
        BufferedReader cteni = null;
        
    try {
        cteni = new BufferedReader(new FileReader("Zaci.txt"));
        als = new ArrayList<>();
        
        while ((radek = cteni.readLine()) != null) {            
            als.add(radek);
            System.out.println(radek);
        }
        cteni.close();
        
        
        
    } catch (IOException ex) {
        System.out.println("Soubor se nepodařilo otevřít . .. .");
    }
    
    System.out.println("Program pokračuje dál .... . .");
    
    //prace s kolekcí
    
    System.out.println("Počet řádků v kolekci: " + als.size());
    System.out.println("Vypis kolekce: "+ als);
    
    //lehká analíza
    
    System.out.println("Práce s prvním průměrem");
    
    String[] poleRed = new String[2];
    
    poleRed = als.get(0).split(";");//pomocí split rozdělím ruzne položky
    
    System.out.println(poleRed[1]);
    
    // převod průměru na číslo
    
    Double dPrumer = Double.parseDouble(poleRed[1]);
    System.out.println("pruměr/100 = "+ dPrumer/100);
    
    //zadavejte z klavesnice upravte porgrami tak že informace o žakovi rozšíříme o dalši dvě položky např(misto narozrni kapesné) a vytvořte novy soubor Zaci.txt a program Demo2ReadTXT vyčte ze zvoleného žáka jeho kapesné a místo narozrní tak že se na obrazovku ypše např kapesné žáka jménem Pepa NOs (narozen ve městě chrudim) je 5 stokorun 
}
    
}
