
import java.util.SortedSet;
import java.util.TreeSet;


public class TreeSetDemo {

    public static void main(String[] args) {
       
        TreeSet<Double> ss = new TreeSet<>();
        
        ss.add(12.4);                       //seřadí od nejmenšího po největšího
        ss.add(200.4);
        ss.add(-0.000078);              //vypíše třeba 10 na -5
        ss.add(12.4);                       //znova se nevypíše protože 12,4 už tam jednou je
        
        System.out.println(ss);
        
        System.out.println("První prvek = " + ss.first());
        System.out.println("Poslední prvek = " + ss.last());
        
        System.out.println(ss.descendingSet());
        
        
                
           
    }
    
}
