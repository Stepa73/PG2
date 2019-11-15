package Farma;

public class Kocka implements IZvire{

    @Override
    public void strava() {
        System.out.print("Pije mléko");
    }

    @Override
    public void pohyb() {
        System.out.print(" a skáče po strmech.\n");
    }
    
}
