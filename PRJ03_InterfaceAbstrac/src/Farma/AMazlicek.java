package Farma;

public abstract class AMazlicek implements IZvire {
    private String jmeno;
    int vek;

    public AMazlicek(String jmeno, int vek) {
        this.jmeno = jmeno;
        this.vek = vek;
    }
    
    protected abstract void ockovani(boolean stav);
    
    @Override
    public void krmeni() {
        System.out.println("Určitě něco žeru...");
    }

    @Override
    public void pohyb() {
        System.out.println("Občas se pohnu...");
    }

    @Override
    public void zvuk() {
        System.out.println("Vydávám zvuky...");
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
