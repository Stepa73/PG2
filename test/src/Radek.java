import java.util.Scanner;
import java.util.Random;

public class Radek {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String zivoty = "*****";
        String zivoty1 = "*****";
        int x = 1;
        int counter = 0;
        int a = 0;
        Random rand = new Random();
        while( x == 1){
             
             System.out.println("a:"+a);
            System.out.println("Jake je cislo");
            int cislo = sc.nextInt();
            int randomNum = rand.nextInt((/*max-min*/10-1)+1)/*+min*/+1;
            System.out.println("Číslo bylo : "+randomNum);
            
            if(cislo == randomNum){
                counter++;
                System.out.println("Správně, stav HP = "+ zivoty1+"spravně uhodnuto: "+ counter); 
            }else{
               a ++; 
                zivoty1 = zivoty.substring(a);
                System.out.println("Špatně, stav HP = "+zivoty1+" spravně uhodnuto: "+ counter);    
            }
            if(a == 5)
            {
                x = 0;
            }else{
            System.out.println("zadej jestli chceš pokračovat 1 ano 0 ne");
             x = sc.nextInt();}
        }
     System.out.println("Konec stav HP: "+zivoty1+"spravně uhodnuto: "+ counter);
    }

   
    
}
