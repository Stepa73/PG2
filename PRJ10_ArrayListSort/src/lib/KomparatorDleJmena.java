
package lib;

import firma.Zamnestnanec;
import java.util.Comparator;


public class KomparatorDleJmena implements Comparator<Zamnestnanec>{

    @Override
    public int compare(Zamnestnanec z1, Zamnestnanec z2) {
       
        return z1.getJmeno().compareTo(z2.getJmeno());
        
        
    }
    }
    

