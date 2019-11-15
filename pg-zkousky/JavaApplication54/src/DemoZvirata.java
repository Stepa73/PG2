import farma.IZvire;
import farma.Kocka;
import farma.Ovce;
import farma.Pes;

public class DemoZvirata {

    public static void main(String[] args) {
        IZvire pes1 = new Pes("Alík", 6, 10.4, true);
        IZvire kocka1 = new Kocka("Mourek", 9, 11, "černá", true);
        IZvire kocka2 = new Kocka("Micka", 5, 5, "bílá", true);
        IZvire ovce1 = new Ovce("Berta", 60, 15, "šedá", true);
        IZvire ovce2 = new Ovce("Aneta", 75, 13, "černá", true);
        IZvire[] zvirata = {pes1,kocka1,kocka2,ovce1,ovce2};
        for (IZvire zvire : zvirata) {
            System.out.println(zvire.toString());
            zvire.pohyb();
            zvire.krmeni();
            zvire.zvuk();
            System.out.println("");
        }
    }
    
}
