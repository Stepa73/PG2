
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class DemoUloha {

  
    public static void main(String[] args) {
        BufferedWriter zapis = null;
        String Veta1 = "Lorem Ipsum je demonstrativní výplňový text";
        String Veta2 = "O systematice tohoto tvora probíhaly debaty.";
        String Veta3 = "Dle jedněch názorů patřil do čeledi lamnovití (Lamnidae) a byl blízkým příbuzným velkého žraloka bílého (Carcharodon carcharias), dle druhých do vyhynulé čeledi Otodontidae tento předpoklad je pravděpodobně správný";
        String Veta4 = "Diskutováno je rovněž umístění v rodu Carcharocles, Megaselachus, Otodus nebo Procarcharodon.";
        String Veta5 = "Megalodon mohl vzhledem připomínat mohutnějšího žraloka bílého či se mohl podobat žraloku velikému (Cetorhinus maximus) či písečnému (Carcharias taurus). ";
        try {
            zapis = new BufferedWriter(new FileWriter("Pom.txt", true));//append true zanmená že se to píše za sebou a nepřepisuje
           
                zapis.write(Veta1);
                zapis.newLine();
                
                zapis.write(Veta2);
                zapis.newLine();
                
                zapis.write(Veta3);
                zapis.newLine();
                
                zapis.write(Veta4);
                zapis.newLine();
                
                zapis.write(Veta5);
            
            
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
