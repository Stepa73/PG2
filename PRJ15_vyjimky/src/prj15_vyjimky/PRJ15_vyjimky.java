
package prj15_vyjimky;
import java.util.*;

public class PRJ15_vyjimky {

   
    public static void main(String[] args) {
        // TODO code application logic here
        
      
        Scanner sc = new Scanner(System.in);
       
        try {
             System.out.println("Zadej dělenec: ");
            int delenec = sc.nextInt();
            System.out.println("Zadej delitel");
            int delitel = sc.nextInt();
            System.out.println(delenec+"/"+delitel + "="+ delenec/delitel);
        } catch (Exception e) {
            //e.printStackTrace();
            System.out.println("Problem: "+e.getMessage());
           
        }
        
        System.out.println("a program může pokračovat dál");
    }
    
}
