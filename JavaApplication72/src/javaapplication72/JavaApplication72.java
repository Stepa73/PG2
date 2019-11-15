
package javaapplication72;

import java.util.Scanner;

/**
 *
 * @author stopk
 */
public class JavaApplication72 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner sc = new Scanner(System.in);
        System.out.println("Zadej čislo nasobilky");
        int cislo = sc.nextInt();
        System.out.println(cislo*1+","+cislo*2+","+cislo*3+","+cislo*4+","+cislo*5+","+cislo*6+","+cislo*7+","+cislo*8+","+cislo*9+","+cislo*10);
    }
    
}
