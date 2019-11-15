
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Demo1WriterTXT {

    public static void main(String[] args) {
        // TODO code application logic here
        String ZakJmeno = "Gazi Gazela";
        String prumer = "80.5";
        
        BufferedWriter zapis = null;
        
        try {
            zapis = new BufferedWriter(new FileWriter("Zaci.txt", true));//append true zanmená že se to píše za sebou a nepřepisuje
            zapis.write(ZakJmeno);
            zapis.write(";");
            zapis.write(prumer);
            
            zapis.newLine();
            
            // zapis.write("Štěpán Zdražil");
            //zapis.write(";");
            //zapis.write("2.25");
            
            zapis.flush();// povinné aby to vše dobře proběhlo
            
            System.out.println("Vše OK");
            
            
            
        } catch (IOException ex) {
            System.out.println(ex);
        }
    }
    
}
