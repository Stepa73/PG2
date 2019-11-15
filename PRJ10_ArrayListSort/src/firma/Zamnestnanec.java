package firma;


public class Zamnestnanec {
    
    private String jmeno;
    private double plat;

    public Zamnestnanec(String jmeno, double plat) {
        this.jmeno = jmeno;
        this.plat = plat;
    }

    @Override
    public String toString() {
        return "Zaměstnanec: " + "jméno = " + jmeno + ",\tplat = " + plat + " Kč";
    }
    
   

    public String getJmeno() {
        return this.jmeno;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public double getPlat() {
        return this.plat;
    }

    public void setPlat(double plat) {
        this.plat = plat;
    }
    
    
    
}
