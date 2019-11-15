
package Farma;


public class DemoZvirata {


    public static void main(String[] args) {
        IZvire k = new Kocka();
        IZvire p = new Papousek();
        System.out.println("Co to je ");
        
        k.strava();k.pohyb();p.strava();p.pohyb();
    }
    
}
