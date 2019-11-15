
import java.util.InputMismatchException;
import java.util.Scanner;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Pavel Osinek
 */
public class VyjimkyDemo2_uloha {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        long delenec;
        long delitel;
        long pocitadlo = 0;
        
        //nekonečný for cyklus 
        
        for(;;){
            try {
                Scanner sc = new Scanner(System.in);
                System.out.println("dělenec: ");
                delenec = sc.nextLong();
                System.out.println("dělitel: ");
                delitel = sc.nextLong();
                
                System.out.println("Výsledek = "+delenec/delitel);
                
            } catch (ArithmeticException e) {
                pocitadlo++;
                System.out.println(pocitadlo + ". chyba! (dělení nulou)");
            } catch (InputMismatchException e) {
                pocitadlo++;
                System.out.println("Nezadali jste číslo.");
            } finally {
                if (pocitadlo>=3) {
                    System.out.println("Naučte se dělit...");
                    break;
                }
            }
       }
        System.out.println("Program může být ukončen.");
    }
    
}
