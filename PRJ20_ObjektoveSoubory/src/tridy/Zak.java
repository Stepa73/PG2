package tridy;
 
import java.io.Serializable;
 
public class Zak implements Serializable {
    private String jmeno;
    private int vek;
    private double prumer;
 
    public Zak(String jmeno, int vek, double prumer) {
        this.jmeno = jmeno;
        this.vek = vek;
        this.prumer = prumer;
    }
 
    public String getJmeno() {
        return jmeno;
    }
 
    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }
 
    public int getVek() {
        return vek;
    }
 
    public void setVek(int vek) {
        this.vek = vek;
    }
 
    public double getPrumer() {
        return prumer;
    }
 
    public void setPrumer(double prumer) {
        this.prumer = prumer;
    }
   
   
}
