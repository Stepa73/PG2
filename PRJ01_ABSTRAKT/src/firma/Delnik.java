package firma;
//dědičnost dědí od zaměstnance 
public class Delnik extends AZamestnanec {

    public Delnik(String jmeno, int vek) {
        super(jmeno, vek);
    }

 

    @Override
    public void cinnost() {
            System.out.println("V naší šroubárně pracuji jako ďas. :D");
            System.out.println(" ");
    }

        
}
