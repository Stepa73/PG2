
package loterie;

import java.util.Random;
import java.util.Set;


public class Losovani implements IStasnychDeset{

    private Set<Integer> tisk;
    private int pocetTahu;
    private Random ra;
        
   public Losovani(){
        this.tisk = ra.nextInt();
        this.tisk = new TreeSet<>;        
        
   }
    
    
   
    @Override
    public int losuj() {
       int cis = ra.nextInt(OSUDI) + 1;
       tisk.add(cis);
       return cis;
    }

    public Set<Integer> getTisk() {
        return tisk;
    }

   

    public int getPocetTahu() {
        return pocetTahu;
    }

    @Override
    public String toString() {
        return tisk +" " ;
    }

    
    
    
}
