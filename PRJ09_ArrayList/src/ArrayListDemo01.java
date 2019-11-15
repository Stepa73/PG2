
import java.util.ArrayList;
import java.util.Iterator;

public class ArrayListDemo01 {

    
    public static void main(String[] args) {
        // TODO code application logic here
        
        ArrayList al = new ArrayList();
        
        al.add(1);                              //0
        al.add(12.54560);
        al.add("Ahoj");
        al.add("s");                         //3
        
        System.out.println(al);
      
        System.out.println("Element na indexu [2] = "+al.get(2));
         
        System.out.println("Je seznam prazdný = " + al.isEmpty());
        
        System.out.println("Velikost seznamu = " + al.size());
        
        //tisky
        //1 for cyklus
        
        for (int i = 0; i < al.size(); i++) {
            System.out.println(al.get(i));
            
        }
        


        //iterátor
        Iterator it = al.iterator();
        while (it.hasNext()) {
                System.out.print(it.next()+" ");
            
        }
    }
    
}
