
package poly;


public class Zak {
   
    private String jmeno;
    private String trida;
    private int vek;
  
    public Zak(String jmeno, String trida, int vek) {
        this.jmeno = jmeno;
        this.trida = trida;
        this.vek = vek;
    }

    @Override
    public String toString() {
        return "Zak jméno " + jmeno+ ",třídy "+ trida + ",věk "+ vek+".";
    }

    
    
  
    public String getJmeno() {
        return jmeno;
    }

    public String getTrida() {
        return trida;
    }

    public int getVek() {
        return vek;
    }

    public void setJmeno(String jmeno) {
        this.jmeno = jmeno;
    }

    public void setTrida(String trida) {
        this.trida = trida;
    }

    public void setVek(int vek) {
        this.vek = vek;
    }
    
    
}
