package lib;

import firma.Zamnestnanec;
import java.util.Comparator;

//porovnávání dle platu
public class KomparatorDlePlatu implements Comparator<Zamnestnanec>{

    @Override
    public int compare(Zamnestnanec z1, Zamnestnanec z2) {
       if (z1.getPlat() > z2.getPlat() ){
           return 1;
       }else{
           return -1;
       }
       
      
    }
    
    
    }
    
    

