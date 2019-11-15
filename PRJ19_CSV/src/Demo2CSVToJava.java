
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo2CSVToJava {


    public static void main(String[] args) {
        // TODO code application logic here
        
        String jmenoCSVSouboru = "MujExcel.csv";
        
        nactiCSVSoubor(jmenoCSVSouboru);
  }
    
    private static void nactiCSVSoubor(String jmenoCSVSouboru){
    
        BufferedReader cteni;
        String radek;
        String separator = ";";
        
        String[] atributyOsoby;
        int count = 0;
        try {
            cteni = new BufferedReader(new FileReader(jmenoCSVSouboru));
            while ((radek = cteni.readLine()) != null) {                
                
                atributyOsoby = radek.split(separator);
                
                // . . . kontrolní vypisi
                
                System.out.println("Øadek " + count +": "+ radek);
                System.out.println("Osoba "+count+": "+ atributyOsoby[0] + ": :" + atributyOsoby[2] );
                count ++; 
                
            }
        } catch (FileNotFoundException ex) {
            System.out.println("Soubor se nepodaøilo otevøít ... ");
        }catch (IOException e){
            System.out.println("Chyba ètení .... ");
        }
    
    }
    
}
