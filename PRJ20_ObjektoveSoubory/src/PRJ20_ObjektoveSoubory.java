import java.io.EOFException;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutput;
import java.io.ObjectOutputStream;
import java.io.OutputStream;
import java.util.logging.Level;
import java.util.logging.Logger;
import tridy.Zak;


public class PRJ20_ObjektoveSoubory {

   
    
        
            // TODO code application logic here
            
public static void main(String[] args) throws IOException {
        
    Zak[] zapisZaku = new Zak[4];
        zapisZaku[0] = new Zak("Jiøí", 17, 1.2);
        zapisZaku[1] = new Zak("Anèe", 17, 2.54);
        zapisZaku[2] = new Zak("Vojta", 17, 1.5);
        zapisZaku[3] = new Zak("Matìj", 17, 2.8);
       
        ObjectOutputStream zapis = null;
        ObjectInputStream cteni = null;
       
        try {
            zapis = new ObjectOutputStream(new FileOutputStream("Zaci.dta"));
            for (Zak z : zapisZaku){
                zapis.writeObject(z);
            }
            System.out.println("Zapis OK");
        } catch (FileNotFoundException ex) {
            //Logger.getLogger(DemoObjSoubory.class.getName()).log(Level.SEVERE, null, ex);
            System.out.println("Problém pøi zápisu");
        } finally {
            if (zapis != null){
                zapis.close();
            }
        }
       
       
        Zak[] cteniZaku = new Zak[30];
        int count = 0;
       
            try {
                cteni = new ObjectInputStream(new FileInputStream("Zaci.dta"));
                while(true){
                    cteniZaku[count] = (Zak) cteni.readObject();
                    count++;
                }
            } catch (ClassNotFoundException ex) {
                Logger.getLogger(PRJ20_ObjektoveSoubory.class.getName()).log(Level.SEVERE, null, ex);
            } catch (EOFException e) {
                System.out.println("Pocet objektu = " + count);
            } finally {
                if (cteni != null){
                    cteni.close();
                }
            }
 
            System.out.println("Kontrolní výpis");
            for (int i = 0; i < count; i++){
                System.out.println(cteniZaku[i].getJmeno());
            }
    }
   
}

