
import java.util.ArrayList;

import java.util.Collections;


public class ArrayListDemo02 {
   
    public static void main(String[] args) {
   
        //programování proti rozhraní a generický seznam
        ArrayList <String>al = new ArrayList<>();
        
        al.add("Java");
        al.add("C");
        al.add("PHP");
        al.add("C#");
        al.add("Kotlin");
        
        //tisk pomocí for e
        for (String a : al) {
            System.out.print(a+", ");
        }
        //kopie kolekce
        ArrayList copy = (ArrayList) al.clone();
        
        //třídění kopie Arrays.sort(pole); nebo s kolekcí Collections.sort(al);
        Collections.sort(copy);
        System.out.println("");
        copy.forEach((a) -> {
                System.out.println(a +", ");
        });
    
                }
        

}
