
package priklad4;

import java.util.Scanner;


public class Priklad4 {

   
    public static void main(String[] args) {
        
        Scanner sc = new Scanner (System.in);

int pocetRadku, pocetSloupcu;

System.out.println("zadej počet řádků:");
pocetRadku = sc.nextInt();

System.out.println("zadej počet sloupců:");
pocetSloupcu = sc.nextInt();

int[][] pole = new int[pocetRadku][pocetSloupcu];

for (int i = 0; i < pocetRadku; i++) {
    for (int j = 0; j < pocetSloupcu; j++){
        System.out.println("zadej hodnotu na indexu ["+i+","+j+"]");
        pole[i][j] = sc.nextInt();
    }
}
for (int i = 0; i < pocetRadku; i++) {
    System.out.print("\n");
    for (int j = 0; j < pocetSloupcu; j++){
        if(i<pocetSloupcu -1){
        System.out.print(pole[i][j]);
    }
    

}
}

    }}
