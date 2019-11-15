
import java.io.FileWriter;
import java.io.IOException;


public class Demo1JavaToCsv {


    public static void main(String[] args) {
        // TODO code application logic here
        generujCSVSoubor("Moje.csv");
    }

    private static void generujCSVSoubor(String jmenoCSV) {
        
        FileWriter zapis;
        try{
            zapis = new FileWriter(jmenoCSV, true);
            //- - - hlavièka 
            zapis.append("Jméno:"); zapis.append(";");
            zapis.append("Vìk:"); zapis.append(";");
            zapis.append("Mobil:"); zapis.append("\n");
              
              //- - - data
            zapis.append("Pepan:"); zapis.append(";");
            zapis.append("66"); zapis.append(";");
            zapis.append("777777777"); zapis.append("\n");
            
            zapis.append("Adolf:"); zapis.append(";");
            zapis.append("129"); zapis.append(";");
            zapis.append("777677777"); zapis.append("\n");
            
            zapis.flush();
            zapis.close();
            
            System.out.println("Zapis OK...");
        }catch(IOException ex){
            System.out.println("Chynbý zapis. . .");
        }
        
    }
    
}
