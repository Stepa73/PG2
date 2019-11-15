import Farma.IZvire;
import Farma.Kocka;
import Farma.Kun;
import Farma.Pes;

public class DemoZvirata {

    public static void main(String[] args) {
        IZvire pes1 = new Pes("Alík", 6, 10.4, true);
        IZvire kocka1 = new Kocka("Mourek", 9, 11, "černá", true);
        IZvire kocka2 = new Kocka("ŤAPKA", 5, 5, "bílá", false);
        IZvire kun1 = new Kun("No time to lose", 10, 150, "šedá", true);
        IZvire kun2 = new Kun("No time to win", 15, 130, "černá", false);
        IZvire[] zvirata = {pes1,kocka1,kocka2,kun1,kun2};
        for (IZvire zvire : zvirata) {
            System.out.println(zvire.toString());
            zvire.pohyb();
            zvire.krmeni();
            zvire.zvuk();
            System.out.println("");
        }
    }
    
}
