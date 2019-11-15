
import java.io.BufferedReader;
import java.io.EOFException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class DemoUlohaR {

    public static void main(String[] args) throws EOFException{
        // TODO code application logic here
        String radek;
        List<String> als = null;
        BufferedReader cteni = null;
        
    try {
        cteni = new BufferedReader(new FileReader("Pom.txt"));
        als = new ArrayList<>();
        
        while ((radek = cteni.readLine()) != null) {            
            als.add(radek);
            
        }
        cteni.close();
        
        
        
    } catch (IOException ex) {
        System.out.println("Soubor se nepodařilo otevřít . .. .");
    }
    
        for (String rad : als) {
            System.out.println(rad);
        }
    
    //prace s kolekcí
    
    System.out.println("Počet řádků v kolekci: " + als.size());
    System.out.println("Vypis kolekce: "+ als);
    
    //lehká analíza
    //System.arraycopy(radky, 0, als, 0, poc);
    
    

    
}
    
}

    
    

