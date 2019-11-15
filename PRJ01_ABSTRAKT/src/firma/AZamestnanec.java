package firma;

public abstract class AZamestnanec {
    private String jmeno;
    private int vek;

    public AZamestnanec(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }

    //naše abstraktní metoda 
    public abstract void cinnost(); // pouze hlavička
    
    //,,, moje metoda
    public void hlaska() {
        System.out.println("Zdravim jmsenuji se "+this.jmeno+" a je mi "+this.vek+" let.");
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
    
    
    
}
