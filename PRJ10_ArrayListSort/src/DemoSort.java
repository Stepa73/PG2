
import firma.Zamnestnanec;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import lib.KomparatorDleJmena;
import lib.KomparatorDlePlatu;

public class DemoSort {

 
    public static void main(String[] args) {
        
//        Zamnestnanec zam = new Zamnestnanec("Štěpanek", 70);
//        System.out.println(zam);


        List<Zamnestnanec> seznam = new ArrayList<>();
        
        seznam.add(new Zamnestnanec("Martin", 18000));
        seznam.add(new Zamnestnanec("Zdeněk", 80000));
        seznam.add(new Zamnestnanec("Pepan", 25000));
        seznam.add(new Zamnestnanec("Anna", 100000));
        seznam.add(new Zamnestnanec("Cyril", 85000));
        
        //... seznam zaměstanců
        for (Zamnestnanec zam : seznam) {

                System.out.println(zam);
        }
       //třídění dle platu
        
        
        Collections.sort(seznam, new KomparatorDlePlatu());
        
        System.out.println();
        Iterator it = seznam.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
        //třídění dle jména
         
        Collections.sort(seznam, new KomparatorDleJmena());
        
    System.out.println();
        Iterator it2 = seznam.iterator();
        while (it2.hasNext()) {
            System.out.println(it2.next());
        }
    
    
    }
        
        
        
    }
    
